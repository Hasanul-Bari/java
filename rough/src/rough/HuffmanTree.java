/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.swing.JApplet;
import javax.swing.JFrame;


public class HuffmanTree {

	private Map<String, Integer> text;

	public HuffmanTree() {
		text = new HashMap<String, Integer>();
	}

	public void addElement(String c)
	{
		if( text.containsKey(c) )
		{
			text.put( c, text.get(c) + 1 );
		}
		else
		{
			text.put( c , 1 );
		}
	}
	public Node[] getList(){
		Node[] list = new Node[text.size()];

		int i = 0;
		for (String key: text.keySet()) {
			list[i] = new Node( key, text.get(key));
			i++;
		}
		return bubbleS(list);
	}

	public static String[] getCode(Node root) {
		if (root == null) return null;    
		String[] codes = new String[2 * 128];
		assignCode(root, codes);
		return codes;
	}

	public Tree encode(String text, String out_file)
	{
		for( int i = 0; i < text.length(); i++)
		{
			if( text.charAt(i) == '\n')
				addElement( "NEWLINE" );
			else if( text.charAt(i) == ' ')
				addElement( "SPACE" );
			else
				addElement( String.valueOf( text.charAt(i)) );
		}

		Tree result = buildTree();

		String[] huffman_codes = getCode( result.root );


		try{
			String huffman_encoding = "";

			for(int i=0; i< text.length(); i++)
			{
				huffman_encoding += huffman_codes[text.charAt(i)];
			}

			BufferedWriter out_huf = new BufferedWriter(new FileWriter("brisbon.huf"));
			for(Object key:this.text.keySet())
			{
				if( key.toString() == "NEWLINE")
					out_huf.write("NEWLINE"+" "+huffman_codes[  '\n'  ]+"\n");
				else if( key.toString() == "SPACE")
					out_huf.write("SPACE"+" "+huffman_codes[  ' '  ]+"\n");
				else
					out_huf.write(key+" "+huffman_codes[  key.toString().charAt(0)  ]+"\n");
			}
			out_huf.close();

			BufferedWriter out = new BufferedWriter(new FileWriter(out_file)); 
			out.write(huffman_encoding); 
			out.close(); 
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

		return result;
	}

	public char getASCIICode( String val )
	{
		if( val.equals( "NEWLINE" ) )
		{
			return ('\n');
		}
		else if( val.equals("SPACE") )
		{
			return (' ');
		}
		else
		{
			return val.charAt(0);
		}
	}

	public String decode(String bits, String huffman_codes_file, String out_file)
	{

		BufferedReader input;
		Map<String, Character> encoded_values = new HashMap<String, Character>();

		try {
			input = new BufferedReader(new FileReader(huffman_codes_file));

			String line = null;

			while( (line = input.readLine()) != null )
			{
				if( line != "" )
				{
					String[] values = line.split(" ");
					encoded_values.put(values[1], getASCIICode( values[0] ));
				}
			}

			input.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String result = "";  
		String current_code = "";

		for( int i = 0; i < bits.length(); i++) {

			current_code += bits.charAt(i);
			if( encoded_values.containsKey(current_code) )
			{
				result += encoded_values.get(current_code);
				current_code = "";
			}
		}

		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(out_file)); 
			out.write(result); 
			out.close(); 
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

		return result;
	}

	/* Recursively get codes to the leaf node */
	private static void assignCode(Node root, String[] codes) {
		if (root.left != null) {
			root.left.code = root.code + "0";
			assignCode(root.left, codes);

			root.right.code = root.code + "1";
			assignCode(root.right, codes);
		}
		else {
			if( root.character == "SPACE")
			{
				codes[(int)' '] = root.code;
			}
			else if( root.character == "NEWLINE")
			{
				codes[(int)'\n'] = root.code;
			}
			else
				codes[(int)root.character.charAt(0)] = root.code;
		}
	}

	public Node[] bubbleS(Node[] list) {
		int size = list.length;
		for (int iter=1; iter < size; iter++) 
		{  // count how many times
			// This next loop becomes shorter and shorter
			for (int i=0; i < size-iter; i++) 
			{
				if (list[i].frequency > list[i+1].frequency) 
				{
					// exchange elements
					Node temp = list[i];  
					list[i] = list[i+1];  
					list[i+1] = temp;
				}
			}
		}
		return list;
	}


	public Tree buildTree(){
		Node[] chars = getList();

		Heap<Tree> heap = new Heap<Tree>();

		for(int i = 0; i < chars.length; i++)
		{
			heap.add( new Tree( chars[i].character, chars[i].frequency));
		}

		//First deal with parentless nodes
		while( heap.getSize() > 1 )
		{
			Tree left = heap.remove();
			Tree right = heap.remove();

			heap.add(new Tree( left, right));
		}

		return heap.remove();
	}

	public String generateRandomFile(String file2write, int size)
	{
		int ASCII_POSSIBLE = 256;
		String result = "";
		Random gen = new Random();

		for( int i = 0; i < size; i++)
		{
			int val = gen.nextInt(ASCII_POSSIBLE);
			result += (char)(val);
		}

		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(file2write)); 
			out.write(result); 
			out.close(); 
		}
		catch( IOException ex)
		{
			ex.printStackTrace();
		}

		return file2write;
	}

	public enum OPERATION {
		ENCRYPT, DECRYPT, ENCODE, DECODE, ERROR, EXIT;
	}
	
	public static boolean checkCLIArgs(String[] cli_args)
	{
		//format
		
		return false;
	}

	public static void main(String[] args) {


		OPERATION op = OPERATION.ERROR;

		if( args.length < 1)
		{
			System.err.println("Please supply valid command line arguments.");
			return;
		}

		if( !checkCLIArgs(args) )
		{
			System.err.println("Please supply valid command line arguments.");
			System.out.println("USAGE: ");
			System.out.println("\t--encode Performs an encode of the files specified");
			System.out.println("\t\t --in supplied file name to encode, if genrated, generated text will be put here");
			System.out.println("\t\t gen [Optional] generate random ascii character file");
			System.out.println("\t--decode Performs a decode of the files specified");
			System.out.println("\t\t --in supplied file name to decode");
			System.out.println("\t\t --codefile supplied file name to import huffman codes to");
			return;
		}
		else
		{


			HuffmanTree tree = new HuffmanTree();
			Tree final_tree = null;

			switch( op )
			{
			case ENCODE:

				String file2encode = null;
				try{
					if( args.length == 4 && args[3].equals( "gen" ))
					{
						file2encode = tree.generateRandomFile(args[2], 500);
					}
					else
					{
						file2encode = args[2];
					}

					BufferedReader input =  new BufferedReader(new FileReader(file2encode));

					int just_read = -1;
					String text = "";
					//Read in all characters
					while( (just_read = input.read()) != -1 )
						text += (char)just_read;

					tree.encode(text, "brisbon.new");
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}

				break;
			case DECODE:
				String file2decode = args[2];
				String huffman_codes = args[4];
				try{
					BufferedReader input =  new BufferedReader(new FileReader(file2decode));
					int just_read = -1;

					String text = "";
					//Read in all characters
					while( (just_read = input.read()) != -1 )
						text += (char)just_read;
					input.close();

					tree.decode(text, huffman_codes, "brisbon_decompressed.txt");
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}

				break;

			case EXIT:
				System.out.println("SHUTTING DOWN NOW!");
				return;
			}
		}
	}
}
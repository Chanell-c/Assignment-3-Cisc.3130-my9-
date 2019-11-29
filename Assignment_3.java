import java.util.HashMap;
import java.io.*;
import java.util.*;
public class Assignment_3 {

	public static void main(String[]args)throws IOException{
		// TODO Auto-generated method stub

		File myfile = new File("lyrics.txt");
		Scanner input = new Scanner(myfile);
			//Read input from a file
		PrintWriter output = new PrintWriter("output.txt");	
		 	//write output to file
		
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		
		readData(data, input);
		
		for (Map.Entry<String,Integer> entry : data.entrySet()) {
			//for each entry within the data hashmap
		    String key = entry.getKey();
		    int value = entry.getValue();
		    output.printf("%-10s%-4s\n",key+":", value);
		}
		
		System.out.println("Program is complete.");
		
		input.close();
		output.close();
	}

	public static void readData(HashMap<String,Integer> data, Scanner input) {
		int value = 0;
		while (input.hasNext()){
			String word = input.next().toLowerCase();
			if(!data.containsKey(word)) {
				//if the word isn't located in the hashmap
				data.put(word,0);
				value = (int)data.get(word);
				value++;
				data.replace(word, value);
					//replace the old value with the incremented number of appearance
			}
			else {
				value = (int)data.get(word);
				value++;
				data.replace(word, value);	
			}
		}
			
	}
	
}

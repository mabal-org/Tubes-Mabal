package MaBal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class TubesMabal {
	
	public void Frequency() throws FileNotFoundException, IOException  {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			Map<String, Integer> frequency = new HashMap<>();
			
			String line = reader.readLine();
			
			// read the file line by line
			while(line != null) {
				
				//System.out.println("Processing line: " + line); to see the all the lines content in the file
				
				//Metode trim () di java memeriksa nilai Unicode sebelum dan setelah string, jika ada maka menghapus spasi dan mengembalikan string yang dihilangkan.
				//equals buat compare si katanya
				
				if(!line.trim().equals("")) {
					//bikin array buat nyimpen string hasil trim dinamain words, disini bakal di split
					String [] words = line.split(" ");
					
					for(String word : words) {
						if(word == null || word.trim().equals("")) {
							continue;
						}
						String processed = word.toLowerCase(); //bikin semua word nya dijadiin lowercase bisa uppercase jg bebas, biar nanti untuk kata yg berawalan huruf besar dan kecil akan terhitung sama
						processed = processed.replace(",", "");
						
						if(frequency.containsKey(processed)) {
							frequency.put(processed, 
									frequency.get(processed) + 1);
						} else {
							frequency.put(processed, 1);
						}
					}
				}
				
				line = reader.readLine();
			}
			
			
			System.out.println(frequency);
			
		}
		
	}
	public void FrequentlyWordUsed() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			Map<String, Integer> frequency = new HashMap<>();
			
			String line = reader.readLine();
			while(line != null) {
				//System.out.println("Processing line: " + line);
				
				if(!line.trim().equals("")) {
					String [] words = line.split(" ");
					
					for(String word : words) {
						if(word == null || word.trim().equals("")) {
							continue;
						}
						String processed = word.toLowerCase();
						processed = processed.replace(",", "");
						
						if(frequency.containsKey(processed)) {
							frequency.put(processed, 
									frequency.get(processed) + 1);
						} else {
							frequency.put(processed, 1);
						}
					}
				}
				
				line = reader.readLine();
			}
			
			int frequentlyUsed = 0;
			String theWord = null;
			
			for(String word : frequency.keySet()) {
				Integer theVal = frequency.get(word);
				if(theVal > frequentlyUsed) {
					frequentlyUsed = theVal;
					theWord = word;
				}
			}
			System.out.printf("the most frequently used word is '%s', %d times\n", 
					theWord, frequentlyUsed);
		}
		
	}
	public void CountAllWords() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line; 
			  
			// Initializing counters 

			int countAllWords = 0; 
			// Reading line by line from the  
			// file until a null is returned 
			
			while((line = reader.readLine()) != null) { //Read the content of the file, using the following while loop 
			    if(line.equals("")) 
			    { 
			        
			    } else { 
			        // \\s+ is the space delimiter in java 
			        String[] wordList = line.split("\\s+"); 
			          
			        countAllWords += wordList.length;

			    } 
			} 
			System.out.println("Total words count = " + countAllWords); 
		
		} 
    }
	public void CountCharacter() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line; 
			  
			// Initializing counters 
      
			int countCharacter = 0;
			// Reading line by line from the  
			// file until a null is returned 
			
			while((line = reader.readLine()) != null) { //Read the content of the file, using the following while loop 
			    if(line.equals("")) 
			    { 
			    } else { 
			        countCharacter += line.length(); 
			          
			      
			    } 
			} 
			  
			
			System.out.println("Total number of characters = " + countCharacter); 
		
		} 
    }
	public void CountSentence() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
		String line; 
		
			  
			// Initializing counters 
      
			int countSentence = 0; 
			// Reading line by line from the  
			// file until a null is returned 
			
			while((line = reader.readLine()) != null) { //Read the content of the file, using the following while loop 
			    if(line.equals("")) 
			    {
			    	
			    }else { 
			        // [!?.:]+ is the sentence delimiter in java 
			        String[] sentenceList = line.split("[!?.:]+,[/\n]"); 
			          
			        countSentence += sentenceList.length;
			    } 
			} 
			  
			System.out.println("Total number of sentences = " + countSentence); 
		} 
    }
	public void CountParagraph() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line; 
				  
			// Initializing counters 
	      
			int countParagraph = 1; 
			// Reading line by line from the  
			// file until a null is returned 
				
			while((line = reader.readLine()) != null) { //Read the content of the file, using the following while loop 
				if(line.equals("")) 
				{
					countParagraph++;
					}
				}
			System.out.println("Number of paragraphs = " + countParagraph);
			}
	    }
}
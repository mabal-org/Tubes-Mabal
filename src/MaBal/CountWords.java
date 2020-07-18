package MaBal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
	
	//constructor
	public static void Frequency() throws Exception {

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
			
			
			System.out.println(frequency);
			
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
	
	public static void main(String[] args) throws Exception {
		Frequency();
		
	}
}
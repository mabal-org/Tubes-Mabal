package MaBal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Frequency {
	
	public Frequency() throws FileNotFoundException, IOException  {
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
			
		}
		
	}
	
}
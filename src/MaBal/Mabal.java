package MaBal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Mabal {
	
	public static void FrequencyHashMap() throws FileNotFoundException, IOException  {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		int total = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			Map<String, Integer> map = new HashMap<>();
	       
			String line = reader.readLine(); //text bakal diread semua linesnya
			
			
			while(line != null) {
				
				if(!line.trim().equals("")) {
					
					String [] words = line.split(" ");
					for(String word : words) {
						if(word == null || word.trim().equals("")) { 
							continue;
							}
						String processed = word.toLowerCase(); 
						processed = processed.replace(",", "");
						
						if(map.containsKey(processed)) {
							map.put(processed, 
									map.get(processed) + 1);
							} else {
							map.put(processed, 1);
							}
						total++;
						}
					}
				line = reader.readLine();
				}
			map.entrySet().stream().forEach((entry) -> { 
				System.out.println(entry.getKey() + "\t" + "\t" + "=" + "  " + entry.getValue()); // \t : Is used to add tab. We can use this to print a tabulator.
				});
			System.out.println("Words count in a file: " + total);
			}
		}
	
	
	public static void FrequencyTreeMap() throws IOException {
		//construct
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		int total = 0;
        int i;
		String delimitter = "\\t|,|;|\\.|\\?|!|-|:|@\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/\"|\\+|\\=|\\”|\\“|\\\"|\\#|\\$|\\%|\\^|\\&|\\<|\\>|\\~|\\/|\\|\\[|\\'";
		
        try (Scanner reader = new Scanner(new FileReader(file))) {
        	TreeMap<String, Integer> frequency = new TreeMap<String, Integer>();
        	
        	//returns true if this scanner has another token in its input. 
            while (reader.hasNext()) { 
                String word = reader.next();
                String[] words = word.toLowerCase().split(delimitter);
                
                for (i = 0; i < words.length; i++) { 
                    if (words[i].equals("")) { 
                    } else { 
                        Integer count = frequency.get(words[i]);
                        if (frequency.containsKey(words[i])) { 
                            frequency.put(words[i], ++count); 
                        } else {
                            frequency.put(words[i], 1);
                        }
                        total++; 
                        }
                    }
				}
			frequency.entrySet().stream().forEach((entry) -> { 
				System.out.println(entry.getKey() + "\t" + "\t" + "=" + "  " + entry.getValue()); 
				});
			System.out.println("Words count in a file: " + total);
			}
    }

	public static void FrequentlyWordUsed() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		int frequentlyUsed = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) { //bufferedReader cuma bisa split pake satu spliter misalnya cuma bisa pake space aja atau comma aja
			TreeMap<String, Integer> frequency = new TreeMap<>();
			
			String theWord = null;
			
			String line = reader.readLine();
			while(line != null) {
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
					line = reader.readLine();
					for(String word : frequency.keySet()) {
						Integer theVal = frequency.get(word);
						if(theVal > frequentlyUsed) {
							frequentlyUsed = theVal;
							theWord = word;
							}
						}
					}
				}
			System.out.printf("the most frequently used word is '%s', %d times\n", 
					theWord, frequentlyUsed);
			}
		}
	
}
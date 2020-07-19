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
    
    
	public void FrequencyHashMap() throws FileNotFoundException, IOException  {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			Map<String, Integer> map = new HashMap<>();
	        int total = 0;
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
						if(word == null || word.trim().equals("")) { //sampai tidak ada lagi kata di line akan continue ke line selanjutnya
							continue;
						}
						String processed = word.toLowerCase(); //bikin semua word nya dijadiin lowercase bisa uppercase jg bebas, biar nanti untuk kata yg berawalan huruf besar dan kecil akan terhitung sama
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
			 map.entrySet().stream().forEach((entry) -> { // Mengambil semua key dan value yang ada di map dengan memakai loop forEach
				 System.out.println(entry.getKey() + "\t" + "\t" + "=" + "  " + entry.getValue()); // \t : Is used to add tab. We can use this to print a tabulator.
	        	});
		        System.out.println("Total Kata di Dalam File : " + total);
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
	
	public void FrequencyTreeMap() throws FileNotFoundException {
		// Menggunakan Tree Map sebagai Struktur Data karena memiliki Ascending dan juga mendapatkan Valuenya
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        int total = 0;
        int i;
        // Mensplit operator yang tidak perlu
        String delimitter = "[!?.:]+,[/\\n]";

        // Menscan dan membuka + membaca File
        File file = new File("D:\\Tubes-Mabal\\test.txt");
        try (Scanner txtfile = new Scanner(new FileReader(file))) { //filereader untuk baca object dari file (path ke filenya)
        	
            while (txtfile.hasNext()) { // Mengecek Kondisi apakah terdapat elemen selanjutnya atau tidak
                String word = txtfile.next(); // Menjadikan text file dibagi per kata
                String[] words = word.toLowerCase().split(delimitter); //Fungsi untuk mensplit (delimiter) operator di dalam text file
                
                for (i = 0; i < words.length; i++) { // Looping untuk panjang kata
                    if (words[i].equals("")) { // Mengecek apakah text file sudah di akhir
                    } else { // Jika tidak maka hitung
                        Integer count = map.get(words[i]);
                        if (map.containsKey(words[i])) { //mengembalikan nilai boolean true jika map memiliki kunci yang merujuk pada suatu nilai( words[i] ).
                            map.put(words[i], ++count); // menggunakan fungsi put untuk mengisi key dan value nya
                        } else {
                            map.put(words[i], 1);
                        }
                        total++; // Menghitung total seluruh kata 
                        }
                    }
                }
            }
        map.entrySet().stream().forEach((entry) -> { // Mengambil semua key dan value yang ada di map dengan memakai loop forEach
        	System.out.println(entry.getKey() + "\t" + "\t" + "=" + "  " + entry.getValue()); // \t : Is used to add tab. We can use this to print a tabulator.
        	});
        
        System.out.println("====================================");
        System.out.println("Total Kata di Dalam File : " + total);
    }
}
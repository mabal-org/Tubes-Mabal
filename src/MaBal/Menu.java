package MaBal;

import java.util.Scanner;

public class Menu{
	private Scanner key;

	public Menu() {
		key=new Scanner(System.in);
	}
	
	@SuppressWarnings("unused")
	public void mainMenu() throws Exception {

        int menu;
        System.out.println("----------MENU----------- ");
        System.out.println("1. Words Frequency in A File Text Using HashMap ");
        System.out.println("2. Words Frequency in A File Text Using TreeMap ");
        System.out.println("3. Most Frequently Used Word");
        System.out.println("0.Exit");
        
        System.out.print("To choose input the number : ");
        menu = key.nextInt();
        
        if(menu==0){
        	System.out.println("GoodBye~ :'(\n");
        	System.exit(0);
        	}
        else if(menu==2){
        	CountParagraph countParagraph = new CountParagraph();
        	mainMenu();
        	}
        else if(menu==3){
        	CountSentence countSentence = new CountSentence();
        	mainMenu();
        }
        else if(menu==4){
        	CountAllWords countAllWords = new CountAllWords();
        	mainMenu();
        }
        else if(menu==5){
        	CountCharacter countCharacter = new CountCharacter();
        	mainMenu();
        }
        else if(menu==1){
        	FrequencyHashMap frequency = new FrequencyHashMap();
        	mainMenu();
        }
        else if(menu==7){
        	FrequentlyWordUsed frequentlyWordUsed = new FrequentlyWordUsed();        	
        	mainMenu();
        }
    }

}
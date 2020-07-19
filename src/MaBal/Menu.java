package MaBal;

import java.util.Scanner;

public class Menu{
	private Scanner key;
	private Mabal mabal;
	
	public Menu() {
		key=new Scanner(System.in);
	}
	
	public void mainMenu() throws Exception {

        int menu;
        System.out.println("----------MENU----------- ");
        System.out.println("1. Words frequency using HashMap ");
        System.out.println("2. Words frequency using TreeMap ");
        System.out.println("3. Word most frequently used ");
        System.out.println("0.Exit");
        
        System.out.print("To choose input the number : ");
        menu = key.nextInt();
        
        if(menu==0){
        	System.out.println("GoodBye~ :'(\n");
        	System.exit(0);
        	}
        else if(menu==1){
        	mabal.FrequencyHashMap();
        	mainMenu();
        	}
        else if(menu==2){
        	mabal.FrequencyTreeMap();
        	mainMenu();
        	}
        else if(menu==3){
        	mabal.FrequentlyWordUsed();
        	mainMenu();
        
        }
    }

}
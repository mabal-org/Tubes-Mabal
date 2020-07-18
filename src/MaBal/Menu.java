package MaBal;

import java.util.Scanner;

public class Menu{
	private Scanner key;

	public Menu() {
		key=new Scanner(System.in);
	}
	
	public void mainMenu(CountWords countwords, TextSpecification textspec) {
		// TODO Auto-generated method stub
        int menu;
        
	 System.out.println("1. Add File"); //ambil dari countwords
     System.out.println("2. Count Pargapraph"); //dari text
     System.out.println("3. Count Senteces"); //dari text
     System.out.println("4. Count Words"); //dari text
     System.out.println("5. Count Characters"); //dari text
     System.out.println("6. Count Each Words"); //dari countwords
     System.out.println("7. Most Frequently Used Word"); //dari countwords
     System.out.println("0.Exit");
     
     System.out.print("To choose input the number : ");
     menu = key.nextInt();
     
     if(menu==0){
         System.exit(0);
     }
     else if(menu==1){
    	 System.out.println("The file already inputted\n");
    	 //ngasi liat hasil dari processing lines
     }
     else if(menu==2){
         this.paragraph(textspec);
     }
     else if(menu==3){
         this.frequency(countwords);
     }
     else if(menu==4){
         this.frequency(countwords);
     }
     else if(menu==5){
         this.frequency(countwords);
     }
     else if(menu==6){
         this.frequentlyUsed(countwords);
     }
     else if(menu==7){
         this.frequentlyUsed(countwords);
     }
     else{
         
     }
    }

	private void paragraph(TextSpecification textspec) {
		// TODO Auto-generated method stub
		
	}

	private void frequentlyUsed(CountWords countwords) {
		// TODO Auto-generated method stub
		
	}

	private void frequency(CountWords countwords) {
		// TODO Auto-generated method stub
		
	}

	
}
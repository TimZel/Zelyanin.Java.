package tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("введите Ваше имя:");
    String name = console.nextLine();
	 if (name.equals("Вячеслав")) {
	 	System.out.println("Привет, " + name);
	 } else { 
	 	System.out.println("Нет такого имени!" + "\n" + 
	    	            	   "введите Ваше имя:");
	 	output(name);
	 }
    console.close();     
    }
    public static void output(String name) {
    Scanner consoleNext = new Scanner(System.in);
         while(consoleNext.hasNextLine()) {
         name = consoleNext.nextLine();
         	if (name.equals("Вячеслав")) {
            	    System.out.println("Привет, " + name);
            	    break;
            	} else {
            	    System.out.println("Такого имени нет!" + "\n" + 
            	                       "введите Ваше имя:");
            	}   
         }
    consoleNext.close();   	
    }    
}  

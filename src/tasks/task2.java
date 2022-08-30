package tasks;

import java.util.Scanner;

public class task2
{
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введите Ваше имя");
        String name = console.next();
        console.close();
        if (name.equals("Вячеслав")) {
	        System.out.println("Привет, " + name);
        } else { 
            System.out.println("Нет такого имени");
        }
        console.close();
    }
}      
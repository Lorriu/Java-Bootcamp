

import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        // String stays on one line
        System.out.print("I made this today!");

        // Println makes the String have its own line
        System.out.println("I made this today!");

        // Println and the \n adds an extra empty line or you can print and \n for its own line
        System.out.println("I made this today!\n");    

        // adding \t creates a tab
        System.out.println("\tI made this today!");

        //CREATING A VARIABLE
        // First declare it 
        int x;

        //then assign the variable
        x = 123;

        //or you can do this in one step which is called initilization 
        int y = 1234;

        //Showing output
        System.out.println(x);
        System.out.println(y);


        //to store numners wuth decimal places use a double
        double z = 3.23;

        System.out.println("Number is " + z);

        //boolean to ask true or false questions 
        boolean s = true;

        System.out.println(s);

        //use char for single charachers, must use straight braces 
        char symbol = '@'; 

        System.out.println(symbol);

        //String has to be capital as its a reference not a primative

        String name = "Lorraine";

        System.out.println(name);

        //USER INPUT, using a scanner, first add the scanner 
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String nameInput = scanner.nextLine();

        System.out.println("Hello "+ nameInput);

        //for numbers you use the same method but instead use nextInt() as they need to match the data type
        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("Hello " + nameInput + " you are " + age + " years old");


    }

}

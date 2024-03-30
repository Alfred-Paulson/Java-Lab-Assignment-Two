package Griffith;

//Alfred Paulson - 3128256


//Made a simple calculator of basic arithmetic operations
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result ;

        System.out.println("Commands: Add,Sub,Div");
        String command = input.next();

        System.out.print("Enter two numbers:  ");
        int num1 =  input.nextInt();
        int num2 =  input.nextInt();

        if(command.equals("add")|| command.equals("Add")){
            result = num1+num2;
            System.out.println(command+" "+num1+" + "+num2);
            System.out.println("Result: "+result);

        } else if (command.equals("sub")||command.equals("Sub")) {
            result = num1 - num2;
            System.out.println(command+" "+num1+" - "+num2);
            System.out.println("Result : "+result);
        } else if (command.equals("div")|| command.equals("Div")) {
            result = num1/num2;
            System.out.println(command+" "+num1+" / "+num2);
            System.out.println("Result : "+result);
        }
        else {
            System.out.println("Invalid command");
        }


    }
}

//Alfred Paulson - 3128256
//Encoding a word using Caesar Cipher

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of positions to shift :  ");
        int position_shift = input.nextInt();

        System.out.print("Enter a word to shift : ");
        String word = input.next();
        int i = 0;

        while (i < word.length()){
            char encode_word = word.charAt(i);
            int ascii_value = (int) encode_word;
            int shifted_position =ascii_value + position_shift;
            char decoded_word = (char)shifted_position;
            if (decoded_word > 'z') {
                decoded_word = (char) ('a' + (shifted_position - 'z' - 1));
            } else if (decoded_word>'Z') {
                decoded_word = (char) ('A'+(shifted_position - 'Z' -1));

            }
            System.out.print(decoded_word);
            i++;
        }


    }
}

//Alfred Paulson - 3128256
//Made a finding the letter game

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int letter = (int)(Math.random()*26);
        char target_letter = (char) ('a' + letter);
        int attempts = 0;

        while(true){
            System.out.println("Enter a guess : ");
            char guess = input.next().charAt(0);
            attempts ++;

            if(guess == target_letter){
                System.out.println("Correct");
                System.out.println("You guessed the letter in "+attempts);
                break;
            } else if (Math.abs(guess-target_letter)<=2) {
                System.out.println("Warm");

            } else if (Math.abs(guess - target_letter)==1) {
                System.out.println("Hot");
            }else {
                System.out.println("Cold");
            }
        }

    }
}


//Alfred Paulson - 3128256
//Made  a program for printing pattern according to users  choice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a pattern : ");
        String pattern  = input.next();

        System.out.print("Enter a start amount : ");
        int start_amount = input.nextInt();

        System.out.print("Enter an end amount : " );
        int end_amount = input.nextInt();

        for (int i = start_amount; i<=end_amount;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(pattern+" ");

            }
            System.out.println();
        }
    }

}



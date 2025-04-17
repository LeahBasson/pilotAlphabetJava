package pilotalphabet;

import java.util.Scanner;

public class PilotAlphabet {

    public static void main(String[] args) {
        // User should type in an alphabetic character.
        // Display the corresponding aviation/pilot name for that character.

        Scanner scn = new Scanner(System.in);

        System.out.println("Please type in an alphabetical character (A – Z): ");
        char character = scn.next().charAt(0);

        char letter = Character.toUpperCase(character);

        switch (letter) {
            case 'A':
                System.out.println("A is Alpha");
                break;
            case 'B':
                System.out.println("B is Bravo");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Delta");
                break;
            case 'E':
                System.out.println("E is Echo");
                break;
            case 'F':
                System.out.println("F is Foxtrot");
                break;
            case 'G':
                System.out.println("G is Golf");
                break;
            case 'H':
                System.out.println("H is Hotel");
                break;
            case 'I':
                System.out.println("I is India");
                break;
            case 'J':
                System.out.println("J is Juilett");
                break;
            case 'K':
                System.out.println("K is Kilo");
                break;
            case 'L':
                System.out.println("L is Lima");
                break;
            case 'M':
                System.out.println("M is Mike");
                break;
            case 'N':
                System.out.println("N is November");
                break;   
            case 'O':
                System.out.println("O is Oscar");
                break; 
            case 'P':
                System.out.println("P is Papa");
                break;
            default: System.out.println("I don’t know that one yet");
        }

    }

}

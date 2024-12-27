/*Create a program that takes a single alphabet character from the 
user and uses a switch statement 
to check if it is a vowel or consonant. */

import java.util.Scanner;
class VowelorConsonant{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the alphabet you want to check: ");
            char a = s.next().charAt(0);
            switch(a){
                case 'A':
                case 'a':
                    System.out.println(a + " Is a Vowel.");
                break;
                case 'E':
                case 'e':
                    System.out.println(a + " Is a Vowel.");
                break;
                case 'I':
                case 'i':
                    System.out.println(a + " Is a Vowel.");
                break;
                case 'O':
                case 'o':
                    System.out.println(a + " Is a Vowel.");
                break;
                case 'U':
                case 'u':
                    System.out.println(a + " Is a Vowel.");
                break;
                case '1':
                    System.exit(0);
                break;
                default:
                System.out.println(a + " Is Consonent");
                break;

            }
        }
    }
}
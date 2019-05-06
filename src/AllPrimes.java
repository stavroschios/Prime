/**
 * This different Prime calculator, identifies if the number entered is one
 * of the following ( by replying with true or false):
 * 1.Prime
 * 2.Emirp (opposite of prime)
 * 3.Palindromic prime
 * 4.Mersenne
 * 5.Twin Primes
 *
 * @author Stavros Pachoundakis
 * @version 1.0
 * @since 2019-03-27
 *
 */


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Stavros Pachoundakis
 */

public class AllPrimes {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        System.out.println("Select one of the following:");
        menu();
        choice();


    } // end main

    public static void choice() {

        Scanner keyb = new Scanner(System.in);
        do {
            try {
                switch (keyb.nextInt()) {
                    case 1:
                        System.out.println("IsPrime");
                        System.out.println("Enter a prime number:");
                        int selection1 = keyb.nextInt();
                        System.out.println(isPrime(selection1));
                        System.exit(0);
                        break;
                    case 2:
                        System.out.println("Emirp");
                        System.out.println("Enter an emirp number:");
                        int selection2 = keyb.nextInt();
                        System.out.println(isEmirp(selection2));
                        System.exit(0);
                        break;
                    case 3:
                        System.out.println("Palindromic");
                        System.out.println("Enter a palindromic number:");
                        int selection3 = keyb.nextInt();
                        System.out.println(isPalindrome(selection3));
                        System.exit(0);
                        break;
                    case 4:
                        System.out.println("Mersenne");
                        System.out.println("Enter a mersenne number:");
                        int selection4 = keyb.nextInt();
                        System.out.println(isMersenne(selection4));
                        System.exit(0);
                        break;
                    case 5:
                        System.out.println("Twin Primes");
                        System.out.println("Enter two twin prime numbers:");
                        int selection5 = keyb.nextInt();
                        int selection6 = keyb.nextInt();
                        System.out.println(isTwinPrime(selection5, selection6));
                        System.exit(0);
                        break;
                    case 6:
                        System.out.println("Now exiting...");
                        System.exit(0);
                    default:
                        System.exit(0);
                        break;
                } // end switch

            } // end try

            catch(InputMismatchException e) {

                System.out.println("Error! Enter an integer ...");

            } // end catch

        } while ((keyb.hasNextInt()) & (!keyb.hasNextLine()));  // end do while

    } // end choice

    public static void menu(){

        System.out.println("1.Prime");
        System.out.println("2.Emirp");
        System.out.println("3.Palindromic prime");
        System.out.println("4.Mersenne");
        System.out.println("5.Twin Primes");
        System.out.println("6.Quit menu");

    } // end menu

    /**
     *
     * @param n
     * @return Prime
     */

    public static boolean isPrime(int n) {
        if( (number == 1) || (number == 0) ) {
            return false;

        }

        for (int i=2; i < n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }  // end isPrime

    /**
     *
     * @param n
     * @return Emirp
     */

    public static boolean isEmirp(int n) {
        if ( isPrime(n) == false) {
            return false;
        }

        int reverse = 0;

        while (n !=0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n /= 10;
        }
        return isPrime(reverse);

    } // end isEmirp

    /**
     *
     * @param n
     * @return Palindrome
     */

    public static boolean isPalindrome(int number) {


         int reverse = 0;
        if(number < 0){
            number *= -1;
        }
        int num = number;
        while(num > 0) {
            int lastdigit = num % 10;
            reverse *= 10;
            reverse += lastdigit;
            num /= 10;
        }
       // System.out.println("The reverse is >> " + reverse);
        // System.out.println("The palindrome number is >> " + number);
        if(reverse == number) {
            return true;
        } else {
            return false;
        }
    
    } // end isPalindrome


    /**
     *
     * @param n1
     * @param n2
     * @return Twin Primes
     */

    static boolean isTwinPrime(int n1,int n2){

        if(isPrime(n1) && isPrime(n2) && Math.abs(n1 - n2) == 2) {
            return true;
        } else {
            return false;
        }
    } // end isTwinPrime

    /**
     *
     * @param n
     * @return Mersene
     */

    static boolean isMersenne(int n){

        int counter = 0;

        for (int i = 2;; i++) {
            int val = (int) Math.pow(2, i) - 1;
            if (isPrime(val)) {
                return true;
            } else {
                return false;

            }
        }
    } // end isMersenne

}  // end AllPrimes

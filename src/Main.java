import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating scanner class


        Scanner input = new Scanner(System.in);

        // Generate the random number

        int num =(int)(Math.random()*10+1);
        int numberGuess=3;
        int Guess;

        // while loop


        while (numberGuess>0){

            System.out.println("Guess a number between 1 and  10:");
            Guess=input.nextInt();


            if (Guess==num) {

                System.out.println("Congrats !! The number was  " + num);
            }else if (Guess<num){

                    System.out.println("Too low.");

            }

            else {

                System.out.println("Too High.");

            }

            numberGuess--;

            if (numberGuess==0){

                System.out.println("You run out of Guess !! Please try again later !! The number was"+num);
            }

            else {


            }
        }



    }
}
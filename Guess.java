import java.util.Scanner;

public class Guess {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int randomNum= (int)(Math.random()*100);
        int userNum=0;

       do{
        System.out.println("Enter your number to see if you guessed correctly.");
        userNum=sc.nextInt();
        if (randomNum==userNum) {
            System.out.println("You guessed correctly");
            break; 
        }
        else if (randomNum>userNum) {
            System.out.println("Guess a bigger value");
       } 
        else{
            System.out.println("Guess a smaller value ");
        }
    } while(userNum>=0);
        System.out.println("The number was");
        System.out.println(randomNum);
    } 

    }

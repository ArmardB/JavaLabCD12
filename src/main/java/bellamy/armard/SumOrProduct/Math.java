package bellamy.armard.SumOrProduct;
import java.util.Scanner;

/**
 * Created by armardbellamy on 9/9/16.
 */
public class Math {

    static Scanner scanner = new Scanner(System.in);
    static int baseCount = 0;
    static int numberFromUser;
    static String userOperatorChoice;

    public void getInfoFromUser(){
        System.out.println("Welcome to the Product or Sum calculator.");
        System.out.print("Please enter an integer: ");

        try {
            numberFromUser = scanner.nextInt();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.print("Choose \"product\" or \"sum\": ");
        userOperatorChoice = scanner.next().toLowerCase();
    }

     public int product(int number){
        if (number == 1) {
           return 1;
       } else {
           return number * product(number - 1);
       }
    }

    public void sum(){
        for (int i = 1; i <= numberFromUser; i++ ){
            baseCount += i;
        }
        System.out.println(baseCount);
    }

    public static void main(String[] args){

        Math math = new Math();
        math.getInfoFromUser();

        if (userOperatorChoice.equals("product")){
            int userGuess = math.product(numberFromUser);
            System.out.println(userGuess);
        } else if (userOperatorChoice.equals("sum")){
            math.sum();
        }





    }
}

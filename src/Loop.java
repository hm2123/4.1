import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 Creator: Hamid Majeed
 11/08/2017
 hm2123@email.vccs.edu
 The purpose of this program is to loop to solve math problems
 */


public class Loop extends Application {
    public void start (Stage primaryStage){

        // Allow text to be input into the program and a responce/Output

        TextInputDialog input = new TextInputDialog();
        Alert output = new Alert(AlertType.INFORMATION);
        int number;
        do {
            input.setTitle("The Magic Math Looper 5000!");
            input.setHeaderText("Please plug in the integer of your choice then sit back and watch the magic happen");
            input.showAndWait();
            number = Integer.parseInt(input.getResult()); // get input from user
            if (number<0){
                output.setTitle("Opps an Error must have taken place");
                output.setContentText("Don't be negative! Please enter a positive integer :)");
                output.showAndWait();
            }
            //





        }while(number<0);
        int count = number; // this will let user input be used for all applications
        int factorial = number; //user input equals the initial factorial
        int odd=0; // set inital odd = 0
        int oddCount; // odd number count variable
        int fib1 = 0; // fibonacci number value
        int fib2 = 1;
        int fibonacci=0;

        if (count==0){
            factorial = 1;
        }else{
            while (count>1){
                factorial = factorial *(count-1);
                count--;
            }
        }


        //find highest number from input of the user


        if (number%2==0){
            oddCount = number-1;
        } else {
            oddCount = number;
        }


        //adds all numbers starting from the highest user input


        for (count=oddCount;count>0;count=count-2){
            odd=odd+count;
        }


        //to get fibonacci number



        for (count=number;count>0;count--){
            fibonacci = fib1+fib2;
            fib2= fib1;
            fib1=fibonacci;
        }


        output.setTitle("Factorial");
        output.setContentText("The Factorial of " + number + " is " + factorial);
        output.showAndWait();
        output.setTitle("Odd Numbers");
        output.setContentText("The sum of all odd numbers within " + number + " is " + odd);
        output.showAndWait();
        output.setTitle("Fibonacci Number");
        output.setContentText("The Fibonacci number of " + number + " is " + fibonacci);
        output.showAndWait();
    }

}
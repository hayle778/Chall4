import java.util.Scanner;

/*
.Create the user to add the input following the question of the Raven either positive or negative
.use array for listing the users emotion following using the String variable
.use for loops for the add inputs and while loop for a list with boolean
.if the positive word is greater than a negative word print out "I`m so happy", if it is equal print
"meh", if it less use the string "tell me more"
.at the end of the program if the user want to add more answer the out would be "keep talking" or else press "Q" to quit
.After the input is done print(display)the chat history.
*/
public class Conversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] ALL = {"positive", "negative"};
        String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        String[] negative = {"bad", "sad", "tired", "angery", "anxious", "hungry", "moody", "afraid"};
        String positivex = "";
        String negativex = "";
        int h = 0;
        int y = 0;

        boolean list = true;
        while (list) {

            System.out.println("Good morning, how are you feeling today?");
            String Al = input.nextLine();
            System.out.println("I am so happy for you...yay");
            String pos = input.nextLine();
            System.out.println("really! why tell me more");
            String neg = input.nextLine();
            System.out.println("meh");
            String neu = input.nextLine();
            System.out.println("Do you want to keep talking?");
            String name = input.nextLine();
            if (name.equals("yes")) {

                list = true;
            } else {
                list = false;
            }


            System.out.println("....****......");
        }
        for (String m : ALL) {
                System.out.println(m);
            }




    }
}
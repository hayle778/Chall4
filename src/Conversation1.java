import java.util.ArrayList;
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
public class Conversation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        String emotions, returnRaven;
        ArrayList<String> Response = new ArrayList<>();

        String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

       // int h = 0;
       // int y = 0;
        String firstconversation = " Good morning! are you ready to do something ? (press Q to quit)";
        System.out.println(firstconversation);

           //boolean quit = false;
        while (!quit) {
            emotions = input.nextLine();
            if (emotions.equalsIgnoreCase("Q")) {
                quit = true;
            }
           // returnRaven= ravenResponse(positive, negative, emotions);


            returnRaven = ravenResponse(positive, negative, emotions);
            System.out.println(returnRaven);
            Response.add("User:" + emotions);
            Response.add("Raven:" + returnRaven);
        }
           // boolean response = true;
            // boolean list = true;angry
      //      while (response) {

                //  System.out.println("Good morning, how are you feeling today?");
                //  String Al = input.nextLine();

            /*    System.out.println("I am so happy for you...yay");
                String pos = input.nextLine();
                System.out.println("really! why tell me more");

                String neg = input.nextLine();
                System.out.println("meh");
                String neu = input.nextLine();
                System.out.println("Do you want to keep talking?");
                String name = input.nextLine();
*/
//                if (name.equals("yes")) {
//
//                    response = true;
//                } else {
//                    response = false;
//                }


                System.out.println("....****......");


           // }
        for (String M : Response) {
            System.out.println(M);
        }
    }


    private static String ravenResponse(String[] positive, String[] negative, String emotions) {

        //   String = emotions;
        // return emotions;
        //  int x = 0;
        int pos = 0;
        int neg = 0;
        int emotion = 0; // changed
        for (int i = 0; i < positive.length; i++) {
            if (emotions.contains(positive[i])) {
                pos++;

            } else if (emotions.contains(negative[i])) {
                neg++;
            }

        }
        if (pos > neg) {
                    return "I`m so happy for you !";
                }
        else if (pos < neg) {
                    return "Really, why tell me more!";
                }
        else {
                    return "Meh";
                }
            }

    }






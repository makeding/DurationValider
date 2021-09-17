package moe.huggy.durationvalider;


import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x to quit.");
        boolean exitFlag = false;
        while (!exitFlag){
            System.out.print("Enter Duration:");
            String text = in.nextLine();
            if(text.equals("x")){
                exitFlag = true;
            }
            if(!exitFlag){
                try {
                    Duration result = Duration.parse(text);
                    System.out.println(text + "(" + result + ") ok");
                } catch (Exception e){
                    System.out.println(text + " is a error duration format");
                }
            }
        }
    }
}

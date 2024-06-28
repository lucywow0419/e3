import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("> ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        String[] status = {"Heads", "Tails"};
        int hCount = 0;
        int tCount = 0;
        Random r = new Random();

        System.out.println("Tossing a coin...");
        for(int i=0; i<3; i++){
            String s = status[r.nextInt(2)];
            System.out.print("Round " + (i+1) + ": ");
            System.out.println(s);
            if(s == "Heads"){
                hCount++;
            } else {
                tCount++;
            }
        }
        System.out.println("Heads: " + hCount + ", Tails: " + tCount);
        if(hCount >= 2){
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
        sc.close();

    }
}

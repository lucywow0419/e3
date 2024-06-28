import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args){

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

    }
}

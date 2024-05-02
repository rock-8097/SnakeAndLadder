import java.util.Random;

public class SnakeAndLadder {
    public static Random rand = new Random();
    public static void main(String[] args){
        System.out.println("Welcome to Snake and ladder Simulation");
        int player1 = 0;// First Player was created
        // Generate a random number between 1 and 6
        int dice = rand.nextInt(6) + 1;
        System.out.println(player1+dice);
    }
   
}

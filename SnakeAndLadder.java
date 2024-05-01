import java.util.Random;

public class SnakeAndLadder {
    public static Random rand = new Random();
    public static void main(String[] args){
        System.out.println("Welcome to Snake and ladder Simulation");
        int player1 = 0;// First Player was created
        int poss = positionChangeOrNot(player1);// call function position
        // Generate a random number between 1 and 6
        int dice = rand.nextInt(6) + 1;
        if (poss==1){
            // If we get Snake then Subtract with dice number
            player1 = player1 - dice;
        }else if(poss==2){
            // If we get Snake then Add with dice number
            player1 = player1 + dice;
        }
        System.out.println(player1);
    }
    public static int positionChangeOrNot(int x){
        // Generating Randome number for NO Play, Snake and Lader
        int possition = rand.nextInt(3);
        switch (possition) {
            case 0:
                System.out.println("No Play");
                break;
            case 1:
                System.out.println("Snake");
                break;
            case 2:
                System.out.println("Ladder");
                break;
            default:
                break;
        }
        return possition;
    }
}

import java.util.Random;

public class SnakeAndLadder {
    public static Random rand = new Random();
    public static void main(String[] args){
        System.out.println("Welcome to Snake and ladder Simulation");
        int player1 = 0;// First Player was created
        while(player1<=100){//loop to player reach 100 position
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
            // to get perfect 100 position to player
            if (player1>100){
                player1 = player1 - dice;
            }
            else if (player1==100){
                System.out.print(player1+"\t");
                break;
            }
            System.out.print(player1+"\t");
        }
    }
    public static int positionChangeOrNot(int x){
        // Generating Randome number for NO Play, Snake and Lader
        int possition = rand.nextInt(3);
        switch (possition) {
            case 0:
                System.out.print("No Play\t");
                break;
            case 1:
                System.out.print("Snake\t");
                break;
            case 2:
                System.out.print("Ladder\t");
                break;
            default:
                break;
        }
        return possition;
    }
}

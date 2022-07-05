public class datatype
{
    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if(playerScore > 1000)
        {
            return 1;
        }
        else if(playerScore > 500 && playerScore < 1000)
        {
            return 2;
        }
        else if(playerScore > 100 && playerScore < 500)
        {
            return 3;
        }

        return 4;
    }
    public static void main(String[] args)
    {
        String playerName = "John";

        int playerScore = 1500;

        int position = calculateHighScorePosition(playerScore);

        displayHighScorePosition(playerName, position);

        System.out.println("---------------------");

        int playerScore1 = 900;

        int position1 = calculateHighScorePosition(playerScore1);

        displayHighScorePosition(playerName, position1);

        System.out.println("---------------------");

        int playerScore2 = 400;

        int position2 = calculateHighScorePosition(playerScore2);

        displayHighScorePosition(playerName, position2);

        System.out.println("---------------------");

        int playerScore3 = 50;

        int position3 = calculateHighScorePosition(playerScore3);

        displayHighScorePosition(playerName, position3);

        System.out.println("---------------------");
    }
}
public class DemoMethod1 {

    public static void main(String[] args) {

        int score = calculateHighScore(12983);
        displayHighScorePosition("messi", score);

         score = calculateHighScore(-100);
        displayHighScorePosition("roger", score);

         score = calculateHighScore(300);
        displayHighScorePosition("Ali", score);


    }

    public static void displayHighScorePosition(String playerName , int playersPosition){

        System.out.println( playerName + " managed to get into position  " +
                playersPosition + "  on the high score list");

    }

    public static int calculateHighScore(int playerScore){
        int result =4;

        if(playerScore >= 1000) {
            result = 1;
        }else if (playerScore >= 500) {
                result = 2;
            }else if (playerScore >= 100) {
                    result = 3;
                }

        return result;
    }

}

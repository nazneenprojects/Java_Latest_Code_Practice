    public class ScoreDemo {
        public static void main(String[] args) {
            int highScore = 50;

            if(highScore > 25)
            {
                highScore = 1000 + highScore;
                System.out.println("ans1:" + highScore);
            }

            int health =100;
            if((health < 25) && (highScore > 1000)){
                highScore = highScore -1000;
                System.out.println("ans2:" + highScore);
            }else if(true) {
                System.out.println("in second loop");
            }
            else {
                System.out.println("in second loop");
            }
        }




    }

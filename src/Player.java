public class Player {
    private int numOfRounds;
    private int score;
    private int numQuestionsRight;

    public Player() {
        score = 0;
        numOfRounds = 0;
        numQuestionsRight = 0;
    }

    public int getScore() {
        return score;
    }


    public void updateScore(int points) {
        score += points;
    }

}

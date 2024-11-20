public class Player {
    private int numOfRounds;
    private int score;
    private int numQuestionsRight;
    private int numQuestionsWrong;
    private int lives;
    private String name;
    private int roundWins;
    private boolean hasStreak;
    private boolean priority;

    public Player(String name) {
        score = 0;
        numOfRounds = 0;
        numQuestionsRight = 0;
        lives = 3;
        numQuestionsWrong = 0;
        this.name = name;
        roundWins = 0;
        hasStreak = false;
        priority = false;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getStreak() {
        return numQuestionsRight;
    }

    public void changeStreak() {
        hasStreak = false;
    }

    public void changePriority() {
        priority = !(priority);
    }

    public void updateScore(int points) {
        score += points;
    }



}

public class Player {
    private int score;
    private String name;
    private boolean hasStreak;
    private int questionsRightInStreak;

    public Player(String name) {
        score = 0;
        this.name = name;
        hasStreak = false;
        questionsRightInStreak = 0;
    }

    public Player() {
        score = 0;
        name = "Michael Miller";
        hasStreak = false;
        questionsRightInStreak = 0;
    }

    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }

    public boolean getStreak() {
        return hasStreak;
    }

    public int getNumQuestions() {
        return questionsRightInStreak;
    }

    public void changeStreak(boolean value) {
        hasStreak = value;
    }

    public void countStreak() {
        if (hasStreak == true) {
            questionsRightInStreak++;
        } else {
            questionsRightInStreak = 0;
        }
    }

    public void updateScore(int points) {
        score += points;
    }

    public void updateScore() {
        score += 100;
    }




}

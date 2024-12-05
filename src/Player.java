public class Player {
    private int score;
    private String name;

    public Player(String name) {
        score = 0;
        this.name = name;
    }

    public Player() {
        score = 0;
        name = "Michael Miller";
    }

    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }



    public void updateScore(int points) {
        score += points;
    }

    public void updateScore() {
        score += 100;
    }




}

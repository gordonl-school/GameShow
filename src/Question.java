public class Question {
    private String prompt;
    private String answer;

    public Question(String p, String a) {
        prompt = p;
        answer = a;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getAnswer() {
        return answer;
    }
}

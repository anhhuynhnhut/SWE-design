import java.util.List;

public class Test {
	private List<Question> questionList = new ArrayList<Question>();
	public void addQuestion(Question question) {
        questionList.add(question);
    }
	public void setAnswer(int questionID, String answer) {
        questionList.get(questionID).setAnswer(answer);
    }
	public List<Question> getQuestionList() {
        return this.questionList;
    }
}

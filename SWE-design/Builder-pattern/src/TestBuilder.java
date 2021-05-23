
public class TestBuilder {

	public static Test visualTest(){
		Test test = new Test();
		test.addQuestion(question
				.setID()
				.setType()
				.setHeader()
				.setPoint()
				.setPointCount()
				.setOption()
				.setAnswer()
				);
		test.addQuestion(question
				.setID()
				.setType()
				.setHeader()
				.setPoint()
				.setPointCount()
				.setOption()
				.setAnswer()
				);
		test.addQuestion(question
				.setID()
				.setType()
				.setHeader()
				.setPoint()
				.setPointCount()
				.setOption()
				.setAnswer()
				);
		return test;
	}

}

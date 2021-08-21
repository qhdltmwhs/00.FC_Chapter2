package ch24;

public class Subject {

	private String subjectName;
	private int score;

	public Subject() {

	}

	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectRate() {
		return score;
	}

	public void setSubjectRate(int score) {
		this.score = score;
	}

}

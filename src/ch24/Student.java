package ch24;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;

	public Student() {

	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}

	public void showInfo() {
		int total = 0;
		for (Subject subject : subjectList) {
			System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 "
					+ subject.getSubjectRate() + "점 입니다.");
			total += subject.getSubjectRate();
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}

package school;

import java.util.ArrayList;

public class Student {
	private int studentId; //학번
	private String studentName;
	private String majorSubject;
	
	
	//학생 성적 리스트
	//addSubjectScore() 메서드가 호출되면 리스트에 추가됨
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	public Student(int studentId, String studentName, String majorSubject) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}//컨스트럭터

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

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
	
	

}

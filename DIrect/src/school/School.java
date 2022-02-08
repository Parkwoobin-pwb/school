package school;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	private School() {} //밖에서는 이 클래스를 만들수없게 프라이빗으로 감춘것
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	
	public static School getInstance() {
		
		if(instance == null) {
			instance = new School();
		}
		return instance;
	} //싱글톤패턴 완성


	public ArrayList<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}


	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}


	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
}

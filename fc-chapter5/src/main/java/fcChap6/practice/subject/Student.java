package fcChap6.practice.subject;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for(Subject sub : subjectList) {
            total += sub.getSubjectScore();
            System.out.println(studentName + " 학생님의 " + sub.getSubjectName() + " 과목의 성적은 " + sub.getSubjectScore() + "점 입니다.");
        }
        System.out.println(studentName + " 학생님의 총 점수는 " + total + "점 입니다.");
    }
}

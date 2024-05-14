package fcChap6.practice.subject;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;

    /* 학생들이 여러가지 과목을 듣는다.
     * 그 subject에 대해서 뭐 국어를 들을지 근데 여러 과목이 어떤 학생은 10개를
     * 들을 수 있고 어떤 학생은 2개, 3개 이렇게 다양하니깐 이 과목을 일일이 선언하는게 아니라
     * ArrayList를 만들고 이 ArrayList안에 Subject라는 요소를 넣어서 과목을 여기서 관리하도록 하자
     */
    ArrayList<Subject> subjectList;
    /* 그리고 subjectList는 그냥 쓰는게 아니고 생성을 해야 되는데
     * 주로 이런 것들은 어디서 생성을 많이 하냐면 생성자에서 많이 생성한다.
     */
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    // 과목을 수강 할 때마다 추가를 해야한다.
    public void addSubject(String subName, int subScore) {
        Subject subject = new Subject(subName, subScore);

        subjectList.add(subject); // 과목이 한 과목, 한 과목 추가가 될 것이다.
    }

    public void showStudentInfo() {
        int total = 0;
        for(Subject sub : subjectList) {  // 각 과목의 점수를 하나하나 출력을 하려고 보니 어디에 들어가 있냐면
            // subjectList에 들어가 있다. 타입이 Subject니 for(Subject ~ )
            // 이런식으로 작성!
            total += sub.getSubScore();
            System.out.println(studentName + "학생의 " + sub.getSubName() + " 과목의 성적은 " + sub.getSubScore() + "점 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}

package fcChap6.practice.subject;

public class StudentTest {
    public static void main(String[] args) {
        /* 학생의 수강 과목 학점 출력하기
         * Lee 학생은 두 과목을 수강하고, Kim 학생은 세 과목을 수강한다.
         * 각 학생의 학점과 총점을 다음과 같이 출력해보자.
         *
         * Student클래스에 ArrayList멤버변수를 하나 가지고 각 학생이 수강하는 과목을 관리 하도록 하자.
         *
         * - 출력 결과 -
         * 학생 Lee님의 국어 과목의 성적은 100점 입니다.
         * 학생 Lee님의 수학 과목의 성적은 90점 입니다.
         * 학생 Lee님의 총점은 190점 입니다.
         * ===========================================
         * 학생 Kim님의 국어 과목의 성적은 100점 입니다.
         * 학생 Kim님의 수학 과목의 성적은 90점 입니다.
         * 학생 Kim님의 영어 과목의 성적은 80점 입니다.
         * 학생 Kim님의 총점은 270점 입니다.
         */

        Student studentLee = new Student(101, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        Student studentKim = new Student(102, "Kim");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 90);
        studentKim.addSubject("영어", 80);

        studentLee.showStudentInfo();
        System.out.println("=======================");
        studentKim.showStudentInfo();

    }
}

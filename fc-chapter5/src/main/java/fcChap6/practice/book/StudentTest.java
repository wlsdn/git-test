package fcChap6.practice.book;

public class StudentTest {
    public static void main(String[] args) {
        /* 어느 학교에 학생이 3명 있다. 각 학생마다 읽은 책을 기록하고 있다.
         * Student 클래스를 만들고 각 학생마다 읽은 책을 Student 클래스 내에 ArrayList를
         * 생성하여 관리하도록 한다.
         *
         * 다음과 같이 출력 되도록 Student, Book, StudentTest 클래스를 만들어 실행하시오.
         *
         * - 출력 결과 -
         * Lee 학생이 읽은 책은 : 태백산맥1 태백산맥2 입니다.
         * Kim 학생이 읽은 책은 : 토지1 토지2 토지3 입니다.
         * Cho 학생이 읽은 책은 : 해리포터1 해리포터2 해리포터3 해리포터5 해리포터6 입니다.
         */
        Student studentLee = new Student(101, "Lee");
        studentLee.addBook("태백산맥1", "Lee1");
        studentLee.addBook("태백산맥2", "Lee2");

        Student studentKim = new Student(102, "Kim");
        studentKim.addBook("토지1", "Kim1");
        studentKim.addBook("토지2", "Kim2");
        studentKim.addBook("토지3", "Kim3");

        Student studentCho = new Student(103, "Cho");
        studentCho.addBook("해리포터1", "Cho1");
        studentCho.addBook("해리포터2", "Cho2");
        studentCho.addBook("해리포터3", "Cho3");
        studentCho.addBook("해리포터4", "Cho4");
        studentCho.addBook("해리포터5", "Cho5");
        studentCho.addBook("해리포터6", "Cho6");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
        studentCho.showStudentInfo();

    }
}

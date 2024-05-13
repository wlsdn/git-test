package fcChap5.staticex;

public class StudentIDTest {
    public static void main(String[] args) {

        Student studentLee = new Student("Lee");
        System.out.println(Student.getSerialNum());
        // studentLee.serialNum을 보면 노란줄이 되어 있다. 보통은 클래스 이름으로 참조한다.

        Student studentKim = new Student("Kim");
        System.out.println(Student.getSerialNum());
        System.out.println(Student.getSerialNum());

        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());

    }
}

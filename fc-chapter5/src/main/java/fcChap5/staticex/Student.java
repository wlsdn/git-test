package fcChap5.staticex;

public class Student {

    private static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String address;

    public Student(String name) {
        this.studentName = name;
        ++serialNum;
        studentID = serialNum;
    }
    public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;
        this.address = "주소 없음";
        ++serialNum;
        studentID = serialNum;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    /*
     * 학생이 생성될 때마다 자동으로 학생의 id를 새로 부여하고 싶다.
     * public static int serialNum = 1000;
     * 학생이 생성될 때마다 새롭게 만들어질테니깐
     * 생성자에 ++serialNum; 이렇게 해준다.
     *
     * 학번은 어떻게 하냐?
     * 생성자에 studentID = serialNum;을 하면 되겠지?
     * 그리고 studentID는 private로 선언되었기 때문에 외부에선
     * 가져갈 수 없다. 또 변하면 안 된다.
     * 그래서 set메소드는 제공하지 않는다.
     *
     * 보통은 static 변수를 private으로 만드는게 좋다.
     */
}

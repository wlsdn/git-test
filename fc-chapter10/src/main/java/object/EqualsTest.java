package object;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    @Override
    public boolean equals(Object obj) {
        // 학번이 같으면 같은 학생이다 라는 걸 여기서 할 것이다.
        // shin이 넘어오면 업캐스팅이 돼서 다시 다운캐스팅을 해야 한다.
        if( obj instanceof Student) { // 두 객체가 같으면 Student로 다시 다운캐스팅을 한다.
            Student std = (Student)obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }
    @Override
    public int hashCode() { // 이번에 해시코드를 오버라이딩해보자
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {

        /*
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // System.out.println() 안에 == 이걸쓰면 같은가? 라고
                                          // 물어보는 것이다.
        System.out.println(str1.equals(str2)); // 이건 두 개의 문자열이 같은가를 비교하는 것이다.
        */

        /*
        Student lee = new Student(100, "이순신");
        Student lee2 = lee;
        Student shin = new Student(100, "이순신");

        System.out.println(lee == lee2); // 주소가 같기 때문에 당연히 true
        System.out.println(lee.equals(shin)); // 이건 false다 이유는 재정의 하지 않았기 때문이다.

        System.out.println(lee); // 이렇게 해서 @ 뒤에 나오는건 16진수다.
        System.out.println(lee.hashCode()); // 이렇게 하면 10진수다.
        System.out.println(shin.hashCode());
        */

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        // i1의 진짜 메모리 주소를 알고싶다.
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
    }
}

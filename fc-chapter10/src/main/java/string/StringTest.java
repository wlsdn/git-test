package string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");
        // new로 했을때는 힙 메모리에 allocation이 된다. 생성이 된다라는 거

        System.out.println(str1 == str2); // 메모리 위치가 다르니깐 false가 나온다.

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

    }
}

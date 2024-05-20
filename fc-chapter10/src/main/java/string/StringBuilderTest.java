package string;

public class StringBuilderTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        // java의 String을 기반으로 StringBuilder가 생겼다.
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android); // 직접 "android"를 써도 되고, 변수를 넣어도 되고
        System.out.println(System.identityHashCode(buffer));

        java = buffer.toString();

    }
}

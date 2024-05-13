public class Test {
    public static void main(String[] args) {

        checkMethod();
        System.out.println(sumTwoNumber(1, 2));
    }

    public static void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public static String sumTwoNumber(int a, int b) {

        return a + "와 " +  b + "의 합은 " + (a+b) + "입니다.";
    }

    public String multiTwoNumber(int a, int b) {
        System.out.println();
        return a + "와 " + b + "의 곱은 " + (a*b) + "입니다.";
    }

    public int multiTwoNumber2(int a, int b) {
        System.out.println("10과 20의 곱은 200입니다.");
        return a * b;
    }
}

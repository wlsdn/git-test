package interfaceex;

public interface Calc {

    double PI = 3.14; // 이렇게 PI만 쓰면 자동으로 public static final 이라는 걸 만들어준다.
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        mystaticMethod();
        return total;
    }
    /* static 메서드에서 일반 메소드를 호출 할 수 없다.
     * total은 인스턴스 생성하지 않고 호출할테니깐
     */

    private void myMethod() { // 이거는 default 메소드에 정의하면 된다.
        System.out.println("private method");
    }
    private static void mystaticMethod() { // static으로 선언한 메소드는 static 메소드에서 쓰는 것이다.
        System.out.println("private static method");
    }

}

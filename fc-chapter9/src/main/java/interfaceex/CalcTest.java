package interfaceex;

import java.util.ArrayList;

public class CalcTest {
    public static void main(String[] args) {

        /* 지금 Calc인터페이스가 있고, Calculator가 있고, CompleteCalc이 있다.
         * 이 중에서 우리가 new할 수 있는 애는 CompleteCalc밖에 없다.
         * CompleteCalc만 완벽하게 모든게 구현되어 있기 때문이다.
         */
        CompleteCalc calc = new CompleteCalc(); // CompleteCalc은 Calc인터페이스로도 선언할 수 있고
        // Calculator로 선언할 수 있다.
        /* 만약에 Calc 인터페이스 타입으로 선언을 하게 되면 인터페이스로 선언한 calc변수는
         * 인스턴스 CompleteCale() 이라고 해도 타입이 Calc이기 때문에(업캐스팅)
         * calc이 사용할 수 있는 메소드는 뭐만 사용할 수 있다?
         * Calc인터페이스것만 사용할 수 있다. 그래서 shoInfo() 메소드는 사용할 수 없다.
         */
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);  // 이거는 인스턴스 변수로 가져다 쓰는게 아니라
        // 인터페이스 타입으로 가져다 쓰는것이다.
        System.out.println(sum);
        /*
         * 그래서 static으로 선언을 하면 9번부터25번까지 상관없이 바로 가져다가 쓸 수 있다.
         */


    }
}

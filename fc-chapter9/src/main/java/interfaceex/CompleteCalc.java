package interfaceex;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        } else {
            return num1 / num2;
        }
    }

    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }


    @Override
    public void description() {
        //super.description() 기본적으론 이건데 재정의 할 수 있다라는 것이다.
        System.out.println("재정의 한 description");

    }

}

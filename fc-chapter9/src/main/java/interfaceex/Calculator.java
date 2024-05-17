package interfaceex;

public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1,int num2) {
        return num1 - num2;
    }
    // 나는 여기까지만 구현 할 것이다. 그럼 나머지들은 다른데서 해야 되니깐
    // 이 클래스는 알다시피?? abstract 클래스가 되야 한다.

    /*
    @Override
    public int times(int num1, int num2) {

    }

    @Override
    public int divide(int num1, int num2) {

    }
     */
}

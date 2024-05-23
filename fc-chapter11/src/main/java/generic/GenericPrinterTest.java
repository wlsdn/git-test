package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {

        /* 파우더 프리터를 만든다 그러면
         * GenericPrinter 한 다음에 <> 여기다가 Powder라고 쓰면 된다.
         */
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        /* 위처럼 생성하고 Powder라고 선택하고 그 다음에 Powder에 대한 재료를 넣어줘야겠다.
         * Powder powder = new Powder(); 생성하고 set에 powder를 넣으면
         * powder가 powderPrinter에 재료가 되는 것이다.
         */
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);

        // Platic도 만들어보자
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);

        // 다른 경우도 있다.
        /* 만약에 재료가 물이다. 근데 물을 3D 프린터의 재료로 쓸 수는 없다.
         * 근데 여기다가 써서 여기다가 아무런 제약 조건이 없다라고 하면
         * ...상위클래스를 하나 선언한다. Meterial클래스
         * 이제 Water는 쓸 수가 없다. 당연히 쓸 수 있는 애에 대한 한정을 줄 때 제안을 가할 때
         * 상위클래스를 쓰는 게 하나의 방법이다.
         */

        powderPrinter.printing();
        plasticPrinter.printing();

    }
}

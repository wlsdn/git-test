package buysellbookshelf;

public class Customer implements Buy, Sell { //여기 Customer에 빨간줄이 나는데
                                             //이유가 뭐냐 Buy에 있는 order()랑 Sell에 있는 order()랑
                                             //이름이 똑같다. 어느 메소드를 쓸거냐? 라는 빨간줄이 뜬다.
                                             //그때는 Buy.super.order() 이렇게 하던지 아니면
                                             //직접 재정의를 하든지 하면 된다.
    @Override
    public void buy() {
        System.out.println("customer buy");
    }
    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void sayHello() {
        System.out.println("hello");
    }

}

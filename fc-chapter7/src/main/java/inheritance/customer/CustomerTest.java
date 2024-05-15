
package inheritance.customer;

public class CustomerTest {
    public static void main(String[] args) {

/*  일반 고객 1명과 VIP고객 1명이 있다.
         *  일반 고객의 이름은 이순신, 아이디는 10010, 보너스 포인트는 1000점이다.
         *  VIP 고객의 이름은 김유신, 아이디는 10020, 보너스 포인트는 10000점이다.
         *
         *  두 고객을 생성하고 이에 대한 고객 정보를 출력해 보자.
         */

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int priceLee = customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        System.out.println();

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        int priceKim = customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());



        /*  customerKim하고 .을 하면 Customer와 VIPCustomer의 변수들을 모두 볼 수 있다.
         *  그런데 Customer vc = new VIPCustomer(); 이렇게 하면
         *  Customer에 있는 멤버변수들만 볼 수 있다.
         *  이유는 customerKim의 타입이 Customer이기 때문이다. 그러니까 인스턴스는
         *  new VIPCustomer까지 다 만들어졌지만 메모리도 다 만들어졌지만
         *  타입은 Customer이기 때문에 vc.해서 보이는 건 Customer꺼만 보인다.
         */

    }
}


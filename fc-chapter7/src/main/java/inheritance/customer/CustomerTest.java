package inheritance.customer;

public class CustomerTest {
    public static void main(String[] args) {
        /*  일반 고객 1명과 VIP고객 1명이 있다.
         *  일반 고객의 이름은 이순신, 아이디는 10010, 보너스 포인트는 1000점이다.
         *  VIP 고객의 이름은 김유신, 아이디는 10020, 보너스 포인트는 10000점이다.
         *
         *  두 고객을 생성하고 이에 대한 고객 정보를 출력해 보자.
         */
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}

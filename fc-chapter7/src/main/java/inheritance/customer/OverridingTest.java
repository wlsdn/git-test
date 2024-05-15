package inheritance.customer;

public class OverridingTest {
    public static void main(String[] args) {
       /*
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + priceLee + "원 입니다.");

        System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + priceKim + "원 입니다.");

        */

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        System.out.println(customerNo.showCustomerInfo() + "지불 금액은 " + customerNo.calcPrice(10000) + "원 입니다.");
        /* customerNo.calcPrice(10000)은 누구의 메서드를 불렸냐면 VIPCustomer에 메서드이다.
         * 그런데 customerNo하고 .을 해보면 누구것만 보이냐면 Customer것만 보인다.
         *
         */
    }
}

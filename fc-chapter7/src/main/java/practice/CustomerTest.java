package practice;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new Customer(10030, "홍길동");
        Customer customerYul = new Customer(10040, "이율곡");
        Customer customerKim = new Customer(10050, "김유신");

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerShin.showCustomerInfo());
        System.out.println(customerHong.showCustomerInfo());
        System.out.println(customerYul.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}

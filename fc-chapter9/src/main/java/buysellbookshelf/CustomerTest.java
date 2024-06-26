package buysellbookshelf;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // new Customer()에 order()이다.

        Sell seller = customer;
        seller.sell();
        seller.order(); // new Customer()에 order()이다.

    }
}

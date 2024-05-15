package polymorphism;

public class GoldCustomer extends Customer {
    double salesRatio;
    public GoldCustomer(int customerID, String custmerName) {
        super(customerID, custmerName);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;

        System.out.println("GOLDCustomer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}

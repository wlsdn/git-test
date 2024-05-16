package practice;

public class VIPCustomer extends Customer {
    double salesRatio;
    int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID =agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}

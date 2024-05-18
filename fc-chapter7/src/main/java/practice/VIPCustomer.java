package practice;

public class VIPCustomer extends Customer {

    double salesRatio;
    int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.1;
        this.agentID = agentID;
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
    }

}

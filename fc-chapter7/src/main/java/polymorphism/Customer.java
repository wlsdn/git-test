package polymorphism;

public class Customer {
    /*  멤버 변수               설명
     *  customerID          고객 아이디
     *  customerName        고객 이름
     *  customerGrade       고객 등급
     *                      기본 생성자에서 지정되는 기본 등급은 SILVER입니다.
     *  bonusPoint          고객의 보너스 포인트
     *                      - 고객이 제품을 구매할 경우 누적되는 보너스 포인트입니다.
     *  bonusRatio          보너스 포인트 적립 비율
     *                      - 고객이 제품을 구매할 때 구매 금액의 일정 비율이 보너스 포인트로
     *                        적립된다. 이때 계산되는 적립 비율이다.
     *                      - 기본 생성자에서 지정되는 적립 비율은 1%이다. 즉 10,000원짜리를
     *                        사면 100원이 적립된다.
     */
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() 생성자 호출");
    }
    */
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}

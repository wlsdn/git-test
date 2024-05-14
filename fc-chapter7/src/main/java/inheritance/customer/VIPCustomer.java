package inheritance.customer;

public class VIPCustomer extends Customer {
    /*  단골 고객으로 혜택이 더 다양해짐
     *  제품구매시 10%할인
     *  보너스 포인트 5% 적립
     *  담당 상담원 배정
     */

    double salesRatio;
    private int agentID;

    public VIPCustomer() {
        // customerGrade = "VIP"; private이여서 외부에선 상속받은 관계여도 접근할 수 없다.
        // 상속받은 관계에서 사용하고 싶다. 그럼 Customer클래스에 private을 protected로 바꾼다.
        customerGrade = "VIP";
        bonusRatio = 0.05; // 적립률
        salesRatio = 0.1;  // 10% 할인
    }
}

package polymorphism;

public class VIPCustomer extends Customer {
    /*  단골 고객으로 혜택이 더 다양해짐
     *  제품구매시 10%할인
     *  보너스 포인트 5% 적립
     *  담당 상담원 배정
     */

    double salesRatio;
    int agentID;

    /*
    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() 생성자 호출");
    }
     */
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        // 보너스 포인트는 똑같이 내가 지불해야 되는 가격에 bonusRatio를 곱한 점수를 추가
        bonusPoint += price * bonusRatio;
        // 가격은 할인을 한다고 했다. price에서 뺄 것이다.
        // 뭐 10% 할인이다 그러면 10% 할인된 값이 빠질 거고 그 값을 리턴 해주면 된다.
        // (int)를 안 붙이면 오류가난다. 이유는 salesRatio가 double이고 price는 int이기 때문에
        // int로 바꿔줘야 하기 때문이다.
        return price - (int)(price * salesRatio);
    }
}

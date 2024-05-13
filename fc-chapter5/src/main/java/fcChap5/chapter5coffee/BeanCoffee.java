package fcChap5.chapter5coffee;

public class BeanCoffee {
    int money;

    public String brewing(int money) {
        this.money += money;
        if(money == Menu.BEANAMERICANO) {
            return "콩 다방 아메리카노를 구입했습니다.";
        } else if(money == Menu.BEANCAFELATTE) {
            return "콩 다방 카페라테를 구입했습니다.";
        } else {
            return null;
        }
    }
}

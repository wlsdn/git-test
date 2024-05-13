package fcChap5.chapter5coffee;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee starCoffee, int money) {
        String message = starCoffee.brewing(4000);
        if(message != null) {
            this.money -= money;
            System.out.println(name + " 님이 " + money + "원 으로 " + message + "남은 돈은 " + this.money + "원 입니다.");
        }
    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
        String message = beanCoffee.brewing(5000);
        if(message != null) {
            this.money -= money;
            System.out.println(name + " 님이 " + money + "원 으로 " + message + "남은 돈은 " + this.money + "원 입니다.");
        }
    }
}

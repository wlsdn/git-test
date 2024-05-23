package fcChap5.chapter5coffee;

public class CoffeeTest {
    public static void main(String[] args) {

        /*
         * 아침 출근길에 김 졸려 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
         * 이 피곤 씨는 콩다방에서 4,500원을 내고 라떼를 마셨습니다.
         * 객체 간의 협력 강의를 참고하여 객체 지향 방법으로 구현해 보자.
         */
        /*
         * 클래스
         * 1. 별다방
         * 2. 콩다방
         * 3. person
         * 4. menu
         * 5. test
         */

        Person kim = new Person("Kim", 10000);
        Person lee = new Person("Lee", 20000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();
        kim.buyStarCoffee(starCoffee, 4000);
        lee.buyBeanCoffee(beanCoffee, 5000);

    }

}

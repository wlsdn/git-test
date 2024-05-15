package polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("둥물이 움직입니다.");
    }
}
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걸어다닙니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human(); //업캐스팅
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        //Human human = (Human)hAnimal; // 다운 캐스팅 => Human클래스의 readBooks를 사용하고 싶으면
        // 이렇게 해야한다.
        // human.readBooks();

        //Eagle human1 = (Eagle)hAnimal;

        /*
        if( hAnimal instanceof Eagle) {
            Eagle human1 = (Eagle)hAnimal;
        }
        */

        /*
        if(hAnimal instanceof Human) {
            Human human2 = (Human)hAnimal;
            human2.readBooks();
        }
         */

        /* 이렇게 해도 오류가 나지 않는다. 이유는
         * human1 타입인 Eagle과 (Eagle)만 체크해서이다.
         * 그리고 실행을 해보면 ClassCastException 오류가 난다.
         * Human이 Eagle로 캐스팅 될 수 없다라는 오류가 난다.
         * hAnimal은 Human인데 Eagle로 강제 캐스팅 하려고 해서 오류가 난 것이다.
         * 그래서 뭐를 하냐! instanceof문을 사용한다.
         * if( hAnimal instanceof Eagle) {
            Eagle human1 = (Eagle)hAnimal;
           }
         * 이렇게 하고 출력을 하면 아무것도 안 나온다. 이유는
         * Eagle human1 = (Eagle)hAnimal; 얘가 if( hAnimal instanceof Eagle) 이 안으로
         * 안 들어갔기 때문이다.
         * instanceof는 true나 false를 반환한다.
         * 그래서 이걸 바꾸면 ...
         * 그래서 instanceof가 하는 일은 hAnimal이 정말 Human 타입의 인스턴스였냐에 대해
         * true false를 반환한다.
         */

        /*
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
         */

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        /*
        for(Animal animal : animalList) {
            animal.move();
        }
        */

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i = 0; i < list.size(); ++i) {
            Animal animal = list.get(i); // 하나씩 꺼낼것이다. 근데 하나씩 꺼내면 무슨 타입으로 꺼내지느냐
            // 지금은 Animal타입으로 꺼내지겠지
            if(animal instanceof Human) {
                Human human = (Human)animal;
                human.readBooks();
            } else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            } else if(animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
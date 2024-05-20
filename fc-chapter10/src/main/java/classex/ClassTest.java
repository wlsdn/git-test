package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("classex.Person"); // 동적으로 불러와보자
        // 클래스로부터 생성자를 가져올 수 있다.
        Person person1 = (Person)c1.newInstance(); // Object니깐 Person으로 다운캐스팅해주고
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
    }
}

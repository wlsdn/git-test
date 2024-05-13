package fcChap5.chapter5;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate myDate1 = new MyDate(29, 2, 2024);
        System.out.println(myDate1.isValid());
        MyDate myDate2 = new MyDate(2, 10, 2006);
        System.out.println(myDate2.isValid());
    }
}

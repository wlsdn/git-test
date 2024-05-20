package object;

class Book implements Cloneable {// 어떤 책이 있다고 해보자

    String title ; // 책은 제목이 있고, 저자가 있다.
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return this.author+ ", " + this.title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지", "박경리"); // 그리고 책을 생성했다.
        // 그리고 출력을 해보자
        System.out.println(book); // 클래스@메모리주소가 나온다.

        //다른 방법을 해보자
        String str = new String("토지");
        System.out.println(str);  // 이건 생성자에 넣어준 "토지"가 나온다.
        // 왜? "토지"가 출력되지?
        /* String class는 JDK클래스이기 때문이다.
         * String class안에 toString이라는 메서드가 이미 정의가 됐다.
         * 그래서 불리는게 toString()이 불린다.
         * toString()은 누구의 메소드냐면 Object의 메소드다.
         * "토지", "박경리"도 똑같이 나오게 하고싶다.
         * 그럼 재정의를 하면 된다. 어디서? Book클래스 안에서
         */

        Book book2 = (Book)book.clone(); // book.clone();이렇게 하면 Object형으로 반환이 된다.
                                   // 그래서 앞에 (Book)을 해줘야 한다.
        System.out.println(book2); // 에러가 난다.
        // 이 클래스가 클론이라는 메소드를 사용을 할려면
        // 뭐를 명시해줘야 되냐면 Book클래스에다가 implements Cloneable을 해줘야한다.

    }
}

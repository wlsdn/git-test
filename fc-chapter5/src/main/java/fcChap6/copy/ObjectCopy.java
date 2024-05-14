package fcChap6.copy;

import fcChap6.Book;

public class ObjectCopy {
    public static void main(String[] args) {
        //얕은 복사

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5]; // 그대로 복사해보자

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        //향상된 for문을 사용해보자
        //향상된 for문이란 처음부터 끝까지 다 돌아볼거다 그냥 library의 length만큼 돌겠다.
        //어떻게 사용하는거냐면
        //어떤 객체로 엘리먼트를 꺼내 올 것인가를 선언한다. 타입을 선언하고 그 다음에 그 타입에
        //대한 변수를 선언한다.
        //그리고 어떤 것을 처음부터 끝까지 돌것이냐는 것을 넣는다.
        //ex
        // for(Book book : copyLibrary) 이렇게이다.
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

        System.out.println("===========================");

        // 그리고 원본 library[0]번째 정보를 바꿔보자
        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        // 그리고 다시 for(Book book : copyLibrary) 이렇게해서 확인해보자
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===========================");

        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
        // 원본과 복사본 둘 다 library[0]번째가 변경되었다.
    }
}

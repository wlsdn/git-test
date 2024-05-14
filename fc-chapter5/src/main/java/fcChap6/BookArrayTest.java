package fcChap6;

public class BookArrayTest {
    public static void main(String[] args) {

        Book[] library = new Book[5]; // 크키가 5인 배열 생성 (책 5권이 생긴 건 아님 오해 금지!)
        // 만약 책이 5권이 생길라면 한 권 한 권씩 new book, new book 해야한다.

        // 그럼 실제적으로 책을 어떻게 해야 만드느냐?? 직접 다 넣어줘야 한다.
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래"); // 만들고 출력해보면 주소 값이 나온다.

        for(int i = 0; i < library.length; ++i) {
            System.out.println(library[i]); // 이건 주소값이 나온다.
        }

        System.out.println();

        // 책에 값을 넣었는데 그 정보를 출력하고 싶으면 어떻게 하나요?
        for(int i = 0; i < library.length; ++i) {
            library[i].showBookInfo();
        }

    }
}

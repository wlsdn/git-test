package fcChap6.practice.book;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Book> bookList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookList.add(book);
    }

    public void showStudentInfo() {
        System.out.print(studentName + " 학생이 읽은 책은 : ");
        for (Book bk : bookList) {
            System.out.print(bk.getTitle() + " ");
        }
        System.out.println("입니다.");
    }
}

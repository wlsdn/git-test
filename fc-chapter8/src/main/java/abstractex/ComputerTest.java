package abstractex;

public class ComputerTest {
    public static void main(String[] args) {

        // Computer computer = new Computer();
        /* Computer computer = new Computer(); 이렇게 하면 당연히 안 된다.
         * 이유는 Computer는 추상 클래스이고 computer.display()를 부르면 불려질 메서드가 없다.
         * Computer의 display()는 구현이 안 되어 있으니깐 그러니깐 new Computer는 인스턴스화
         * 될 수 없다.
         */
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
        /* new MyNoteBook(); 는 타입으로 Computer로 하든 NoteBook으로 하든 상관없다.
         * 이유는 MyNoteBook은 상위클래스가 NoteBook이기도 하고 Computer이기도 하기 때문이다.
         */
        myNote.turnOn();

        Computer mymyNote = new MyNoteBook();
        mymyNote.typing();


    }
}

public class Chap_2_Application2 {
    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */

        int age = 19;

        if(age <= 13){
            System.out.println("어린이");
        }else if(13 < age && age <= 19) {
            System.out.println("청소년");
        }else{
            System.out.println("성인");
        }

    }
}

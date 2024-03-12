package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */



    public static String tossCoin() {

        Random random = new Random();
        int randomNumber = random.nextInt(2);

        String rock;
        if(randomNumber == 0) {
            rock = "앞면";
        }else {
            rock = "뒷면";
        }
        return rock;
    }


    public static String rockPaperScissors() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String rock;
        if(randomNumber == 0) {
            rock = "가위";
        }else if(randomNumber == 1) {
            rock = "바위";
        }else {
            rock = "보";
        }
        return rock;
    }

}

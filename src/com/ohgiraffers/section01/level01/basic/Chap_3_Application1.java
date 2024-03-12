package com.ohgiraffers.section01.level01.basic;

public class Chap_3_Application1 {
    public static void main(String[] args) {

            /* Calculater 클래스의 메소드를 호출해서 실행 */
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        int a = 10;
        int b = 20;

        Calculator calc = new Calculator();

        calc.checkMethod();
        calc.sumTwoNumber(a, b);
        calc.multiTwoNumber(a, b);
        calc.multiTwoNumber2(a, b);
        System.out.println(calc.apple());
    }
}

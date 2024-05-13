package com.ohgiraffers.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap04_Application1 {
    public static void main(String[] args) throws IOException {

        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요 : ");
        int n = Integer.parseInt(br.readLine());

        if(n > 0) {
            System.out.println("양수다.");
        }else {
            System.out.println("양수가 아니다.");
        }


    }
}

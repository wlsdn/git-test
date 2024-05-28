package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO memberDTO = new MemberDTO();

        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());

        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@greedy.com");

        System.out.println();

        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());

    }
}

package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmployeeDTO employeeDTO = new EmployeeDTO();

        System.out.print("사원번호를 입력하세요 : ");
        int number = Integer.parseInt(br.readLine());
        System.out.print("사원이름을 입력하세요 : ");
        String name = br.readLine();
        System.out.print("부서이름을 입력하세요 : ");
        String dept = br.readLine();
        System.out.print("직급을 입력하세요 : ");
        String job = br.readLine();
        System.out.print("나이를 입력하세요 : ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("성별을 입력하세요 : ");
        char gender = br.readLine().charAt(0);
        System.out.print("월급을 입력하세요 : ");
        int salary = Integer.parseInt(br.readLine());
        System.out.print("보너스를 입력하세요 : ");
        double bonusPoint = Double.parseDouble(br.readLine());
        System.out.print("전화번호를 입력하세요 : ");
        String phone = br.readLine();
        System.out.print("주소를 입력하세요 : ");
        String address = br.readLine();

        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());

    }
}

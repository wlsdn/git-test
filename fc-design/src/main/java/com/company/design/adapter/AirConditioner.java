package com.company.design.adapter;

public class AirConditioner implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("에어컨 220v on");
    }

}

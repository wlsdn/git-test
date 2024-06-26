package com.company.design.adapter;

public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V; // 연결해줄 220v

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }

}

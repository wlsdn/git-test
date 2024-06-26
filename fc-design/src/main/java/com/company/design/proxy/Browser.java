package com.company.design.proxy;

public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url); // 리턴은 새로운 Html을 넘긴다.
    }


}

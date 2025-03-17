package com.example.springbasic.singleton;

public class SingletonService {

    //클래스 레벨에 올라간다
    //자기 자신 인스턴스 객체 인스턴스 하나를 생성해서 INSTANCE 안에 넣고 조회할 때는 getInstance() 를 사용
    //
    private static final SingletonService INSTANCE = new SingletonService();

    public static SingletonService getInstance(){
        return INSTANCE;
    }

    //생성자를 private으로 선언하여 외부에서 객체 생성 차단
    private SingletonService(){
    }


    public static void main(String[] args) {

    }

}

package com.example.springbasic.scan.filter;


import java.lang.annotation.*;


//얘가 붙은 것은 컴포넌트 스캔에 추가할 거라는 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //타입은 클래스 레벨에 붙는다는것
@Documented
public @interface MyIncludeComponent {


}

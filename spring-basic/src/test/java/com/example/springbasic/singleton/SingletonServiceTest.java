package com.example.springbasic.singleton;

import com.example.springbasic.AppConfig;
import com.example.springbasic.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class SingletonServiceTest {
    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void SingletonServiceTest1(){
        SingletonService service1 = SingletonService.getInstance();
        SingletonService service2 = SingletonService.getInstance();

        System.out.println("service1 = " + service1);
        System.out.println("service2 = " + service2);

        Assertions.assertThat(service1).isSameAs(service2);
        // same ==
        // equal equals 오버라이딩 한 것
    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService service1 = context.getBean("memberService",MemberService.class);
        MemberService service2 = context.getBean("memberService",MemberService.class);

        //참조값이 다른 것을 확인
        System.out.println("service1 = " + service1);
        System.out.println("service2 = " + service2);

        Assertions.assertThat(service1).isSameAs(service2);
    }
}
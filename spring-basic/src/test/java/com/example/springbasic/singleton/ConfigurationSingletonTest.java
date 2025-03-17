package com.example.springbasic.singleton;

import com.example.springbasic.AppConfig;
import com.example.springbasic.Order.OrderServiceImpl;
import com.example.springbasic.member.MemberRepository;
import com.example.springbasic.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    void configurationSingleton() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = context.getBean("memberService",MemberServiceImpl.class);
        OrderServiceImpl orderService = context.getBean("orderService",OrderServiceImpl.class);

        MemberRepository memberRepository1 = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();

        System.out.println("memberService -> memberRepository = " + memberRepository1);
        System.out.println("orderService -> memberRepository = " + memberRepository2);
    }

    @Test
    void configurationSingleton2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = context.getBean(AppConfig.class);

        System.out.println("bean = " + bean.getClass());
    }
}

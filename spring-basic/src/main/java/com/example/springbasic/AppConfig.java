package com.example.springbasic;

import com.example.springbasic.Order.OrderService;
import com.example.springbasic.Order.OrderServiceImpl;
import com.example.springbasic.discount.DiscountPolicy;
import com.example.springbasic.discount.FixDiscountPolicy;
import com.example.springbasic.discount.RateDiscountPolicy;
import com.example.springbasic.member.MemberRepository;
import com.example.springbasic.member.MemberService;
import com.example.springbasic.member.MemberServiceImpl;
import com.example.springbasic.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
     return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    //역활을 확실히 볼 수 있도록 Extract Method 해주는것이 좋다.
    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}

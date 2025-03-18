package com.example.springbasic.Order;

import com.example.springbasic.annotation.MainDiscountPolicy;
import com.example.springbasic.discount.DiscountPolicy;
import com.example.springbasic.member.Member;
import com.example.springbasic.member.MemberRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Getter
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    //의존 관계를 추가하고 싶으면 여기에다 private final ex ex 로 추가해주면 의존관계가 자동으로 추가됨.

    //@RequiredArgsConstructor 가 만들어줌
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}

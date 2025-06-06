package com.example.springbasic.discount;

import com.example.springbasic.annotation.MainDiscountPolicy;
import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; //천 원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}

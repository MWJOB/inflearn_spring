package com.example.springbasic.discount;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

//TEST를 만들 때는 실패 케이스 성공 케이스를 둘 다 만들어라
class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_0(){
        //given
        Member member = new Member(1L, "memberVip", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

//    @Test
//    @DisplayName("vip가 아니면 할인이 적용되지 않아야 한다.")
//    void vip_x(){
//        //when
//        Member member = new Member(1L, "memberBasic", Grade.BASIC);
//
//        //when
//        int discount = discountPolicy.discount(member, 10000);
//
//        //then
//        assertThat(discount).isEqualTo(0);
//    }
}
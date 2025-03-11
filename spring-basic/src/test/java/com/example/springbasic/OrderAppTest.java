package com.example.springbasic;

import com.example.springbasic.Order.OrderService;
import com.example.springbasic.Order.OrderServiceImpl;
import com.example.springbasic.member.Grade;
import com.example.springbasic.member.MemberService;
import com.example.springbasic.member.MemberServiceImpl;
import com.example.springbasic.member.Member;
import com.example.springbasic.Order.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderAppTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}

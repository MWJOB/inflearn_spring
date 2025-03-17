package com.example.springbasic.member;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class MemberServiceImpl implements MemberService {

    //테스트 용도
    private final MemberRepository memberRepository;

    //생성자를 통해서 주입
    @Autowired //ac.getBean(MemberRepository.class) // 자동 의존관계 주입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}

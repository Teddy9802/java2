package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    //커멘드 + 시프트 + 엔터 = 자동완성
    private final MemberRepository memberRepository;

    @Autowired //ac.getBean(MemberRepository.class)랑 비슷하게 동작한다.
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

    //테스트 용도

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

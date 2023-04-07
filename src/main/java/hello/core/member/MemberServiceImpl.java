package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //커멘드 + 시프트 + 엔터 = 자동완성
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

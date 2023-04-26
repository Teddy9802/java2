package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @Component 붙은 애들 스프링컨테이너에 자동등록 해줌
@ComponentScan(
        //탐색위치 지정
//        basePackages = "hello.core",
        //컨포넌트 다 뒤져서 스프링빈으로 자동등록을 할때에 뺄 것들을 지정해주는 것
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}

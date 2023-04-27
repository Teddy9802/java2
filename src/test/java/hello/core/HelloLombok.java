package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 게터, 세터를 롬복이 자동생성 해준다.
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdas");

        System.out.println("helloLombok = " + helloLombok);
    }
}

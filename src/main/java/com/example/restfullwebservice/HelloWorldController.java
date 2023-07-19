package com.example.restfullwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.jvm.hotspot.HelloWorld;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world -> 이렇게 선언된 uri가 사용자에 의해서 호출되는 이름이 됨.
    // (endpoint) 얘가 호출되면 클라이언트에서 요청했던 정보를 서버측에서 처리한다음
    // 적절한 결과메시지, httpStatusCode 라는 것을 가지고 응답메시지를 만들고 다시 클라이언트에 전달

    //@RequestMapping(method=RequestMethod.GET, path="/hello-world") 스프링의 예전방식.
    // 지금은 간단하게 GetMapping()을 선언한다.
    @GetMapping(path = "/hello-world") //path 는 생략 가능, 다른 속성을 부여하려면 써야함.
    public String helloWorld() {
        return "Hello World";
    }
    //서버가 돌아가고 있을 때 클래스를 변경할 경우 재부팅 need

    // 단축키 alt + enter (퀵 픽스)
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");//인스턴스 형태로 반환
    }
}

package com.example.restfullwebservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// lombok : 빈 클래스 만들 때 getter, setter,
// 생성자, toString() 자동으로 생성해줌.
// 시간 단축, 생산성 up
// 이 라이브러리 사용하기 위해서는 인텔리제이 디펜던시 옵션을 켜주어야 함.
// setting -> build, execution, deployment -> compiler ->annotation processors :
// 여기서 enable annotation processing 을 활성화.

// lombok이 지원하는 @AllArgsConstructor 와 직접 작성한 생성자가 동시에 존재하면 Bean 오류 발생함.
// lombok 이라는 플러그인을 설치하면 이 에러를 밑줄로 추가해준다.

// @NoArgsConstructor -> 아무것도 없는 기본 생성자를 사용하고 싶다
public class HelloWorldBean {
    private String message;

}

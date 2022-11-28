package com.kakao.map.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// 위의 어노테이션이 있어야만 가능함
public class PageLoadTestController {

    // 메소드 호출이 요청 리턴이 응답
    // 응답을 할떄는 데이터 응답을 해줘야한다.
    // 응답할때는 text가 왓다갔다 하거나 바이너리가 왓다갔다 한다.(할수있는것)
    // 바이너리 : 2진수
    // html파일을 응답

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String test1() {
        System.out.println("t1요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String test2() {
        System.out.println("t2요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String test3() {
        System.out.println("test2요청 들어옴?");
        return "test/test2";
    }

    @RequestMapping(value = "/kakaomap", method = RequestMethod.GET)
    public String kakaoMap() {
        System.out.println("map요청");
        return "map";
    }



}

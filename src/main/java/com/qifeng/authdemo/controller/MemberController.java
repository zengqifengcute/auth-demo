package com.qifeng.authdemo.controller;

import com.qifeng.authdemo.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/12 17:16
 */
@RestController
@RequestMapping("member")
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);


    @GetMapping("getMemberInfo")
    public Member getMemberInfo(@RequestAttribute Integer userId) {
        logger.info("预设值的用户id={}", userId);
        Member member = new Member();
        member.setId(1);
        member.setUsername("铁蛋");
        member.setPassword("123456");
        return member;
    }
}

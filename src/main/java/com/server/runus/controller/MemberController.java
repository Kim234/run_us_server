package com.server.runus.controller;

import com.server.runus.service.MemberService;
import com.server.runus.vo.MemberVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/signup")
@Tag(name = "SignUp", description = "SignUp Test")
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signUp/do")
    @Operation(summary = "업체 회원가입", description = "업체 측에서 회원가입 할 때 사용하는 API")
    @ApiResponses({
        @ApiResponse(responseCode  = "200", description = "성공입니다.")
        , @ApiResponse(responseCode  = "400", description = "접근이 올바르지 않습니다.")
    })
    public void signup(@RequestParam Map<String, String> signupForm) {
        MemberVO memberVO = new MemberVO(signupForm.get("id"), signupForm.get("password"));
        memberService.addMember(memberVO);
    }
}

package com.server.runus.service;

import com.server.runus.mapper.MemberMapper;
import com.server.runus.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public void addMember(MemberVO memberVO) {
        memberMapper.save(memberVO);
    }
}
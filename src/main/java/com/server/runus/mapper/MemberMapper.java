package com.server.runus.mapper;

import com.server.runus.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    void save(@Param("mem") MemberVO memberVO);
}
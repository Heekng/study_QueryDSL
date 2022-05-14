package com.heekng.querydsl.repository;

import com.heekng.querydsl.dto.MemberSearchCondition;
import com.heekng.querydsl.dto.MemberTeamDto;
import com.heekng.querydsl.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}

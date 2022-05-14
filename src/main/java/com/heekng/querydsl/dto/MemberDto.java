package com.heekng.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection // Dto도 QType으로 생성된다 -> comprilQuerydsl 필요
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

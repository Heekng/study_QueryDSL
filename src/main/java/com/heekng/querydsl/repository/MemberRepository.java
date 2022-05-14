package com.heekng.querydsl.repository;

import com.heekng.querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);


}

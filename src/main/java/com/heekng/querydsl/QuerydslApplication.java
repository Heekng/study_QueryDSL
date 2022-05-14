package com.heekng.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class QuerydslApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}

	// bean으로 등록함으로써 queryfactory를 인젝션 받아도 된다.
	// 동시성문제? JpaQueryFactory는 EntityManager에 의존하고, EntityManager은 트랜젝션 단위로 행동하기 때문에 동시성 문제가 없다.
	@Bean
	JPAQueryFactory jpaQueryFactory(EntityManager em) {
		return new JPAQueryFactory(em);
	}
}

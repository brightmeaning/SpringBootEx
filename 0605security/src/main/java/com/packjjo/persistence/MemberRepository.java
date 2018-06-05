package com.packjjo.persistence;

import org.springframework.data.repository.CrudRepository;

import com.packjjo.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

	
}

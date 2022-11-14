package com.kr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kr.model.Enrolledbatch;

public interface EnrolledRepository extends JpaRepository<Enrolledbatch, Integer> {

}

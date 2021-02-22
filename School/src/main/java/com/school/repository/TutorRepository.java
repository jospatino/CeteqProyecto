package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Integer> {

}

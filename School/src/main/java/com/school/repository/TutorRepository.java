package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.TutorModel;

@Repository
public interface TutorRepository extends JpaRepository<TutorModel, Integer> {

}

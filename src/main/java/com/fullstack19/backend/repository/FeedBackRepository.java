package com.fullstack19.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack19.backend.model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
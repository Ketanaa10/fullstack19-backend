package com.fullstack19.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack19.backend.model.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
package com.example.ddd.repository;

import com.example.ddd.entity.Article;

import java.util.Optional;

public interface AticleRepository extends Repository<Article, Long>{
    void save(Article article);
    Optional<Article> findById(Long id);

}

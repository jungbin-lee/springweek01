package com.sparta.springweek01.domain;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
}
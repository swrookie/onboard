package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}

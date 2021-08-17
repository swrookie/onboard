package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long>{

}

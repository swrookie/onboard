package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}

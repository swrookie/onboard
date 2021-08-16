package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}

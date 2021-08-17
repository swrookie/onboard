package com.swrookie.onboard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	Optional<UserEntity> findByEmail(String email);
}

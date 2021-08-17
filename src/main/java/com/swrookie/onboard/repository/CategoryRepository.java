package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findByLabel(String label);
}

package com.swrookie.onboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swrookie.onboard.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByLabel(String label);
}

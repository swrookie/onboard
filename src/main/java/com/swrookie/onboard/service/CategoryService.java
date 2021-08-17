package com.swrookie.onboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swrookie.onboard.domain.CategoryEntity;
import com.swrookie.onboard.dto.CategoryDto;
import com.swrookie.onboard.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
	private CategoryRepository categoryRepository;
	
	@Transactional
	public List<CategoryDto> getCategoryList() {
		List<CategoryEntity> categories = categoryRepository.findAll();
		List<CategoryDto> categoryDtoList = new ArrayList<>();
		
		for (CategoryEntity category: categories) {
			CategoryDto categoryDto = CategoryDto.builder()
											  	.id(category.getId())
											  	.label(category.getLabel())
											  	.orderNum(category.getOrderNum())
											  	.build();
			
			categoryDtoList.add(categoryDto);
		}
		
		return categoryDtoList;
	}
}

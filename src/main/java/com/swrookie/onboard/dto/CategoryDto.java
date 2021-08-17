package com.swrookie.onboard.dto;

import com.swrookie.onboard.domain.CategoryEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDto {
	private Long id;
	private String label;
	private int orderNum;
	
	@Builder
	public CategoryDto(Long id, String label, int orderNum) {
		this.id = id;
		this.label = label;
		this.orderNum = orderNum;
	}
	
	public CategoryEntity toEntity() {
		CategoryEntity category = CategoryEntity.builder()
									.id(id)
									.label(label)
									.orderNum(orderNum)
									.build();
		
		return category;
	}
}

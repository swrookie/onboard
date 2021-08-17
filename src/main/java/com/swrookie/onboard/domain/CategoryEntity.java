package com.swrookie.onboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "category")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CategoryEntity {
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "label", unique = true)
	private String label;
	@Column(name = "ordernum")
	private int orderNum;
	
	@Builder
	public CategoryEntity(Long id, String label, int orderNum) {
		this.id = id;
		this.label = label;
		this.orderNum = orderNum;
	}
}

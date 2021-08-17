package com.swrookie.onboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.swrookie.onboard.common.BaseTime;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "board")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class BoardEntity extends BaseTime {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Builder
	public BoardEntity(Long id) {
		this.id = id;
	}
}

package com.swrookie.onboard.dto;

import java.sql.Timestamp;

import com.swrookie.onboard.domain.BoardEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoardDto {
	private Long id;
	private Timestamp createDate;
	private Timestamp updateDate;
	
	@Builder
	public BoardDto(Long id, Timestamp createDate) {
		this.id = id;
		this.createDate = createDate;
	}
	
	public BoardEntity toEntity() {
		BoardEntity board = BoardEntity.builder()
						   .id(id)
						   .build();
		
		return board;
	}
}

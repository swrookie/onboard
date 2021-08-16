package com.swrookie.onboard.dto;

import java.sql.Timestamp;

import com.swrookie.onboard.domain.Board;

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
	
	public Board toEntity() {
		Board board = Board.builder()
						   .id(id)
						   .build();
		
		return board;
	}
}

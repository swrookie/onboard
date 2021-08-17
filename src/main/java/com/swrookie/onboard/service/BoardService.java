package com.swrookie.onboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swrookie.onboard.domain.BoardEntity;
import com.swrookie.onboard.dto.BoardDto;
import com.swrookie.onboard.repository.BoardRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardService {
	private BoardRepository boardRepository;
	
	@Transactional
	public List<BoardDto> getBoardList() {
		List<BoardEntity> boards = boardRepository.findAll();
		List<BoardDto> boardDtoList = new ArrayList<>();
		
		for (BoardEntity board: boards) {
			BoardDto boardDto = BoardDto.builder()
										.id(board.getId())
										.createDate(board.getCreateDate())
										.build();
			boardDtoList.add(boardDto);
		}
		
		return boardDtoList;
	}
	
	@Transactional
	public void setBoard(BoardDto boardDto) {
		boardRepository.save(boardDto.toEntity());
	}
}

package com.swrookie.onboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swrookie.onboard.domain.PostEntity;
import com.swrookie.onboard.dto.PostDto;
import com.swrookie.onboard.repository.PostRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostService {
	private PostRepository postRepository;
	
	@Transactional
	public List<PostDto> getPostList() {
		List<PostEntity> posts = postRepository.findAll();
		List<PostDto> postDtoList = new ArrayList<>();
		
		for (PostEntity post: posts) {
			PostDto postDto = PostDto.builder()
									 .id(post.getId())
									 .title(post.getTitle())
									 .content(post.getContent())
									 .createDate(post.getCreateDate())
									 .build();
			
			postDtoList.add(postDto);
		}
		
		return postDtoList;
	}
}

package com.swrookie.onboard.dto;

import java.sql.Timestamp;

import com.swrookie.onboard.domain.Post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PostDto {
	private Long id;
	private String title;
	private String content;
	private Timestamp createDate;
	private Timestamp updateDate;
	
	@Builder
	public PostDto(Long id, String title, String content, Timestamp createDate, Timestamp updateDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public Post toEntity() {
		Post post = Post.builder()
						.id(id)
						.title(title)
						.content(content)
						.build();
		
		return post;
	}
}

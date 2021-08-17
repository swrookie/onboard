package com.swrookie.onboard.dto;

import java.sql.Timestamp;

import com.swrookie.onboard.domain.UserEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private Timestamp createDate;
	private Timestamp updateDate;
	
	@Builder
	public UserDto(Long id, String firstName, String lastName, String userName,
				   String email, String password, Timestamp createDate, Timestamp updateDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public UserEntity toEntity() {
		UserEntity user = UserEntity.builder()
						.id(id)
						.firstName(firstName)
						.lastName(lastName)
						.userName(userName)
						.email(email)
						.password(password)
						.build();
		
		return user;
	}
}

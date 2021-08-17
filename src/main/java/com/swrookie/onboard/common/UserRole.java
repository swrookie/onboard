package com.swrookie.onboard.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserRole {
	ADMIN("ROLE_ADMIN"),
	MEMBER("ROLE_MEMBER");
	
	private String value;
}

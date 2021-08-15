package com.swrookie.onboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "member")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseTime{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(unique=true)
	private String userName;
	@Column(unique=true)
	private String email;
	@Column(name = "password")
	private String password;
}

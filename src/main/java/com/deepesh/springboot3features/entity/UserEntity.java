package com.deepesh.springboot3features.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "user_info")
@Data
@Setter
public class UserEntity {

	@Id
	private String userID;

	private String userName;
	private String userEmail;
	private String projectName;
	private String gbgf;
	private String password;
	private String role;
	private boolean status;

}

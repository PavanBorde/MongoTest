package com.Ecommerce.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString 
@NoArgsConstructor@AllArgsConstructor
@Document(collection = "User")
public class User {

	@Id
	private String userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;
	
}

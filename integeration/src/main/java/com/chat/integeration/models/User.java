package com.chat.integeration.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="user")
@TypeAlias("user")
public class User {

	 @Id 
	 private String id;
	 
	 @Field("name")
     private String name;
	 
	 @Field("gender")
     private String gender; 
	 
	 @Field("email")
     private String email;
	 
	 @Field("userName")
     private String userName;
	 
	 @Field("password")
     private String password;
	 
	 @Field("phone")
     private String phone;
	 
	 @Field("country_code")
     private int countryCode;
	 
	 @Field("user_type")
     private int userType;
	 
	 @Field("account_type")
     private int accountType;
	 
	 @Field("points")
     private int points;
}

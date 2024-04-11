package com.rubypaper.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Data
public class UserDTO {
	private String userName;
	private String userID;
	private String userPhone;
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String userName, String userID, String userPhone) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + "," + "userId=" + userID +", "
				+ "userPhone=" + userPhone + "]" ;
	}
}

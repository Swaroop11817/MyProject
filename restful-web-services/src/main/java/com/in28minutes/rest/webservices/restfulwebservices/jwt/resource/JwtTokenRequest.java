package com.in28minutes.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;

	//{
	//    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU3MzQ1ODk5MSwiaWF0IjoxNTcyODU0MTkxfQ.93KuXkZc7v8TuNd7O8q9yGJstqym3Wwb65rkop5-ZkL1az7nLBa1VRBuYRUcs1yKEOGSS2ZCge7d5r1cuyqUlQ"
	//}

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
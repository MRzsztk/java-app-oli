package com.accenture.jumpstart.devops.model;

public class Basket {

	private final long id;
	private final String content;

	public Basket(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}


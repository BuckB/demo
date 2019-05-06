package br.com.bruno.demo;

public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Greeting() {
		this.id = -1;
		this.content = "";
	}

	public long getId() {
		return this.id;
	}

	public String getContent() {
		return this.content;
	}
}

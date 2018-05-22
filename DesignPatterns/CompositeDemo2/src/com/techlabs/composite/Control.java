package com.techlabs.composite;

public class Control implements HtmlTag {

	private String tagName;

	public Control(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void generateHtml() {
		System.out.println("<" + tagName + "> " + "</" + tagName + ">");

	}

}

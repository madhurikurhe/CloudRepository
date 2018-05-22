package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements HtmlTag {

	private String tagName;
	private List<HtmlTag> childrenTag;

	public ControlGroup(String tagName) {
		this.tagName = tagName;
		this.childrenTag = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	public void addChildTag(HtmlTag htmlTag) {
		childrenTag.add(htmlTag);
	}

	@Override
	public void generateHtml() {
		System.out.println("<" +tagName +">");
		for (HtmlTag tag : childrenTag) {
			tag.generateHtml();
		}
		System.out.println("</"+tagName +">");
	}

}

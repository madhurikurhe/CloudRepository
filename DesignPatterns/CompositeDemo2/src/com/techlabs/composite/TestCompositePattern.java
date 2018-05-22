package com.techlabs.composite;

public class TestCompositePattern {

	public static void main(String[] args) {

		ControlGroup parentTag = new ControlGroup("html");

		ControlGroup body = new ControlGroup("body");
		parentTag.addChildTag(body);

		ControlGroup div = new ControlGroup("div");
		body.addChildTag(div);

		Control child1 = new Control("p");
		div.addChildTag(child1);

		child1 = new Control("button");
		div.addChildTag(child1);

		child1 = new Control("textbox");
		body.addChildTag(child1);

		parentTag.generateHtml();

	}

}
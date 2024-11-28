package com.abhi.lc.editors;

import java.beans.PropertyEditorSupport;

public class NameCustomEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(text.toUpperCase());
	}

}

package com.exercise1.graphics_editor;

public class PngFile implements IFile {

	@Override
	public void openFile() {
		System.out.println("Open Png file");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse Png file");
	}

	@Override
	public void saveFile() {
		System.out.println("Save Png file");
	}
    
}

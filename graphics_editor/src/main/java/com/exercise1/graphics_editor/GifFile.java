package com.exercise1.graphics_editor;

public class GifFile implements IFile {

	@Override
	public void openFile() {
		System.out.println("Open Gif file");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse Gif file");
	}

	@Override
	public void saveFile() {
		System.out.println("Save Gif file");
	}
    
}

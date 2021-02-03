package com.exercise1.graphics_editor;

class BmpFile implements IFile {

	@Override
	public void openFile() {
		System.out.println("Open Bmp file");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse Bmp file");
	}

	@Override
	public void saveFile() {
		System.out.println("Save Bmp file");
	}
}
package com.exercise1.graphics_editor;

public class JpgFile implements IFile {

	@Override
	public void openFile() {
		System.out.println("Open Jpg file");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse Jpg file");
	}

	@Override
	public void saveFile() {
		System.out.println("Save Jpg file");
	}
    
}

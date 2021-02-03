package com.exercise1.graphics_editor;

public class GraphicsEditorApplication {

	public static void main(String[] args) {
		FileCreator creator = new FileCreator();
		IFile bmp = creator.createFileEditor("bmp");
		bmp.openFile();
		bmp.parseFile();
		bmp.saveFile();

		IFile gif = creator.createFileEditor("gif");
		gif.openFile();
		gif.parseFile();
		gif.saveFile();

		IFile png = creator.createFileEditor("png");
		png.openFile();
		png.parseFile();
		png.saveFile();

		IFile jpg = creator.createFileEditor("jpg");
		jpg.openFile();
		jpg.parseFile();
		jpg.saveFile();
	}

}

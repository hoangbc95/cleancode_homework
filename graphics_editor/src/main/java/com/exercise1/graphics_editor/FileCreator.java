package com.exercise1.graphics_editor;

public class FileCreator {

    public IFile createFileEditor(String fileType) {
        switch (fileType) {
            case "bmp":
                return new BmpFile();
            case "gif":
                return new GifFile();
            case "png":
                return new PngFile();
            case "jpg":
                return new JpgFile();
            default:
                return null;
        }
    }
}

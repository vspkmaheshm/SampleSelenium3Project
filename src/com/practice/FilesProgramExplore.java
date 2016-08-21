package com.practice;

import java.io.File;

public class FilesProgramExplore {

	public static void main(String[] args) {
		File file = new File("C:\\test\\myFolder");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.lastModified());
		System.out.println(file.canWrite());
		System.out.println(file.mkdir());

	}

}

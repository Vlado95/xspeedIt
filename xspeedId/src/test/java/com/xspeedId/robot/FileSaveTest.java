package com.xspeedId.robot;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Test;

import com.xspeedid.robot.FileSave;

public class FileSaveTest {

	@Test
	public void testSaveFileDataCross() throws Exception {
		FileSave fileSave = new FileSave();
		String source ="datacross";
		String fileName="datacrossImage.jpg";
		File file = new File("./images/image.jpg");
		byte[] data = Files.readAllBytes(file.toPath());
	    fileSave.saveFile(source, fileName, data);
	}
	
	@Test
	public void testSaveFileResoScan() throws Exception {
		FileSave fileSave = new FileSave();
		String source ="resoscan";
		String fileName="resoscanImage.jpg";
		File file = new File("./images/image.jpg");
		byte[] data = Files.readAllBytes(file.toPath());
	    fileSave.saveFile(source, fileName, data);
	}

}

package com.xspeedid.robot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

public class FileSave {

	public void saveFile(String source, String fileName, byte[] data){
		FileWrapper fileWrapper = new FileWrapper(fileName, data);
		fileWrapper.save(source);
	}
	private enum FileEnum{
		DATACROSS("datacross",wraper->{
			try {
				File file =new File("./datacross/");
				file.mkdirs();
				FileOutputStream fos = new FileOutputStream("./datacross/"+wraper.fileName);
				try {
					fos.write(wraper.data);
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}),
		RESOSCAN("resoscan",wraper->{
			try {
				File file =new File("./resoscan/");
				file.mkdirs();
				FileOutputStream fos = new FileOutputStream("./resoscan/"+wraper.fileName);
				try {
					fos.write(wraper.data);
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}),
		INCONUE("",wraper->{});
		
		private String libelle;
		private Consumer<FileWrapper> fWrapper ;
		FileEnum(String libelle,Consumer<FileWrapper> fWrapper) {
			this.libelle = libelle;
			this.fWrapper = fWrapper;
		}

		private static FileEnum findByLibelle(String libelle) {
			return Arrays.stream(FileEnum.values()).filter(value -> value.libelle == libelle)
					.findFirst().orElse(INCONUE);
		}
		private void save(FileWrapper fWrapper){
			this.fWrapper.accept(fWrapper);	
		}
	}
	
	private class FileWrapper{
		private String fileName;
		private byte[] data;
		private FileWrapper(String fileName,byte[] data) {
			this.fileName=fileName;
			this.data= data;
		}
		
		private void save(String source){
			FileEnum fileEnum = FileEnum.findByLibelle(source);
			fileEnum.save(this);
		}
		
	}
}

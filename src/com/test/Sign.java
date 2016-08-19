package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sign {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = null;
		//FileOutputStream fos=null;
		Date date=new Date();   
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String time="今天来的时间"+df.format(date);
		f=new File("D://Sign.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		//byte[] br=time.getBytes();
		
		//fos=new FileOutputStream(f);
		FileWriter fw=new FileWriter(f, true);
		
		
		fw.write(time);
		fw.append("\r\n");
		fw.flush();
		
		
	}
		
		
}

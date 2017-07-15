package com.javase.io;

import java.io.*;
import java.util.zip.*;

/**
 * 解压 1.递归函数中的zipEntry用于遍历目录进入点，初值为使用getNextEntry获取的第一个值；
 * 2.分文件夹与文件两种情况处理：各自创建；
 * 3.对文件使用getNextEntry遍历同级的其他文件与文件夹，对文件夹使用getNextEntry遍历目录下的子文件与文件夹
 */
public class ZipInputStream03 {

	private static String parentPath;

	public static void zip(File zipFile) throws Exception {

		parentPath = zipFile.getParent();

		FileInputStream input = new FileInputStream(zipFile);
		ZipInputStream zipInput = new ZipInputStream(input);
		ZipEntry zipEntry = zipInput.getNextEntry();
		System.out.println("name000:" + zipEntry.getName());
		zip(zipInput, zipEntry);
		zipInput.close();
	}

	public static void zip(ZipInputStream zipInput, ZipEntry zipEntry) throws Exception {
		File file = new File(parentPath + "/" + zipEntry.getName());
		if (zipEntry.isDirectory()) {
			if (!file.exists())
				file.mkdirs();

			ZipEntry tempEntry = zipInput.getNextEntry();
			if (tempEntry != null)
				zip(zipInput, tempEntry);
		} else {
			/*if (!file.exists())
				file.createNewFile();*/
			File parentFile = file.getParentFile();
			if (parentFile != null && !parentFile.exists())
				parentFile.mkdir();

			FileOutputStream out = new FileOutputStream(file);
			int b;
			while ((b = zipInput.read()) != -1)
				out.write(b);
			out.flush();
			out.close();

			ZipEntry tempEntry = zipInput.getNextEntry();
			if (tempEntry != null)
				zip(zipInput, tempEntry);
		}
	}

	public static void main(String[] args) throws Exception {
		zip(new File("D:/unzip/1.zip"));
	}

}

package com.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

/**
 * 压缩流使用ZipOutputStream将文件写入压缩文件中：首先写入目录进入点。目录进入点是文件在压缩文件中的映射。
 * 
 * @author tonghuo
 *
 */
public class ZipTest {

	private String parent = null;

	/**
	 * 压缩一个文件
	 * 
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		File file = new File("d:/Test/Test.java");

		FileInputStream fis = new FileInputStream(file);
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("d:/Test/Test.zip"));

		ZipEntry entry = new ZipEntry("d/" + file.getName());
		zos.putNextEntry(entry);

		int len = 0;
		byte[] buf = new byte[1024];
		while ((len = fis.read(buf)) != -1) {
			zos.write(buf, 0, len);
		}
		zos.flush();
		fis.close();
		zos.close();
	}

	/**
	 * 压缩一个文件夹
	 * 
	 * @throws IOException
	 */
	public void zipDirectory(String path) throws IOException {
		File file = new File(path);
		String parent = file.getParent();
		System.out.println("parent:" + parent);
		File zipFile = new File(parent, file.getName() + ".zip");
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
		zip(zos, file, file.getName());
		zos.flush();
		zos.close();
	}

	/**
	 * 
	 * @param zos
	 *            压缩输出流
	 * @param file
	 *            当前需要压缩的文件
	 * @param path
	 *            当前文件相对于压缩文件夹的路径
	 * @throws IOException
	 */
	private void zip(ZipOutputStream zos, File file, String path) throws IOException {
		if (file.isDirectory()) {
			ZipEntry entry = new ZipEntry(path + File.separator);
			zos.putNextEntry(entry);
			File[] files = file.listFiles();
			for (File x : files) {
				zip(zos, x, path + "/" + x.getName());
			}
		} else {
			FileInputStream fis = new FileInputStream(file);// 目录进入点的名字是文件在压缩文件中的路径
			ZipEntry entry = new ZipEntry(path);
			zos.putNextEntry(entry);// 建立一个目录进入点

			int len = 0;
			byte[] buf = new byte[1024];
			while ((len = fis.read(buf)) != -1) {
				zos.write(buf, 0, len);
			}
			zos.flush();
			fis.close();
			zos.closeEntry();// 关闭当前目录进入点，将输入流移动下一个目录进入点
		}
	}

	@Test
	public void testZip() throws IOException {
		zipDirectory("d:/zip/1");
	}

	public void unzip(String unzip) throws IOException {
		File file = new File(unzip);
		parent = file.getParent();
		FileInputStream fis = new FileInputStream(file);

		ZipInputStream zis = new ZipInputStream(fis);
		unzip(zis);
	}

	private void unzip(ZipInputStream zis) throws IOException {
		ZipEntry entry = zis.getNextEntry();
		System.out.println("entry:" + entry);
		if (entry != null) {
			File file = new File(parent + File.separator + entry.getName());
			System.out.println("absolutePath:" + file.getAbsolutePath());
			if (file.isDirectory()) {
				if (!file.exists())
					file.mkdirs();
				unzip(zis);
			} else {
				System.out.println("else");
				System.out.println("else absolutePath:" + file.getAbsolutePath());
				File parentFile = file.getParentFile();
				if (parentFile != null && !parentFile.exists())
					parentFile.mkdirs();
				FileOutputStream fos = new FileOutputStream(file);
				int len = 0;
				byte[] buf = new byte[1024];
				while ((len = zis.read(buf)) != -1) {
					fos.write(buf, 0, len);
				}
				fos.flush();
				fos.close();
				zis.closeEntry();
				unzip(zis);
			}
		}
	}

	@Test
	public void testUnzip() throws IOException {
		unzip("d:/unzip/1.zip");
	}

}

package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * File的路径名有两种方式：1.相对路径，不以/开头，相对于项目；2.决定路径，以/开头，相对于项目所在盘符；
 * 
 * @author tonghuo
 *
 */
public class DateInputStreamTest {
	public static void main(String[] args) {
		File file = new File("Files/dateInputStream.txt");
		File parentFile = file.getParentFile();
		System.out.println("父目录绝对路径：" + parentFile.getAbsolutePath());
		if (!parentFile.exists()) {
			parentFile.mkdirs();// mkdirs()可以创建多层不存在的目录，mkdir()只可以创建一层不存在的目录，当用创建多层不存在目录时，该方法将抛出异常，不创建任何目录
		}

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			/*
			 * 获取文件对象的绝对路径
			 */
			String absolutePath = file.getAbsolutePath();
			System.out.println("absolutePath:" + absolutePath);

			/*
			 * 创建数据输出流向文件中写入数据
			 */
			FileOutputStream output = new FileOutputStream(file);
			DataOutputStream dataOut = new DataOutputStream(output);
			dataOut.writeUTF("a");
			dataOut.writeInt(3);
			dataOut.writeBytes("今天是个好日子");
			// dataOut.writeInt(4);

			FileInputStream input = new FileInputStream(file);
			DataInputStream dataIn = new DataInputStream(input);// 数据输入流是一个装饰者，装饰了InputStream

			String a01 = dataIn.readUTF();
			int a02 = dataIn.readInt();
			int a03 = dataIn.readByte();
			System.out.println("a01------" + a01);
			System.out.println("a02------" + a02);
			System.out.println("a03------" + a03);
			dataOut.close();
			dataIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

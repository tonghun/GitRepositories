package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * File��·���������ַ�ʽ��1.���·��������/��ͷ���������Ŀ��2.����·������/��ͷ���������Ŀ�����̷���
 * 
 * @author tonghuo
 *
 */
public class DateInputStreamTest {
	public static void main(String[] args) {
		File file = new File("Files/dateInputStream.txt");
		File parentFile = file.getParentFile();
		System.out.println("��Ŀ¼����·����" + parentFile.getAbsolutePath());
		if (!parentFile.exists()) {
			parentFile.mkdirs();// mkdirs()���Դ�����㲻���ڵ�Ŀ¼��mkdir()ֻ���Դ���һ�㲻���ڵ�Ŀ¼�����ô�����㲻����Ŀ¼ʱ���÷������׳��쳣���������κ�Ŀ¼
		}

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			/*
			 * ��ȡ�ļ�����ľ���·��
			 */
			String absolutePath = file.getAbsolutePath();
			System.out.println("absolutePath:" + absolutePath);

			/*
			 * ����������������ļ���д������
			 */
			FileOutputStream output = new FileOutputStream(file);
			DataOutputStream dataOut = new DataOutputStream(output);
			dataOut.writeUTF("a");
			dataOut.writeInt(3);
			dataOut.writeBytes("�����Ǹ�������");
			// dataOut.writeInt(4);

			FileInputStream input = new FileInputStream(file);
			DataInputStream dataIn = new DataInputStream(input);// ������������һ��װ���ߣ�װ����InputStream

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

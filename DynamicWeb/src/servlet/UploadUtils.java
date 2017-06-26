package servlet;

import java.util.Scanner;

import javax.servlet.http.Part;

public class UploadUtils {
	@SuppressWarnings("resource")
	public static String getFileName(Part p) {

		String header = p.getHeader("content-disposition");
		String reg = ".*filename=";
		Scanner scanner = new Scanner(header).useDelimiter(reg);
		String s = scanner.next();
		String filename = s.substring(1, s.length() - 1);
		if (filename.indexOf("\\") != -1)
			filename = filename.substring(filename.lastIndexOf("\\") + 1);
		return filename;
	}

}

package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter���������е�Ӧ��
 * @author adminitartor
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos
			= new FileOutputStream("pw2.txt");
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		PrintWriter pw 
			= new PrintWriter(osw);
		
		pw.println("�㻹Ҫ��������Ҫ������");
		pw.println("��ͻȻ���Ķ��ž͹��ұ��ˡ�");
		
		System.out.println("д�����!");
		
		pw.close();
	}
}






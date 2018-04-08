package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ���±�����
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();
		FileOutputStream fos
			= new FileOutputStream(fileName);
		OutputStreamWriter osw
			= new OutputStreamWriter(fos);
		/*
		 * PrintWriter���������еĹ��췽��:
		 * PrintWriter(OutputStream out)
		 * PrintWriter(Writer out)
		 * ʹ���������췽���ǣ���һ����Ӧ�����ع���
		 * ����Ҫ����ڶ����������ò���Ϊbooleanֵ
		 * ����ֵΪtrue,��PW�����Զ���ˢ�¹��ܣ���:
		 * ÿ��ʹ��pw.println()д�����ݺ󶼻��Զ�
		 * ����flush������
		 * PrintWriter(OutputStream out,boolean autoflush)
		 * PrintWriter(Writer out,boolean autoflush)
		 */
		PrintWriter pw 
			= new PrintWriter(osw,true);		
		System.out.println("�뿪ʼ��������:");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("�ټ�!");
		pw.close();
	}
}









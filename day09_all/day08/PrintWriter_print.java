package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ���
 * �����ַ������û�������������߶�д�ַ�Ч�ʣ�
 * ���һ����ַ������ص��ǿ��԰��ж�д�ַ�����
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 * java.io.PrintWriter�ǳ��õĻ����ַ��������
 * ���һ��ṩ���Զ���ˢ�¹��ܡ����ڴ���PrintWriter
 * ʱ���ڲ�����Ƕ��BufferedWriter,����ʵ�ʵĻ���
 * ��������BufferedWriterʵ�֡�
 * 
 * 
 * 
 * @author adminitartor
 *
 */
public class PrintWriter_print {
	public static void main(String[] args) throws IOException {
		/*
		 * PW֧��ֱ�Ӷ��ļ������Ĺ��췽��
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * Ҳ���԰���ָ�����ַ�������PW
		 * PrintWriter(String path,String csn)
		 * PrintWriter(File file,String csn)
		 * 
		 * cns:charset name,�ַ�������
		 * 
		 */		
		PrintWriter pw 
			= new PrintWriter("pw.txt","UTF-8");		
		pw.println("ҹ������������,");
		pw.println("�ܷ�����,");
		pw.println("����������,�ĵ׵Ĺ¶���̾Ϣ");
		
		System.out.println("д�����!");
		pw.close();

	}
}









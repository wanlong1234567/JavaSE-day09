package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java��������д���ݵĵ�λ����Ϊ:�ֽ������ַ���
 * �ֽ������ֽ�Ϊ��λ��д���ݡ�
 * �ַ������ַ�(unicode)Ϊ��λ��д���ݣ����ǵײ�
 * �����ϻ��Ƕ�д�ֽڣ�ֻ���ֽ����ַ���ת��������
 * �ַ������
 * 
 * Writer��Reader�������ַ����ĸ��࣬������һ��
 * �����࣬�涨�������ַ�����Ҫ�߱��Ķ�д�ַ�������
 * 
 * ת����
 * OutputStreamWriter��InputStreamReader��
 * �ַ�����һ�Գ���ʵ���ࡣ
 * 
 * @author adminitartor
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * OSW�Ĺ��췽��֧�ֵڶ�������������ָ��
		 * �ַ���������ͨ������д�����ַ����ᰴ��
		 * ָ�����ַ���ת��������ָ���ڶ���������
		 * ����ϵͳĬ���ַ���ת����
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("�ҵĻ���Ь,");
		osw.write("ʱ��ʱ����ʱ�С�");
		osw.write("���ǹ⻬����·�����ϴ���ﻬ!");
		
		System.out.println("д�����!");
		osw.close();
	}
}











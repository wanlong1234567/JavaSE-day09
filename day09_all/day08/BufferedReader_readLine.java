package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * ���԰��ж�ȡ�ַ���
 * @author adminitartor
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream(
				"src"+File.separator+
				"day08"+File.separator+
				"BufferedReader_readLine.java"
			);
		InputStreamReader isr
			= new InputStreamReader(fis);
		BufferedReader br
			= new BufferedReader(isr);
		
		/*
		 * BufferedReader�ṩ����:
		 * String readLine()
		 * ������ȡ�����ַ���ֱ����ȡ�˻��з�Ϊֹ��
		 * ��֮ǰ�������ַ���һ���ַ�����ʽ���ء�
		 * ע��:���ص��ַ������ǲ��������Ļ��з���
		 * ������ֵΪnull�����ʾĩβ��
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}









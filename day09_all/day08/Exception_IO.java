package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �쳣��IO�����еĴ���ʽ
 * 
 * 
 * ������:
 * �����:final,finally,finalize������
 * 
 * @author adminitartor
 *
 */
public class Exception_IO {
	/**
	 * ��һ�����󼴽���GC�ͷ�ǰ��GC����øö���
	 * ��finalize���������ú�ö��󼴱��ͷš�
	 * finalize������Obeject����ķ�����
	 * 
	 */
	protected void finalize() throws Throwable {
		
	}
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("���".getBytes());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
			}
		}
		
	}
}







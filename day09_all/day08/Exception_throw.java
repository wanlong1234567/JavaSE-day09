package day08;
/**
 * �����쳣���׳�
 * @author adminitartor
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			/*
			 * ������һ������throws�����쳣�׳�
			 * �ķ���ʱ��������Ҫ������д����
			 * �쳣���ֶΣ�û������벻ͨ����
			 * �����ֶ�������:
			 * 1:ʹ��try-catch���񲢴�����쳣
			 * 2:�ڵ�ǰ�����ϼ���ʹ��throws��
			 *   ���쳣�׳���
			 *   
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}
}






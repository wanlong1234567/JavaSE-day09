package day08;
/**
 * �쳣��һЩ����
 * @author adminitartor
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("����ʼ��.");
		try {
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			/*
			 * ��������ջ��Ϣ�������ڶ�λ����Ĵ���
			 * �Ա�����������
			 */
			e.printStackTrace();
			/*
			 * ��ȡ������Ϣ��ͨ���Ǹô�����ֵ�ԭ��
			 */
			String message = e.getMessage();
			System.out.println(message);
			
		}
		System.out.println("���������.");
	}
}



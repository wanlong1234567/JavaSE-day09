package day09;
/**
 * Thread�ṩ��һ����̬����:
 * static void sleep(long ms)
 * �÷������Խ����е�ǰ�������߳�����ָ������
 * @author adminitartor
 *
 */
public class Thrread_sleep {
	public static void main(String[] args) {
		System.out.println("����ʼ��");		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("���������");
	}
}









package day08;
/**
 * �쳣��������е�finally��
 * 
 * finally��ֻ�ܶ������쳣������Ƶ���󣬼���
 * try֮��������һ��catch֮��
 * finally����Ա�֤����try�����еĴ����Ƿ�
 * �׳��쳣��finally���еĴ��붼�ؽ�ִ�С�
 * ����ͨ���Ὣ�޹غ��쳣��Ҫָ���Ĵ������finally
 * ����ȷ��ִ�У�����IO�����еĹر��������� 
 * @author adminitartor
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("����ʼ��!");
		try {
			String str = "";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("������!");
		} finally{
			System.out.println("finally�еĴ���ִ����!");
		}
		System.out.println("���������!");
	}
}








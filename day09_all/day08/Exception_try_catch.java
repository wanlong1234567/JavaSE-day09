package day08;
/**
 * �쳣��������е�try-catch
 * @author adminitartor
 *
 */
public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "a";
			System.out.println(str.length());			
			System.out.println(str.charAt(0));	
			System.out.println(Integer.parseInt(str));
			/*
			 * try�����г���������µ����д���
			 * ���������С�
			 */
			System.out.println("!!!!");
			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�������ַ����±�Խ��!");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ��!");
		/*
		 * catch���Զ����������try������п���
		 * ���ֵ��쳣�в�ͬ����ʽʱ����Ҫ��������
		 * ��Щ�쳣����д����ֶεĴ��롣
		 * ����Ӧ������һ��ϰ�ߣ���������󲶻�
		 * Exception,������������׳�һ��δ�����
		 * �쳣���³�����ܳ����жϵ������
		 * ��������쳣֮����ڼ̳й�ϵʱ����Ҫ��
		 * �����쳣�����������Ȳ��񣬺��常����
		 * �쳣.
		 * 
		 */
		}catch(Exception e){
			System.out.println("�������ǳ��˸���!");
		}
		
		System.out.println("���������");
	}
}










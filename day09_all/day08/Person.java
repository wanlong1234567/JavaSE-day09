package day08;
/**
 * ʹ�õ�ǰ������쳣�׳��Ĺ���
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * ͨ����һ������ʹ��throw�׳�һ���쳣ʱ����
	 * ��Ҫ�ڵ�ǰ������ʹ��throws������쳣���׳�
	 * ��֪ͨ�����ߡ�ֻ��RuntimeException��������
	 * �쳣�׳�ʱ���Բ����壬������붨�塣
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age)throws IllegalAgeException {
		/*
		 * ������Ĳ���������ҵ���߼�Ҫ��
		 * �������䲻��0-100֮���������Ϊ������
		 * Ҫ��ʱ�����Ե����쳣�׳���������
		 */
		if(age<0||age>100){
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
}	








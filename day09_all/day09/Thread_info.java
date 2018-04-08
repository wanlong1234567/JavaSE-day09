package day09;
/**
 * ��ȡ�߳������Ϣ�ķ���
 * @author adminitartor
 *
 */
public class Thread_info {
	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread t = Thread.currentThread();
		
		//��ȡ�߳�����
		String name = t.getName();
		System.out.println("name:"+name);
		
		//��ȡ�߳�ID(Ψһ��ʾ)
		long id = t.getId();
		System.out.println("id:"+id);
		
		//�߳����ȼ�
		int priority = t.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		//�̻߳״̬
		boolean isAlive = t.isAlive();
		
		//�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = t.isDaemon();
		
		//�Ƿ��ж�
		boolean isInterrupted = t.isInterrupted();
		System.out.println("isAlive:"+isAlive);
		System.out.println("isDaemon:"+isDaemon);
		System.out.println("isInterrupted:"+isInterrupted);
		
	}
}








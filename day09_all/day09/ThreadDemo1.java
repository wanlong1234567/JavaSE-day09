package day09;
/**
 * ���߳�
 * ���߳������δ���"ͬʱ"(����)���С�
 * 
 * �����߳������ַ�ʽ����ʽһ:
 * �̳�Thread����дrun������
 * @author adminitartor
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * �����̵߳���start��������Ҫֱ�ӵ���
		 * �̵߳�run������
		 * ��start����ִ����Ϻ��߳������߳�
		 * ���ȣ�һ�����̻߳�ȡCPUʱ��Ƭ��ʼ����
		 * ʱ���Զ������Լ���run������ʼ������
		 */
		t1.start();
		t2.start();
	}
}
/**
 * ��һ�ִ����̵߳ķ�ʽ����������:
 * 1:����java�ǵ��̳У���͵��¼̳���Thread�� 
 *   �����ټ̳������ࡣʵ�ʿ����лᵼ����಻�㡣
 * 2:���ڽ�run������д�����߳�Ҫִ�е��������
 *   ��������run�����У��͵��¸��߳���������һ��
 *   ��Ȼ����Ϲ�ϵ���������̵߳����á�  
 * @author adminitartor
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭��?");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ���!");
		}
	}
}














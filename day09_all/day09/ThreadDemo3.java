package day09;
/**
 * ʹ�������ڲ�������̵߳����ַ�ʽ����
 * @author adminitartor
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��?");
				}
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i =0;i<1000;i++){
					System.out.println("���ǲ�ˮ���!");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}






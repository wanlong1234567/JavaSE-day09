package day09;
/**
 * �ػ��߳�
 * ��һ�����̽���ʱ�����������е��ػ��̻߳�ǿ�ƽ���
 * ��һ������������ǰ̨�߳̽���ʱ�����̽�����
 * ����ͨ���Ὣ����һֱ���е����񣬵��ǵ�������Ҫ
 * ����������ʱ����һ���������������ػ��߳������С�
 * @author adminitartor
 *
 */
public class Thread_setDaemon {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:����������AAAAAAAaaaaa.....");
				System.out.println("Ч��:��ͨ");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump! i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		//���ú�̨�߳�Ҫ��start֮ǰ����
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
	}
}










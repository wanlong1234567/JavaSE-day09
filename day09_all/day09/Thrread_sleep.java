package day09;
/**
 * Thread提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法可以将运行当前方法的线程阻塞指定毫秒
 * @author adminitartor
 *
 */
public class Thrread_sleep {
	public static void main(String[] args) {
		System.out.println("程序开始了");		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("程序结束了");
	}
}









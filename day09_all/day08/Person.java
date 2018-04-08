package day08;
/**
 * 使用当前类测试异常抛出的规则
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * 通常当一个方法使用throw抛出一个异常时，就
	 * 需要在当前方法上使用throws定义该异常的抛出
	 * 以通知调用者。只有RuntimeException及其子类
	 * 异常抛出时可以不定义，否则必须定义。
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age)throws IllegalAgeException {
		/*
		 * 当传入的参数不满足业务逻辑要求
		 * 比如年龄不在0-100之间的数字认为不符合
		 * 要求时，可以当做异常抛出给调用者
		 */
		if(age<0||age>100){
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
}	








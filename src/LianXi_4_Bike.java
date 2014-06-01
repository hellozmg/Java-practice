
public class LianXi_4_Bike {
	public static void main(String[] args) {
		Bike che=new Bike();
		che.name="自行车";
		
		//调用方法：红色的自行车在很快的行驶
		che.move("红色", "快");

		//调用方法：黑色的自行车开得太快撞到人了
		che.bad("黑色","快");
		
		//调用静态变量：打印自行车是绿色环保的交通工具
		System.out.println(Bike.word);
		
		//调用静态方法：在郑州，自行车是很方便的交通工具
		Bike.good();
	}
}
/**
 * 自己设计，写一个Bike类，并在上面的main中实例化Bike类的对象，并使用他的方法 要求： 
 * 1. 至少有2个实例变量 
 * 2. 至少有2个实例方法
 * 3. 至少有1个静态变量 
 * 4. 至少有1个静态方法
 * 
 * 
 */
class Bike {
	String name;
	
	String color;
	String speed;
	static String word="自行车是绿色环保的交通工具";
	
	void move(String color,String speed){
		System.out.println(color+"的"+name+"在很"+speed+"的行驶");
		
	}
	void bad(String color,String speed){
		System.out.println(color+"的"+name+"开得太"+speed+" 撞到人了");
	}
	static void good(){
		System.out.println("在郑州，自行车是很方便的交通工具");
	}

}

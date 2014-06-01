
public class LianXi_3_Car {


	public static void main(String[] args){
		Car aodiA8=new Car();
		//aodiA8.brand="奥迪";aodiA8.color="黑白色";aodiA8.speed="快";
		//1. 构建一个Car类的对象audiA8, 使得他的型号为: A8，他的品牌为: 奥迪，他的颜色为：黑白色，他的速度为：快
		//   全世界有20万种汽车
         
		//2. 调用方法，打印：黑白色的奥迪的A8正在很快地行驶
		aodiA8.move("黑白色", "奥迪", "A8", "快");

		
		//3. 调用方法，打印：黑白色的奥迪的A8停下来了
		aodiA8.stop("黑白", "奥迪", "A8");
		

		//4. 调用静态方法，基本上所有的汽车都能跑
		Car.canMove();

		
		//5. 调用静态变量，打印：全世界有20万种车
		System.out.println(Car.types);
	}
}

/**
 * 要求Car有如下属性：
 * id    //型号
 * brand //品牌
 * color //颜色
 * speed //速度
 * types //表示全世界汽车的种类
 * 
 * 要求Car有如下行为：
 * move 打印：XXX[颜色]的XXX[品牌]XXX[型号]正在很XXX[速度]地行驶
 * 
 * stop 打印     XXX[颜色]的XXX[品牌]XXX[型号]停下来了
 * 
 * canMove 打印： 基本上所有的汽车都能跑
 * 
 * @author Administrator
 *
 */
class Car{
	
	String brand;
	String color;
	String speed;
	String id;
	static String types="全世界有20万种车";
	
	void move(String color,String brand,String id,String speed){
		System.out.println(color+"的"+brand+id+"正在很"+speed+"地行驶");
	}
	void stop(String color,String brand,String id){
		System.out.println(color+"的"+brand+id+"停下来了");
	}
	static void canMove(){
		System.out.println("基本上所有的汽车都能跑");
	}

}
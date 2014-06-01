
public class LianXi_2_Fish {
	public static void main(String[] args){
		
		
		//1. 构建一个Fish类的对象jy, 使得他的名称为: 金鱼，他的颜色为：金黄色，他的速度为：慢, 全世界一共有1亿种鱼
		Fish jy=new Fish();
		jy.name="金鱼";
		
		
		//2. 调用方法，打印：金黄色的金鱼在很慢地游泳
		jy.swim("金黄色","慢");
		

		//3. 调用方法，打印：金黄色的金鱼在睡觉
		jy.sleep("金黄色");
		
		

		//4. 打印很多鱼睁着眼睡觉
		System.out.println("很多鱼睁着眼睛睡觉");
		
		

		//5. 调用静态方法，打印鱼都会游泳
		Fish.yu();

		//6. 调用静态变量，打印全世界有1亿种鱼
	    System.out.println(Fish.type);

	}
}

/**
 * 要求Fish有如下属性：
 * name  //名称
 * color //颜色
 * speed //速度
 * type;//全世界鱼一共有多少种类
 * 
 * 要求Fish有如下行为：
 * 1. swim，打印："XXX[颜色]的XXX[名称]在很XXX[速度]地游泳"
 * 2. sleep，打印："XXX[颜色]的XXX[名称]在睡觉"  
 * 3. canSwim ，打印：鱼都会游泳
 * 4. allSleep ，打印：很多鱼睁着眼睡觉
 * 
 * @author Administrator
 *
 */
class Fish{
	String name;
	
	static String type="全世界一共有1亿种鱼";
	
	
	
	void swim(String color,String speed){
		System.out.println(color+"的"+name+"在很"+speed+"的游泳");
	}
	void sleep(String color){
		System.out.println(color+"的"+name+"在睡觉");
	}
	static void yu(){
		System.out.println("鱼都会游泳");
	}


}

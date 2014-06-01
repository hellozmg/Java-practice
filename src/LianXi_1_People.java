


public class LianXi_1_People {
	public static void main(String[] args){
		
		//1. 声明一个人类的变量 zs，使得他的姓名是"张三"，性别是"男"，身高是"1.75米", 世界人口是60亿
		People zs=new People();
		zs.name="张三";
		zs.gender="男";
		zs.height="1.75";
		People.worldPopulation="6 billion";
		
		
		//2. 调用方法实现打印：张三睡板床
        zs.sleep("板床");
        
        
		//3. 调用方法实现打印：张三吃大米
        zs.eat("大米");
        
		//4. 调用静态方法，打印人性本善
        People.good();
       
		//5. 调用静态变量，打印全世界有6 billion人口
        System.out.println(People.worldPopulation);

	}
}


/**
 * People类
 * @author Administrator
 *
 */
class People{
	String name;//姓名
	String gender;//性别
	String height;//身高
	static String worldPopulation;//世界人口
	
	
	void eat(String food){
		System.out.println(name+"吃"+food);
	}
	void sleep(String bed){
		System.out.println(name+"睡"+bed);
	}
	static void good(){
		System.out.println("人性本善");
	}
}


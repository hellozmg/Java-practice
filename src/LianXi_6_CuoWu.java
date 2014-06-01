public class LianXi_6_CuoWu {
	public static void main(String[] args){
		//1. 构建一个CuoWu类的对象cw, 使得他的位置为：代码第5行第6个字，他的错误信息为：对静态方法的错误使用
		//   系统会产生的错误最低级别为7
		CuoWu cw=new CuoWu();
		cw.location="代码第5行第6个字";
		cw.message="对静态方法的错误使用";
		CuoWu.MIN="系统会产生的错误最低级别为7";
		

		//2. 调用方法，打印：在代码第5行第6个字出现了错误：对静态方法的错误使用
		cw.showError();

		
		//3. 调用静态变量，打印：系统会产生的错误最低级别为7
		System.out.println(CuoWu.MIN); 
		

		//4. 打印：任何错误都是需要处理的
		cw.needHandle();
		
		
		

	}
}

/**
 * 要求CuoWu有如下属性：
 * location    //位置
 * message     //错误信息
 * MIN         //系统会产生的错误最低级别
 * 
 * 要求WenJian有如下行为：
 * showError  打印：在XXX[位置]出现了错误：XXX[错误信息]
 * needHandle 打印：任何错误都是需要处理的
 * 
 * @author Administrator
 * 
 */
class CuoWu{
	String location;
	String message;
	static String MIN;
	
	void showError(){
		System.out.println("在"+location+"出现了错误："+message);
		
	}
	void needHandle(){
		System.out.println("任何错误都是需要处理的");
		
	}
	
	
}

public class LianXi_5_WenJian {

	public static void main(String[] args) {
		// 1. 构建一个WenJian类的对象wj, 使得他的位置：C:\1.txt, 他的大小: 1 byte, 他的内容：^_^
		//    32位电脑能支持的文件大小上限为: 4G
		WenJian wj=new WenJian();
		wj.path="C:\\1.txt";
		wj.size="1 byte";
		wj.content="^_^";
		WenJian.MAX="4G";
		
		

		// 2. 调用方法，打印：大小为1 byte的文件c:\1.txt的内容是^_^
		wj.read();

		
		// 3. 调用方法，打印： 想要把大小为1 byte的文件c:\1.txt删除掉
		wj.shanChu();
		

		// 4. 调用静态变量，打印：32为电脑能支持的文件大小上限为4G
		System.out.println("32位电脑能支持的文件大小上限为"+WenJian.MAX);

		// 5. 打印：文件一般都占用空间
		System.out.println("文件一般都占空间");

	}
}
/**
 * 要求WenJian有如下属性： 
 * path //位置 
 * size //大小 
 * content //内容
 * MAX  //32位电脑能支持的文件大小上限
 * 
 * 要求WenJian有如下行为：
 * read 打印: 大小为XXX的文件XXX[位置]的内容是XXX[内容] 
 * shanChu 打印：
 * 想要把大小为XXX的文件XXX[位置]删除掉
 * 
 * @author Administrator
 * 
 */
class WenJian {
	String path;
	String size;
	String content;
	static String MAX;
	//String size,String path,String content
	void read(){
		System.out.println("大小为"+size+"的文件"+path+"的内容是"+content);
		}
	void shanChu(){
		System.out.println("想要把大小为"+size+"的文件"+path+"删除掉");
	}
}

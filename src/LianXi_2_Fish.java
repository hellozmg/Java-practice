
public class LianXi_2_Fish {
	public static void main(String[] args){
		
		
		//1. ����һ��Fish��Ķ���jy, ʹ����������Ϊ: ���㣬������ɫΪ�����ɫ�������ٶ�Ϊ����, ȫ����һ����1������
		Fish jy=new Fish();
		jy.name="����";
		
		
		//2. ���÷�������ӡ�����ɫ�Ľ����ں�������Ӿ
		jy.swim("���ɫ","��");
		

		//3. ���÷�������ӡ�����ɫ�Ľ�����˯��
		jy.sleep("���ɫ");
		
		

		//4. ��ӡ�ܶ���������˯��
		System.out.println("�ܶ��������۾�˯��");
		
		

		//5. ���þ�̬��������ӡ�㶼����Ӿ
		Fish.yu();

		//6. ���þ�̬��������ӡȫ������1������
	    System.out.println(Fish.type);

	}
}

/**
 * Ҫ��Fish���������ԣ�
 * name  //����
 * color //��ɫ
 * speed //�ٶ�
 * type;//ȫ������һ���ж�������
 * 
 * Ҫ��Fish��������Ϊ��
 * 1. swim����ӡ��"XXX[��ɫ]��XXX[����]�ں�XXX[�ٶ�]����Ӿ"
 * 2. sleep����ӡ��"XXX[��ɫ]��XXX[����]��˯��"  
 * 3. canSwim ����ӡ���㶼����Ӿ
 * 4. allSleep ����ӡ���ܶ���������˯��
 * 
 * @author Administrator
 *
 */
class Fish{
	String name;
	
	static String type="ȫ����һ����1������";
	
	
	
	void swim(String color,String speed){
		System.out.println(color+"��"+name+"�ں�"+speed+"����Ӿ");
	}
	void sleep(String color){
		System.out.println(color+"��"+name+"��˯��");
	}
	static void yu(){
		System.out.println("�㶼����Ӿ");
	}


}

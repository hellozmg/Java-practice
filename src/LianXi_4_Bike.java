
public class LianXi_4_Bike {
	public static void main(String[] args) {
		Bike che=new Bike();
		che.name="���г�";
		
		//���÷�������ɫ�����г��ںܿ����ʻ
		che.move("��ɫ", "��");

		//���÷�������ɫ�����г�����̫��ײ������
		che.bad("��ɫ","��");
		
		//���þ�̬��������ӡ���г�����ɫ�����Ľ�ͨ����
		System.out.println(Bike.word);
		
		//���þ�̬��������֣�ݣ����г��Ǻܷ���Ľ�ͨ����
		Bike.good();
	}
}
/**
 * �Լ���ƣ�дһ��Bike�࣬���������main��ʵ����Bike��Ķ��󣬲�ʹ�����ķ��� Ҫ�� 
 * 1. ������2��ʵ������ 
 * 2. ������2��ʵ������
 * 3. ������1����̬���� 
 * 4. ������1����̬����
 * 
 * 
 */
class Bike {
	String name;
	
	String color;
	String speed;
	static String word="���г�����ɫ�����Ľ�ͨ����";
	
	void move(String color,String speed){
		System.out.println(color+"��"+name+"�ں�"+speed+"����ʻ");
		
	}
	void bad(String color,String speed){
		System.out.println(color+"��"+name+"����̫"+speed+" ײ������");
	}
	static void good(){
		System.out.println("��֣�ݣ����г��Ǻܷ���Ľ�ͨ����");
	}

}

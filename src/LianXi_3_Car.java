
public class LianXi_3_Car {


	public static void main(String[] args){
		Car aodiA8=new Car();
		//aodiA8.brand="�µ�";aodiA8.color="�ڰ�ɫ";aodiA8.speed="��";
		//1. ����һ��Car��Ķ���audiA8, ʹ�������ͺ�Ϊ: A8������Ʒ��Ϊ: �µϣ�������ɫΪ���ڰ�ɫ�������ٶ�Ϊ����
		//   ȫ������20��������
         
		//2. ���÷�������ӡ���ڰ�ɫ�İµϵ�A8���ںܿ����ʻ
		aodiA8.move("�ڰ�ɫ", "�µ�", "A8", "��");

		
		//3. ���÷�������ӡ���ڰ�ɫ�İµϵ�A8ͣ������
		aodiA8.stop("�ڰ�", "�µ�", "A8");
		

		//4. ���þ�̬���������������е�����������
		Car.canMove();

		
		//5. ���þ�̬��������ӡ��ȫ������20���ֳ�
		System.out.println(Car.types);
	}
}

/**
 * Ҫ��Car���������ԣ�
 * id    //�ͺ�
 * brand //Ʒ��
 * color //��ɫ
 * speed //�ٶ�
 * types //��ʾȫ��������������
 * 
 * Ҫ��Car��������Ϊ��
 * move ��ӡ��XXX[��ɫ]��XXX[Ʒ��]XXX[�ͺ�]���ں�XXX[�ٶ�]����ʻ
 * 
 * stop ��ӡ     XXX[��ɫ]��XXX[Ʒ��]XXX[�ͺ�]ͣ������
 * 
 * canMove ��ӡ�� ���������е�����������
 * 
 * @author Administrator
 *
 */
class Car{
	
	String brand;
	String color;
	String speed;
	String id;
	static String types="ȫ������20���ֳ�";
	
	void move(String color,String brand,String id,String speed){
		System.out.println(color+"��"+brand+id+"���ں�"+speed+"����ʻ");
	}
	void stop(String color,String brand,String id){
		System.out.println(color+"��"+brand+id+"ͣ������");
	}
	static void canMove(){
		System.out.println("���������е�����������");
	}

}
public class LianXi_6_CuoWu {
	public static void main(String[] args){
		//1. ����һ��CuoWu��Ķ���cw, ʹ������λ��Ϊ�������5�е�6���֣����Ĵ�����ϢΪ���Ծ�̬�����Ĵ���ʹ��
		//   ϵͳ������Ĵ�����ͼ���Ϊ7
		CuoWu cw=new CuoWu();
		cw.location="�����5�е�6����";
		cw.message="�Ծ�̬�����Ĵ���ʹ��";
		CuoWu.MIN="ϵͳ������Ĵ�����ͼ���Ϊ7";
		

		//2. ���÷�������ӡ���ڴ����5�е�6���ֳ����˴��󣺶Ծ�̬�����Ĵ���ʹ��
		cw.showError();

		
		//3. ���þ�̬��������ӡ��ϵͳ������Ĵ�����ͼ���Ϊ7
		System.out.println(CuoWu.MIN); 
		

		//4. ��ӡ���κδ�������Ҫ�����
		cw.needHandle();
		
		
		

	}
}

/**
 * Ҫ��CuoWu���������ԣ�
 * location    //λ��
 * message     //������Ϣ
 * MIN         //ϵͳ������Ĵ�����ͼ���
 * 
 * Ҫ��WenJian��������Ϊ��
 * showError  ��ӡ����XXX[λ��]�����˴���XXX[������Ϣ]
 * needHandle ��ӡ���κδ�������Ҫ�����
 * 
 * @author Administrator
 * 
 */
class CuoWu{
	String location;
	String message;
	static String MIN;
	
	void showError(){
		System.out.println("��"+location+"�����˴���"+message);
		
	}
	void needHandle(){
		System.out.println("�κδ�������Ҫ�����");
		
	}
	
	
}
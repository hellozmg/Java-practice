
public class LianXi_5_WenJian {

	public static void main(String[] args) {
		// 1. ����һ��WenJian��Ķ���wj, ʹ������λ�ã�C:\1.txt, ���Ĵ�С: 1 byte, �������ݣ�^_^
		//    32λ������֧�ֵ��ļ���С����Ϊ: 4G
		WenJian wj=new WenJian();
		wj.path="C:\\1.txt";
		wj.size="1 byte";
		wj.content="^_^";
		WenJian.MAX="4G";
		
		

		// 2. ���÷�������ӡ����СΪ1 byte���ļ�c:\1.txt��������^_^
		wj.read();

		
		// 3. ���÷�������ӡ�� ��Ҫ�Ѵ�СΪ1 byte���ļ�c:\1.txtɾ����
		wj.shanChu();
		

		// 4. ���þ�̬��������ӡ��32Ϊ������֧�ֵ��ļ���С����Ϊ4G
		System.out.println("32λ������֧�ֵ��ļ���С����Ϊ"+WenJian.MAX);

		// 5. ��ӡ���ļ�һ�㶼ռ�ÿռ�
		System.out.println("�ļ�һ�㶼ռ�ռ�");

	}
}
/**
 * Ҫ��WenJian���������ԣ� 
 * path //λ�� 
 * size //��С 
 * content //����
 * MAX  //32λ������֧�ֵ��ļ���С����
 * 
 * Ҫ��WenJian��������Ϊ��
 * read ��ӡ: ��СΪXXX���ļ�XXX[λ��]��������XXX[����] 
 * shanChu ��ӡ��
 * ��Ҫ�Ѵ�СΪXXX���ļ�XXX[λ��]ɾ����
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
		System.out.println("��СΪ"+size+"���ļ�"+path+"��������"+content);
		}
	void shanChu(){
		System.out.println("��Ҫ�Ѵ�СΪ"+size+"���ļ�"+path+"ɾ����");
	}
}

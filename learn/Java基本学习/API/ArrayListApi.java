package API;
import java.util.ArrayList;
/*���Ϳ������Ϊ���͵���ʽ������������������Ƕ��巽���д����������ʽ����������ȣ�Ҫ�����Ǵ���
�������͵���ʽ����������ֻ�����������ͣ������ǻ�������
ArrayList ��ӡ����ֵ�����ݣ������ǵ�ֵַ
jdk 1.7�Ժ����ļ����ſ��Բ���д��


 */
//list.add() ������ݣ����Բ����ܷ���ֵ
//list.remove() ɾ��Ԫ��
//list.size() ���ؼ���Ԫ�صĸ���
//list .get(index) ����������ȡ�ض���ֵ�����ر�ɾ����ֵ
// ���ʹ��arraylist���洢�������ͣ�����ʹ�û��������͵İ�װ�ࡣ


//��������-��װ��
/*
 ��������	��װ�� (��������)
 byte	Byte
 short	Short
 int	Intager
 long	Long 
 flot	Float
 double Double
 char	Character
 boolean	Boolean
 ��JDK1.5+��ʼ��֧���Զ�װ�䣬�Զ�����
 װ�䣺���������Զ������������
 ���䣺��װ�����Զ���ɻ�������

 */
import java.util.List;
import java.util.Random;
public class ArrayListApi {
	public void test1() {
		/*ArrayListʵ����List�Ľӿڣ����Կ�����������*/
		 //ArrayList<int []> arrayList=new ArrayList<int []>();
		 List<int []> arrayList=new ArrayList<int []>();
	     int [] tmp=new int[] {1,2,3,4,5,6};
		  arrayList.add(tmp);//Ĭ���ǲ���ɹ�
		  System.out.println(arrayList.get(0));
		  for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.get(i).length; j++) {
				System.out.println(arrayList.get(i)[j]);
			}
		}
		
	}
	public void test2() {
		//�������6��33���ڵ�����������洢����
	  Random random=new Random();
	  ArrayList<Integer> list=new ArrayList<>();
	  for (int i = 0; i < 6; i++) {
		  int tmp =(random.nextInt())%33;
		  list.add(tmp);
	}
	  for (int i = 0; i < list.size(); i++) {
		System.err.println("��"+i+"������"+list.get(i));
	}
		
	}
	public static void main(String[] args) {
	     ArrayListApi temp=new ArrayListApi();
	     //temp.test1();
	     temp.test2();
		
	}

	
 
}

package API;
import java.util.ArrayList;
import java.util.List;
public class ArrayListApi {
	public static void main(String[] args) {
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
	
 
}

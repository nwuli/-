package learn1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class ThreeSum {
	
	public void solution1(int[] num) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		//ArrayList��̬���飬������Ǹ����͵ı�﷽ʽ��ע����������б����������������͵�����
		ArrayList<int[]> list=new ArrayList<int[]>();
		Arrays.sort(num);
		for(int t=0;t<num.length;t++) {
			map.put(num[t], t);
		}
		for(int i=0;i<num.length;i++) {
			int temp=num[i];
			for(int j=i+1;j<num.length;j++) {
						int tp=(-temp)-(num[j]);
						if (map.containsKey(tp)&&map.get(tp)>j){
							//���Բ����Ƿ���hashmap�а�����Ӧ�ļ�ֵ��
							int[] tq=new int[3];
							tq[0]=temp;
							tq[1]=tp;
							tq[2]=num[j];
							list.add(tq);
							System.out.printf("%d\t%d\t%d\t\n",temp,tp,num[j]);
							//��Ϊ���Ƕ������Ѿ������������� -4��-1��-1��0��1��2
							//��ȵ�����Ԫ��һ��������һ����ô��һ�γ���-1λ�����ý�һ���ǰ���
							//�˵ڶ���-1�Ľ⣬����Ϊ�˱����ظ���������Ҫ������λ��
							if(num[i]==num[j]) {i++;}
					
					}
				
				
			}
			
		}
		
		
		
		
	}
	
	public void solution2(int[] num) {
		//���������˼�룬���ڶ��������˼��
		Arrays.sort(num);
		for(int t=0;t<num.length;t++) {
			int temp=num[t];
		
				int low=0;
				int high=num.length-1;
				while(low<high) {
					if(num[low]+num[high]<(0-temp)) {
						low++;
					}
					else if(num[low]+num[high]>(0-temp)) {
						high--;
					}
					else {
						System.out.printf("%d\t%d\t%d\n",temp,num[low],num[high]);
					    low++;
						high--;
					}
				}
				
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǿ�������2sum��˼�룬�򻯳�2sum�����⡣
		//ע������������ʵ�������������˼�룬�Ӷ�����ʱ�临�Ӷ�
		
		int[] s=new int[] {-1,0,1,2,-1,-4,5};
		
		ThreeSum tm=new ThreeSum();
		tm.solution1(s);

	}

}

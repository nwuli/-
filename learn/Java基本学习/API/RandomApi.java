package API;

import java.util.Random;
import java.util.Scanner;
public class RandomApi {
	
	public void Gussnum(int n) {
		System.err.println("����������Ҫ���������");//[1,n]
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int num=new Random().nextInt(n)+1;
		while(true) {
			if (input<num) {
				System.err.println("���С��");
				 input=scanner.nextInt();
			} else if(input>num) {
                System.err.println("��´���");
                 input=scanner.nextInt();
			}
			else {
				System.err.println("��¶���");
				break;
			}
		}
	}
	public int Random_n(int n) {
	
	    Random random=new Random();
		return random.nextInt(n)+1;
	
	}
	public static void main(String[] args) {
		RandomApi tmp=new RandomApi();
//		
		//����1��n�������
//		for(int i=0;i<20;i++) {
//			int n=tmp.Random_n(5);
//			System.err.println(n);
//		}
		tmp.Gussnum(5);
		
		
		
			
	}

}

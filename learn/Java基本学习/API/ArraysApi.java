package API;

import java.util.Arrays;

public class ArraysApi {
	/*
	 java.util���У��ṩ�������������صľ�̬����
	 1��public Static String toString()������ת�����ַ���ģʽ
	 2���������ֵ��sortĬ�ϰ��������С�����������
	 3��������ַ�����sortĬ�ϰ�����ĸ�����������
	 4��������Զ�������ͣ���ô����Զ��������Ҫcomparable����comparable�ӿ�
	 ��֧�֡�*/
	  public static void main(String[] args) {
		int[] temp={1,3,2};
		String[] strings= {"aaa","ccc","bbb"};
		System.out.println("�ַ���ת��������ĸ�ʽ"+Arrays.toString(temp));
		Arrays.sort(temp);
		Arrays.sort(strings);
		System.out.println("�����Ľ��"+Arrays.toString(temp));
		System.out.println("�ַ��������Ľ��"+Arrays.toString(strings));
	}

}

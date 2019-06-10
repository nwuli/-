package API;

import java.util.ArrayList;
/*
 * �ַ����������ݲ��ɸ��ģ��ɹ���ʹ�ã��൱���ַ������飬�ײ���byte[]����
 * �����ַ����ķ��� 
 * 1�� public String()
 * 2�� public String(char[ array])
 * 3�� public String(byte[] byte_array)
 * 4�� ֱ�Ӵ�����ʹ��˫���ţ�ֱ��д��˫���ţ�ֱ�ӹ����ַ�������
 * 
 * 
 * �ַ���ֱ��д�ϣ������ַ�����������
 * ���ڻ������� ==�������ֵ�ıȽ�
 * ������������==�����ֵַ�ñȽ�
 * 
 */
public class StringApi {
	public void test1() {
		String str1="hello";
		String str2="hello";
		String str4="lipeng";
		String str5="Hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str5));
		
		//��ȡָ��Ԫ�ص�λ��
		char c=str1.charAt(0);
		System.out.println("��ȡ���ַ�����ֵ"+c);
		
		//�ַ����Ƚ�==�Ƚ�
		char[] char_str3=new char[] {'h','e','l','l','o'};
		String str3=new String(char_str3);
		System.out.println(str1==str2);
        //��ͬ�ô�����ʽ���õ��õ�ַ��һ��
		System.out.println(str2==str3);
		
		//�����ַ�������ƴ��
		System.out.println("ƴ�ӽ��"+str1.concat(str4));
		
		//public char[] toCharArray() ��ǰ�ַ���ת�����ַ�����
		//public byte[] getByte()   ��ȡ��ǰ�ַ����õײ��ֽ�����
		//public String replice(charsequences)
		char[] chararray=str1.toCharArray();
		//System.out.print("�ַ��� ��ת���Ľ��:%s",chararray);
		 
		//�ַ������滻
		String lang1="���ү�Ļ����� SB";
		String lang2=lang1.replace("��ү", "**");
		System.out.println("�滻�Ľ��"+lang2);
		
		//�ַ����ķָ
		//public String[] split(String regex)����ָ���Ĺ�������ǵ��ַ����������и�������
		//�����и�
		//split�Ĳ�����һ��������ʽ
		String str6="my name is lp and i am from china";
		String[] strings=str6.split(" ");
		for (int i = 0; i < str6.length();i++) {
			System.out.println("�ָ��Ľ����"+strings[i]);
		}
	    
		
	
		
		
		
		
		
	}
	public static void main(String[] args) {
		StringApi temp=new StringApi();
		temp.test1();
		
	}

}

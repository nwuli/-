package API;

public class StaticApi {
	
	public static void test1() {
		System.out.println("���Ǳ�����һ����̬������ֱ�ӿ��Ե���");
	}
	//static ��̬�ؼ��֣��������洢ͬһ����ͬ��ͬѧ�Ľ�������
	//ʹ��static���������ڶ��������๲�����е���������������
	
	
	
	//static���η���(��̬����)����̬����������ģ��������ڶ����
	//1��û��ʹ��static���εķ���������ͨ���������ֽ��е��ã���Ҫ��������
	//2��ʹ��static���εķ���������ͨ���������ƽ��е���(���߶����ԣ������Ƽ������� )
	//3�����ڱ����еľ�̬�������������ǿ���ʡ�Ե�
	//4����ֻ̬�ܷ��ʾ�̬�����ܷ��ʷǾ�̬���ڴ������о�̬�����зǾ�̬
	//5����̬�����в���ʹ��this�ؼ���
	
	
	/*
	 public class test{

	 static{
	 
	 //��̬����������
	 }
	 }*/
	
	//��̬������״��õ�ִֻ��Ψһһ�Σ������ڷǾ�ִ̬��(����ִ��)
	public static void main(String[] args) {
		test1();//û��ʹ�������ƽ��е���
		Static_class static_class1=new Static_class();
		Static_class static_class2=new Static_class();
	}

}

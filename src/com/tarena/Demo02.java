package com.tarena;

public class Demo02
{
	public static void main(String[] args)
	{
		test1();
		test2();
		
	}
	
	public static void test1(){
		//���ᷢ���ڴ�й¶�������ܶ����
				//������Щ���󶼲������ã�Java GC�Զ�����
				// �Ͳ���й¶��
		for(int i = 0; i < 50000000; i++){
			//ÿһ�δ���֮��fָ���µ�Foo����
			Foo f = new Foo();
			
		}
		System.out.println("test1 Over!");
	}
	
	public static void test2(){
		//�����ڴ�й¶������һ�������������
				//�������Ķ�������ô洢��������
				// ��Щ���󶼱����ã�GC������գ�������й¶
		Foo[] array = new Foo[20000000];
		for(int i = 0; i < array.length; i++){
			array[i] = new Foo();
		}
		System.out.println("Test2 Over!");
	}
	
	

}

class Foo{
	double d = 6;
}

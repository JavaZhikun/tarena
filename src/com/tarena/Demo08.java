package com.tarena;

//super()�����๹�����е��ø���Ĺ�������
//1 ֻ�������๹������ʹ��
//2 ֻ��ʹ���ڹ������ĵ�һ�У�֮ǰ���������
//3 ��������е�һ��û�У�Java�Զ���ӣ�
//super();//super ���� 

public class Demo08
{
	public static void main(String[] args){
		new Yoo();
	}

}

class Xoo{
	public Xoo(){
		System.out.println("Call Xoo()");
	}
}

class Yoo extends Xoo{
	public Yoo(){
//		super();
		System.out.println("Call Yoo()");
	}
}

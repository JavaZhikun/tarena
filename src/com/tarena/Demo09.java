package com.tarena;

public class Demo09
{
     public static void main(String[] args)
	{
		Noo n = new Moo();
	}
}

class Noo{
	public Noo(int n){
		System.out.println("Call Noo(n)");
	}
}

//Moo ���Զ����ø�����޲�����������
//���Ǹ���ľ�У��ͳ��ִ���
//����취��
// 1 �ڸ�������޲����������� 
// 2 �����๹������ ʹ�� super(5) 
//   ���ø�����в���������
//���飺�඼���޲�������������������ļ̳У�

class Moo extends Noo{
	public Moo(){
		super(5);//
	}
}

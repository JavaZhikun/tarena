package com.tarena;

//super()在子类构造器中调用父类的构造器！
//1 只能在子类构造器中使用
//2 只能使用在构造器的第一行，之前不能有语句
//3 如果子类中第一行没有，Java自动添加！
//super();//super 超级 

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

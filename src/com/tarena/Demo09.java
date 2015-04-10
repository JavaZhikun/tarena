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

//Moo 会自动调用父类的无参数构造器，
//但是父类木有！就出现错误！
//解决办法：
// 1 在父类添加无参数构造器！ 
// 2 在子类构造器中 使用 super(5) 
//   调用父类的有参数构造器
//建议：类都有无参数构造器，方便子类的继承！

class Moo extends Noo{
	public Moo(){
		super(5);//
	}
}

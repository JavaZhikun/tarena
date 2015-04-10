package com.tarena;

public class Demo10
{
	public static void main(String[] args)
	{
		Boo boo = new Boo();
		boo.test();
	}
	

}

class Aoo{
	int times = 1;
}

class Boo extends Aoo{
	int times = 8;
	public void test(){
		int times = 9;
		System.out.println(times);
		System.out.println(this.times);
		System.out.println(super.times);
	}
}
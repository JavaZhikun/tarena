package com.tarena;

public class Demo07
{
	public static void main(String[] args)
	{
		Sub  s = new Sub();
	}

}

class Super{
	public Super(){
		System.out.println("Call super()");
	}
}

class Sub extends Super{
	
}

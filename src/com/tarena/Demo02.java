package com.tarena;

public class Demo02
{
	public static void main(String[] args)
	{
		test1();
		test2();
		
	}
	
	public static void test1(){
		//不会发生内存泄露，创建很多对象
				//但是这些对象都不被引用，Java GC自动回收
				// 就不会泄露了
		for(int i = 0; i < 50000000; i++){
			//每一次创建之后f指向新的Foo对象
			Foo f = new Foo();
			
		}
		System.out.println("test1 Over!");
	}
	
	public static void test2(){
		//发生内存泄露：创建一个大的引用数组
				//将创建的对象的引用存储到数组中
				// 这些对象都被引用，GC不会回收，发生了泄露
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

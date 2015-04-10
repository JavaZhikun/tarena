package com.tarena;

public class Demo01
{
	public static void main(String[] args)
	{
		Person I = new Person("Tom");
		Person you = new Person("Jerry");
		if(I.love(you)){
			//.....  Ô¼Âð
		}
		
	}

}

class Person{
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
//	public void love(Money more){
//		
//	}
//	
//	public void love(Baby baby){
//		
//	}
//	
//	public void love(Pet pet){
//		
//	}
	
	public boolean love(Person other){
		System.out.println(this.name + " love " + other.name);
		return false;
		
	}
}

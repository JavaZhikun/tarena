package com.tarena;

public class Demo04
{
	public static void main(String[] args){
		Airplan a1 = new Airplan();
		Airplan a2 = new Airplan();
		a1.move(5);
		a1.print();
	}

}


class Airplan{
	int x, y;
	public void move(int step){
		this.y += step;
	}
	
	public void print(){
		System.out.println(x + "," + y);
	}
}
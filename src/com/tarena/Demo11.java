package com.tarena;

public class Demo11
{
	public static void main(String[] args)
	{
		Point p = new Point();
		System.out.println(p.x);
	}

}

class Point{//����ƽ���ϵ�һ����
	int x,y;
	public Point(){
		this(3,4);//��������һ��Point(int, int)
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

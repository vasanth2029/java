import java.util.*;
abstract class Shape{
	int d1,d2;
	Shape(int d1,int d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
	abstract void printArea();
}
class Rectangle extends Shape
{
	Rectangle(int d1,int d2)
	{
		super(d1,d2);
	}
	void printArea()
	{
		System.out.println("Area ="+(d1*d2));
	}
}
class Triangle extends Shape
{
	Triangle(int d1,int d2)
	{
		super(d1,d2);
	}
	void printArea()
	{
		System.out.println("Area ="+(0.5*d1*d2));
	}
}
class Circle extends Shape
{
	Circle(int d1,int d2)
	{
		super(d1,d2);
	}
	void printArea()
	{
		System.out.println("Area ="+(3.14*d1*d1));
	}
}

class Ex4
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

        	System.out.println("Choose Shape");
        	System.out.println("1. Rectangle");
        	System.out.println("2. Triangle");
        	System.out.println("3. Circle");
        	System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter length =");
				int a=sc.nextInt();
				System.out.println("Enter Breadth =");
				int b=sc.nextInt();
				Rectangle r=new Rectangle(a,b);
				r.printArea();
				break;
			case 2:
				System.out.println("Enter Base =");
				int c=sc.nextInt();
				System.out.println("Enter Height =");
				int d=sc.nextInt();
				Triangle t=new Triangle(c,d);
				t.printArea();
				break;
			case 3:
				System.out.println("Enter radius =");
				int e=sc.nextInt();
				Circle x=new Circle(e,e);
				x.printArea();
				break;
			default:
				System.out.println("Invalid");
				break;
		}

	}
}
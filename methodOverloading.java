abstract class Shape{
	abstract void printArea();
}
class Rectangle extends Shape{
	int l=10,b=20;
	void printArea(){
		System.out.println("Area of Rectangle="+(l*b));
	}
}
class Triangle extends Shape{
	int h=10,b=20;
	void printArea(){
		System.out.println("Area of Triangle="+(0.5*h*b));
	}
}
class Square extends Shape{
	int a=20;
	void printArea(){
		System.out.println("Area of Square="+(a*a));
	}
}
class methodOverloading{
	public static void main(String args[]){
		Rectangle obj1 = new Rectangle();
		Triangle obj2 = new Triangle();
		Square obj3 = new Square();
		obj1.printArea();
		obj2.printArea();
		obj3.printArea();
	}
}

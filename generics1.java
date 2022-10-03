import java.util.*;
class Generics<z>{
	z x;
	z y;
	Generics(z x,z y){
		this.x = x;
		this.y = y;
		System.out.println("Before Swapping X= "+x+", Y= "+y);
	}
	void swap(){
		z temp = x;
		x = y;
		y = temp;		
	}
	void display(){
		System.out.println("After Swapping X= "+x+", Y= "+y);
	}
}
class generics1{
	public static void main(String args[]){
		Generics<Integer> gr = new Generics<Integer>(10,6);
		gr.swap();
		gr.display();
	}
}

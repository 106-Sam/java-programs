import java.util.*;
class TwoGenerics<T,V>{
	T x;
	V y;
	TwoGenerics(T x,V y){
		this.x = x;
		this.y = y;
	}
	void types(){
		System.out.println("Value of Integer: "+x);
		System.out.println("Value of String: "+y);
	}
}
class generics3{
	public static void main(String args[]){
		TwoGenerics<Integer,String> tg = new TwoGenerics<Integer,String>(32,"Sami");
		tg.types();
	}
}

class ConstOverloading{
	ConstOverloading(){
		System.out.println("Default Constructor");
	}
	ConstOverloading(int x,int y){
		System.out.println(x+y);
	}
	ConstOverloading(int x,int y,int z){
		System.out.println(x+y+z);
	}
}
class Demo{
	public static void main(String args[]){
		ConstOverloading s1=new ConstOverloading(20,30);
		ConstOverloading s2=new ConstOverloading(50,50,50);
	}
}

interface A{
	void meth1();
	void meth2();
}
class Myclass1 implements A{
	public void meth1(){
		System.out.println("Method1 executed");
	}
	public void meth2(){
		System.out.println("Method2 executed");
	}
	public static void main(String args[]){
		Myclass1 obj1 = new Myclass1();
		obj1.meth1();
		obj1.meth2();
	}
}

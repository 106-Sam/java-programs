interface A{
	void meth1();
}
interface B extends A{
	void meth2();
}
class interInherit implements B{
	public void meth1(){
		System.out.println("Meth1 is printed");
	}
	public void meth2(){
		System.out.println("Meth2 is printed");
	}
	public static void main(String args[]){
		interInherit obj = new interInherit();
		obj.meth1();
		obj.meth2();
	}
}

interface A{
	void print();
}
interface B{
	void print1();
}
class multiInherit implements A,B{
	public void print(){
		System.out.println("Interface A");
	}
	public void print1(){
		System.out.println("Interface B");
	}
	public static void main(String args[]){
		multiInherit obj1 = new multiInherit();
		obj1.print();
		obj1.print1();
	}
}

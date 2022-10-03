class Overloading{
	int add(int x,int y){
		return x+y;
	}
	int add(int x,int y,int z){
		return x+y+z;		
	}
}
class Overload{
	public static void main(String args[]){
		Overloading obj = new Overloading();
		System.out.println(obj.add(20,20));
		System.out.println(obj.add(20,50,70));
	}
}

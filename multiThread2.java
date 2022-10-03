import java.util.Random;
class Square extends Thread{
	int x;
	Square(int n){
		x=n;
	}
	public void run(){
		System.out.println("Square of "+x+"is :"+(x*x));
	}
}
class Cube extends Thread{
	int x;
	Cube(int n){
		x=n;
	}
	public void run(){
		System.out.println("Cube of "+x+"is :" + (x*x*x));	
	}
}
class generateRandom extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			Random r = new Random();
			int x = r.nextInt(10);
		
			if(x%2==0){
				Square s = new Square(x);
				s.start();
			}
			else{
				Cube c = new Cube(x);
				c.start();
			}
			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException IE){
				System.out.println(IE);
			}
		}
	}
}
class multiThread2{
	public static void main(String args[]) throws InterruptedException{
		generateRandom t = new generateRandom();
		t.start();
		
	}
}
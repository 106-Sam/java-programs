import java.util.Random;
class Square extends Thread{
	int x;
	Square(int n){
		x=n;
	}
	public void run(){
		int p = x*x;
		for (int i=0;i<p;i++){
			System.out.println("Square :" +i);
		}
	}
}
class Seq extends Thread{
	int x;
	Seq(int n){
		x=n;
	}
	public void run(){
		for(int i=0;i<x;i++){
			System.out.println("Sequence :" + (i));
		}
	}
}
class generateRandom extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			Random r = new Random();
			int x = r.nextInt(6);
		
			if(x%2==0){
				Square s = new Square(x);
				s.start();
			}
			else{
			Seq c = new Seq(x);
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
class multiThread3{
	public static void main(String args[]) throws InterruptedException{
		generateRandom t = new generateRandom();
		t.start();
		
	}
}
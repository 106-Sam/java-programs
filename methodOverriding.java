class Sami{
	void run(){
		System.out.println("Hi, I am Sami");
	}
}
class Hacker extends Sami{
	void run(){
		super.run();
		System.out.println("I am a Security Researcher");
	}
}
class methodOverriding{
	public static void main(String args[]){
		Hacker s = new Hacker();
		s.run();
	}
}

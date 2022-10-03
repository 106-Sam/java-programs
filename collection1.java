import java.util.*;
class collection1{
		public static void main(String args[]){
			LinkedList l=new LinkedList();
			int x,ch,p,a,b,c;
			while(true){
			System.out.println("enter your choise:1.add\n2.delete\n3.display");
			Scanner s=new Scanner(System.in);
			ch=s.nextInt();
			switch(ch){
				case 1: System.out.println("enter your choise:\n1.add at first\n2.add at last\n3.add at position");
					ch=s.nextInt();
					System.out.println("enter element to add");
					a=s.nextInt();
					switch(ch){
						case 1:l.addFirst(a);
						    	break;
						case 2:l.addLast(a);
							break;
						case 3:	System.out.println("enter position add");							
							p=s.nextInt();
							l.add(p,a);
							break;
					}
				break;
				case 2: System.out.println("enter your choise:1.delete at first\n2.delete at last\n3.delete at position");
					b=s.nextInt();
					switch(b){
						case 1:l.removeFirst();
							break;
						case 2:l.removeLast();
							break;
						case 3:	System.out.println("enter position to dlete");
							c=s.nextInt();
							l.remove(c);
							break;
					}
					break;
				case 3: System.out.println("elements in the linked list are:"+l);
				break;
				default:System.out.println("invalid choise");
			}
		}
	}
}


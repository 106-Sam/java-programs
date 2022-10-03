class ArrayError{
	public static void main(String args[]){
		int x,y,result;
		try{
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			result = ((x*x)+(y*y));
			System.out.println("Result = "+result);
		}
		catch(ArrayIndexOutOfBoundsException AI){
			System.out.println("Exception Handle : "+AI);
		}
	}
}

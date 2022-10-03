class NullError{
	public static void main(String args[]){
		String str = null;
		try{
			System.out.println("String length = "+str.length());
		}
		catch(NullPointerException NPE){
			System.out.println("Exception Handled : "+NPE);
		}
	}
}

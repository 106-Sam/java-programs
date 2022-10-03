import java.io.*;
class readFile{
	public static void main(String args[]) throws IOException{
		try{
			FileInputStream fp = new FileInputStream("sami.txt");
			int i = 0;
			while ((i=fp.read())!=-1){
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException FNFE){
			System.out.println("[-] Exception Handled"+FNFE);
		}
	}
}

import java.io.*;
class charaCount{
	public static void main(String args[]) throws IOException{
		try{
			int lines=0,chars=0,words=0;
			int code=0;
			FileInputStream fis = new FileInputStream("sami.txt");
			while(fis.available()!=0){
				code = fis.read();
				if(code!=10)
				chars++;
				if(code==32)
				words++;
				if(code==13){
					lines++;
					words++;
				}
			}
			System.out.println("Characters: "+chars);
			System.out.println("Words: "+(words+1));
			System.out.println("Lines: "+(lines+1));
			fis.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Exception Handled");
		}
	}
}

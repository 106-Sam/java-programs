import java.io.*;
class Check{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter filename:");
		String fileName = br.readLine();
		File fp = new File(fileName);
		System.out.println("File Exist : " + fp.exists());
		System.out.println("File Readable : "+fp.canRead());
		System.out.println("File Writable : "+fp.canWrite());
		System.out.println("File : "+fp.isFile());
		System.out.println("Folder : "+fp.isDirectory());
		System.out.println("Length size : "+ fp.length());
		System.out.println("Hidden : "+fp.isHidden());
	}
}

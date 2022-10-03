import java.io.*;
class listFiles{
	public static void main(String args[]) throws IOException{
		File directoryPath = new File("/home/sam/Downloads/Research/");
		String contents[] = directoryPath.list();
		System.out.println("List of files in a directory: ");
		for(int i=0;i<contents.length;i++){
			System.out.println(contents[i]);
		}

	}
}

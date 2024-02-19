package JAVA_A;
import java.io.FileReader;
import java.io.IOException;
public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:JavaFileHandlingEx.txt");
		int i;
		while((i=fr.read())!=-1){
	    	System.out.print((char)i);   
	       }
	       fr.close();
			

	}

}

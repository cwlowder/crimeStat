import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class fileReaderDesignated{
	final static Charset ENCODING = StandardCharsets.UTF_8;
	public static String fileName="Realdata.txt";
	public fileReaderDesignated() throws FileNotFoundException{
		BufferedReader in=new BufferedReader(new FileReader(fileName));
		try {
			readLargerTextFile(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 void readLargerTextFile(String aFileName) throws IOException {
		    Path path = Paths.get(aFileName);
		    try (Scanner scanner =  new Scanner(path, ENCODING.name())){
		      while (scanner.hasNextLine()){
		    	  if(scanner.hasNext()){
		    		  processLine(scanner.nextLine());
		    	  }
		      }      
		    }
	 }
	 protected void processLine(String aLine){
		 	String[] lol=aLine.split("&");
			ArrayList<String> rep=new ArrayList<>();
			for(int i=0;i<lol.length;i++){
				rep.add(lol[i]);
			}
			
			Line ret=new Line(rep);
			runnerMainDrugs.Lines.add(ret);
	 }
}
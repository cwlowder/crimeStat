import java.io.FileNotFoundException;
import java.util.ArrayList;

public class runnerMainDrugs{
	public static ArrayList<Beat> Beats=new ArrayList<>();
	public static ArrayList<Line> Lines=new ArrayList<>();
	
	public static int Test=0;
	public static void main(String[] args) {
		try {
			fileReaderDesignated fd=new fileReaderDesignated();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<Lines.size();i++){
			//Lines.get(i).print();
		}
		/*System.out.println("");
		if("HX351338".equals(Lines.get(11161).Cas))
			System.out.println("Worked");
		System.out.println(Lines.get(11161).Prim);
		System.out.println("---------------------------");
		System.out.println("Num Of Beats: "+Beats.size());
		System.out.println("Your test: "+Test);
		*/
		double sevTotal=0;
		for(int i=0;i<Beats.size();i++){
			severityCalc sC=new severityCalc(Beats.get(i).crimes);
			System.out.println(Beats.get(i).ID+" "+sC.severFind());
			sevTotal+=sC.severFind();
			if(Beats.get(i).ID==1651)
			Beats.get(i).severity();
			//System.out.println(Beats.get(i).ID+" "+Beats.get(i).crimes.size());
		}
		System.out.println("SevTotal:"+sevTotal);
		System.out.println("Num Of Beats: "+Beats.size());
	}

}
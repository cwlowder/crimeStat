import java.util.ArrayList;

public class Beat {
public int ID;
public ArrayList<crime> crimes=new ArrayList<>();
	public Beat(int i){
	ID=i;
	}
	public void severity(){
		severityCalc sC=new severityCalc(crimes);
		System.out.println("----ID:"+ID+"------------------------------------");
		sC.print();
	}
	public void print(){
		System.out.println("----ID:"+ID+"------------------------------------");
		for(crime c:crimes){
			System.out.println(" "+c.info.Prim);
		}
	}
}

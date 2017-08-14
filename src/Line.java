import java.util.ArrayList;

public class Line {
	public ArrayList<String> textArray;
	public String Cas;
	public String Dat;
	public String Prim;
	public String Sec;
	public String Loc;
	public String Arr;
	public String Dom;
	public int Beat;
	
	public Line(ArrayList<String> in){
		textArray=in;
		Cas= textArray.get(0).replace(" ", "");
		Dat = textArray.get(1).replace(" ", "");
		Dat=Dat.replace("	","");
		Prim = textArray.get(2).replace(" ", "");
	 Prim=Prim.replace("	","");
		Sec = textArray.get(3).replace(" ", "");
		Sec=Sec.replace("	","");
		Loc = textArray.get(4).replace(" ", "");
		Loc=Loc.replace("	","");
		Arr = textArray.get(5).replace(" ", "");
		Arr=Arr.replace("	","");
		Dom = textArray.get(6).replace(" ", "");
		Dom=Dom.replace("	","");
		Beat = Integer.parseInt(textArray.get(7).replaceAll("[^\\d.]", ""));
		if(Prim.equals("ASSAULT")){
			runnerMainDrugs.Test++;
		}
		crime C = new crime(this);
		Boolean done=false;//has the crime been assigned to a Beat?
		for (int i =0; i < runnerMainDrugs.Beats.size(); i++)
			if(runnerMainDrugs.Beats.get(i).ID==Beat)
			{
				runnerMainDrugs.Beats.get(i).crimes.add(C);
				done=true;
			}
		if(done==false){
			Beat b=new Beat(Beat);
			runnerMainDrugs.Beats.add(b);
			b.crimes.add(C);
			}
		//print();
	}
	public void print(){
		System.out.print("ID:"+Beat+" ");
		//System.out.println("PRIME:"+Prim);
		for(int i=0;i<textArray.size();i++){
			System.out.print(textArray.get(i)+"-"+i+" |");
		}
		System.out.println();
	}
	/*
	 * 1.Set up vars
	 * 		To get value from spot=textArray.get(pos);
	 * 
	 */
}
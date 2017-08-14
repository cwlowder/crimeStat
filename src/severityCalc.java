import java.util.ArrayList;

public class severityCalc {
	public ArrayList<crime> crimes;
	/*
	 * Arson
	 * Assault
	 * Battery
	 * Burglary
	 * Crim Sexual Assualt
	 * Criminal Damage
	 * Criminal Trespass
	 * Deceptive Practice
	 * Gambling
	 * Homicide
	 * Interfece w/ police
	 * Intimidation
	 * Kidnapping
	 * Liquor Law Violation
	 * Motor Vehicle theft
	 * Narcotics
	 * Offense Involving children
	 * Other offense
	 * Prostitution
	 * Public Peace Violation
	 * Robbery
	 * Sex Offense
	 * Stalking
	 * Theft
	 * Weapons Violation
	 */
	public int arson=0;
	public int assualt=0;
	public int battery=0;
	public int burglary=0;
	public int crimSexAssualt=0;
	public int crimdamage=0;
	public int crimtrespass=0;
	public int deceptpract=0;
	public int gambling=0;
	public int homicide=0;
	public int interference=0;
	public int intimidation=0;
	public int kidnapping=0;
	public int liquorViolation=0;
	public int motorVecTheft=0;
	public int narcotics=0;
	public int offenseChildren=0;
	public int otherOffense=0;
	public int prostitution=0;
	public int peaceViolation=0;
	public int robbery=0;
	public int sexOffense=0;
	public int stalking=0;
	public int theft=0;
	public int wepViolation=0;
	public severityCalc(ArrayList<crime> in){
		crimes=in;
		goThrough(crimes);
	}
	public double severFind(){
		return 2069.51*arson+163.88*assualt+152.29*battery+880.64*burglary+2805.24*crimSexAssualt+14.33*crimdamage+11.16*crimtrespass+327.55*deceptpract+102.13*gambling+7626.95*homicide+52.41*interference+1234.03*intimidation+1038.68*kidnapping+3.42*liquorViolation+286.71*motorVecTheft+231.44*narcotics+558.75*offenseChildren+190.79*otherOffense+218.76*prostitution+190.79*peaceViolation+2498.91*robbery+2430.52*sexOffense+1271.90*stalking+76.6*theft+71.71*wepViolation;
	}
	public void goThrough(ArrayList<crime> in){
		for(int i=0;i<in.size();i++){
			String Prime=in.get(i).info.Prim;
			if(Prime.equals("ARSON")){
				arson++;
			}
			else if(Prime.equals("ASSAULT")){
				assualt++;
			}
			else if(Prime.equals("BATTERY")){
				battery++;
			}
			else if(Prime.equals("BURGLARY")){
				burglary++;
			}
			else if(Prime.equals("CRIMSEXUALASSAULT")){
				crimSexAssualt++;
			}
			else if(Prime.equals("CRIMSEXUALASSAULT")){
				crimSexAssualt++;
			}
			else if(Prime.equals("CRIMINALDAMAGE")){
				crimdamage++;
			}
			else if(Prime.equals("CRIMINALTRESPASS")){
				crimtrespass++;
			}
			else if(Prime.equals("DECEPTIVEPRACTICE")){
				deceptpract++;
			}
			else if(Prime.equals("GAMBLING")){
				gambling++;
			}
			else if(Prime.equals("HOMICIDE")){
				homicide++;
			}
			else if(Prime.equals("INTERFERENCEWITHPUBLICOFFICER")){
				interference++;
			}
			else if(Prime.equals("INTIMIDATION")){
				intimidation++;
			}
			else if(Prime.equals("KIDNAPPING")){
				kidnapping++;
			}
			else if(Prime.equals("LIQUORLAWVIOLATION")){
				liquorViolation++;
			}
			else if(Prime.equals("MOTORVEHICLETHEFT")){
				motorVecTheft++;
			}
			else if(Prime.equals("NARCOTICS")){
				narcotics++;
			}
			else if(Prime.equals("OFFENSEINVOLVINGCHILDREN")){
				offenseChildren++;
			}
			else if(Prime.equals("OTHEROFFENSE")){
				otherOffense++;
			}
			else if(Prime.equals("PROSTITUTION")){
				prostitution++;
			}
			else if(Prime.equals("PUBLICPEACEVIOLATION")){
				peaceViolation++;
			}
			else if(Prime.equals("ROBBERY")){
				robbery++;
			}
			else if(Prime.equals("SEXOFFENSE")){
				sexOffense++;
			}
			else if(Prime.equals("STALKING")){
				stalking++;
			}
			else if(Prime.equals("THEFT")){
				theft++;
			}
			else if(Prime.equals("WEAPONSVIOLATION")){
				wepViolation++;
			}
		}
	}
	public void print(){
		System.out.println("Arson:"+arson);
		System.out.println("Assault:"+assualt);
		System.out.println("Battery:"+battery);
		System.out.println("Burglary:"+burglary);
		System.out.println("crimSexAssualt:"+crimSexAssualt);
		System.out.println("crimDamage:"+crimdamage);
		System.out.println("crimTrespassing:"+crimtrespass);
		System.out.println("Deceptive Practice:"+deceptpract);
		System.out.println("Gambling:"+gambling);
		System.out.println("Homicide:"+homicide);
		System.out.println("Interference w/ officer:"+interference);
		System.out.println("Intimidation:"+intimidation);
		System.out.println("Kidnapping:"+kidnapping);
		System.out.println("Liquor Law Violation:"+liquorViolation);
		System.out.println("Motor Vehicle Theft:"+motorVecTheft);
		System.out.println("Narcotics:"+narcotics);
		System.out.println("OffenseW/Children:"+offenseChildren);
		System.out.println("OtherOffense:"+otherOffense);
		System.out.println("Prostitution:"+prostitution);
		System.out.println("PublicPeaceViolation:"+peaceViolation);
		System.out.println("Robbery:"+robbery);
		System.out.println("Sex Offense:"+sexOffense);
		System.out.println("Stalking:"+stalking);
		System.out.println("Theft:"+theft);
		System.out.println("Weapon Violation:"+wepViolation);
	}
}
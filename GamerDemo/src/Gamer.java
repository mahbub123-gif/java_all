
public class Gamer {

	String gamerType="noob";
	String gamerType1="noob";
	double totalScore=60,totalMatches=80;
	Gamer(){
		this.gamerType=null;
		this.totalScore=-1.0;
		this.totalMatches=-1.0;
	}
	
	Gamer(String gamerType,double totalScore,double totalMatches){
		this.gamerType=gamerType;
		this.totalScore=totalScore;
		this.totalMatches=totalMatches;
	}
	
	double calculateFinalScore() {
		if(gamerType==gamerType1) {
			return (2*totalScore*totalMatches)/(totalScore+totalMatches);
		}
		return (totalScore/totalMatches);
	}

}

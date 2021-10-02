
public class GamerDemo {

	public static void main(String[] args) {
		Gamer yusha = new Gamer("noob",60,80);
		
		System.out.println(yusha.gamerType);
		System.out.println(yusha.totalMatches);
		System.out.println(yusha.totalScore);
		System.out.println(yusha.calculateFinalScore());

	}

}

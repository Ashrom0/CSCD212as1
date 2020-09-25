
public class GameCharacterAngusYoung extends GameCharacter{
	public GameCharacterAngusYoung() {
		guitarType = new FenderTelecaster();
		soloType = new SmashGuitar();
	}
	
	public void display() {
		System.out.println("Angus Young of AC/DC");
	}
}

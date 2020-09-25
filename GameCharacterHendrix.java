
public class GameCharacterHendrix extends GameCharacter{
	public GameCharacterHendrix() {
		guitarType = new GibsonSG();
		soloType = new SmashGuitar();
	}
	
	public void display() {
		System.out.println("Jimi Hendrix of The Jimi Hendrix Experience");
	}
}

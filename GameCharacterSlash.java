
public class GameCharacterSlash extends GameCharacter {
	public GameCharacterSlash() {
		guitarType = new GibsonFlyingV();
		soloType = new SetGuitarOnFire();
	}
	
	public void display() {
		System.out.println("Slash from Guns & Roses");
	}
}

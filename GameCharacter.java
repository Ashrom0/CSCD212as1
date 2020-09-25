
public abstract class GameCharacter {
	Guitar guitarType;
	Solo soloType;
	public GameCharacter() {
		
	}
	
	public abstract void display();
	
	public void playGuitar() {
		guitarType.guitar();
	}
	
	public void playSolo() {
		soloType.solo();
	}
	
	public void setSolo(Solo s) {
		 soloType = s;
	 }
	
	public void setGuitar(Guitar g) {
		 guitarType = g;
	 }
	
}

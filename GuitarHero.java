
public class GuitarHero {
	public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash(); //note that constructor could be designed to accept initial behaviors

        // e.g. GameCharacter player1 = new GameCharacterSlash(new GibsonFlyingV(), new SetGuitarOnFire());
        GameCharacter player2 = new GameCharacterHendrix();
        player1.display();
        player1.playGuitar();  //should print a message saying Slash is playing a Gibson Flying V
        player2.display();
        player2.playGuitar(); //should print a message saying Jimi Hendrix is playing whatever you assigned in constructor
        player1.playSolo(); //should print a message saying Slash just set guitar on fire
        player2.playSolo(); //etc.

        //add code below to show the swapping of behaviors

        player1.display();
        player1.setSolo(new JumpOffStage()); 
        player1.playSolo(); //this should print a message that Slash jumped off stage
        
        player2.display();
        player2.setGuitar(new FenderTelecaster());
        player2.playGuitar();
        
        GameCharacter player3 = new GameCharacterAngusYoung();
        player3.display();
        player3.playGuitar();
        player3.playSolo();
    }
}

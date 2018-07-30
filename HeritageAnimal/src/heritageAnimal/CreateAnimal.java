package heritageAnimal;

public class CreateAnimal {

	public static void main(String[] args) {
		Chien monChien = new Chien();
		monChien.setNom("Médor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle " +monChien.getNom() + " et il fait " + monChien.aboie());
		
		Chat monChat = new Chat();
		monChat.setNom("Smooki");
		monChat.setCouleur("Gris");
		System.out.println("Mon chat s'appelle " +monChat.getNom() + " et il fait " + monChat.miaule());

	}

}

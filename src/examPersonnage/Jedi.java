package examPersonnage;

public class Jedi extends Chevalier {
	private static int DEFAUT_PHYSIQUE = 150;
	private static int DEFAUT_MENTAL = 100;

	public Jedi() {
		super();
		setForcePhysique(DEFAUT_PHYSIQUE);
		setForceMentale(DEFAUT_MENTAL);
	}

	public Jedi(String nom) {
		super(nom);
		setForcePhysique(DEFAUT_PHYSIQUE);
		setForceMentale(DEFAUT_MENTAL);
	}

	@Override
	public String joue() {
		String msg = String.format("Attention, Chevalier %s joue ! LA FORCE EST AVEC ELLE !", getNom());
		System.out.println(msg);
		return msg;
	}

	public static int getDEFAUT_PHYSIQUE(){
		return DEFAUT_PHYSIQUE;
	}

	public static void setDEFAUT_PHYSIQUE(int physique){
		DEFAUT_PHYSIQUE = physique;
	}

	public static int getDEFAUT_MENTAL(){
		return DEFAUT_MENTAL;
	}

	public static void setDEFAUT_MENTAL(int mental){
		DEFAUT_MENTAL = mental;
	}

	// toString n'a pas été demandé pour cette classe

}

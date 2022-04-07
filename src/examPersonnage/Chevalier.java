package examPersonnage;

public class Chevalier extends Personnage {

	private static int DEFAUT_PHYSIQUE = 50;

	public Chevalier() {
		super();
		setForcePhysique(DEFAUT_PHYSIQUE);
	}

	public Chevalier(String nom) {
		super(nom);
		setForcePhysique(DEFAUT_PHYSIQUE);
	}

	@Override
	public String toString() {
		return String.format("Chevalier[%s]", super.toString());
	}

	@Override
	public String joue() {
		String msg = String.format("Attention, Chevalier %s joue !", getNom());
		System.out.println(msg);
		return msg;
	}

	public static int getDEFAUT_PHYSIQUE(){
		return DEFAUT_PHYSIQUE;
	}

	public static void setDEFAUT_PHYSIQUE(int physique){
		DEFAUT_PHYSIQUE = physique;
	}
}

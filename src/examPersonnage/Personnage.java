package examPersonnage;

public abstract class Personnage {
	private static int DEFAUT_PHYSIQUE = 10;
	private static int DEFAUT_MENTAL = 10;
	private static int dernierID = 0;

	private String nom;
	private int forcePhysique, forceMentale;
	private final int id;

	public abstract String joue();

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

	public static int getDernierID(){
		return dernierID;
	}

	public Personnage() {
		this.id = ++dernierID;
		this.nom = "monPerso"+this.id;
		this.forcePhysique = DEFAUT_PHYSIQUE;
		this.forceMentale = DEFAUT_MENTAL;
	}

	public Personnage(String nom) {
		this.id = ++dernierID;
		this.nom = nom;
		this.forcePhysique = DEFAUT_PHYSIQUE;
		this.forceMentale = DEFAUT_MENTAL;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForcePhysique() {
		return forcePhysique;
	}

	public void setForcePhysique(int forcePhysique) {
		this.forcePhysique = forcePhysique;
	}

	public int getForceMentale() {
		return forceMentale;
	}

	public void setForceMentale(int forceMentale) {
		this.forceMentale = forceMentale;
	}

	@Override
	public String toString() {
		return String.format("Personnage [nom=%s, forcePhysique=%s, forceMentale=%s]", nom, forcePhysique, forceMentale);
	}
}

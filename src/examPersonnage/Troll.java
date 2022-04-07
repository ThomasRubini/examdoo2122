package examPersonnage;

public class Troll extends Personnage {
	private static int DEFAUT_MENTAL = 42;

	public Troll() {
		super();
		setForceMentale(DEFAUT_MENTAL);
	}


	public Troll(String nom) {
		super(nom);
		setForceMentale(DEFAUT_MENTAL);
	}

	@Override
	public String toString() {
		return String.format("Troll[%s]", super.toString());
	}

	@Override
	public String joue() {
		String msg = getNom()+" joue !";
		System.out.println(msg);
		return msg;
	}

	public static int getDEFAUT_MENTAL() {
		return DEFAUT_MENTAL;
	}

	public static void setDEFAUT_MENTAL(int mental) {
		DEFAUT_MENTAL = mental;
	}
}

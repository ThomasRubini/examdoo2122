package examPersonnage;

public class Main {
	public static void main(String[] args) {
		Personnage p = new Jedi("Thomas");
		System.out.println(p);
		System.out.println(p.getForceMentale());
		System.out.println(p.getForcePhysique());
		p.joue();
		p.setForceMentale(5);
		System.out.println(p);

	}
}

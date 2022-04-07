package examEtudiant;

public class Main {
	public static void main(String[] args) {
		Alternant et = new Alternant("Thomas");
		et.noter("Anglais", 18);
		et.noter("Communication", 12.5);
		et.noter("Droit", 11);
		et.noter("Maths", 13.5);
		et.noter("C++", 20);
		System.out.println(et);
		et.setEvaluation("Excellent");
		System.out.println(et);
	}
}

package examVehicule;

public class Main {
	public static void main(String[] args) {
		Vehicule v = new Voiture("diesel", 50);
		System.out.println(v);
		v.consommerCarburant();
		System.out.println(v);
		v.faireLePlein();
		v.consommerCarburant();
		System.out.println(v);

		System.out.println("------");

		Vehicule v2 = new Camion("rouge", "diesel", 150, 50);
		v2.ajouterCarburant(25);
		System.out.println(v2);
		v2.consommerCarburant();
		System.out.println(v2);
		Camion c = (Camion) v2;

		c.chargerMarchandise(10);
		c.chargerMarchandise(40);
		System.out.println("Le message devrait être ici :");
		c.chargerMarchandise(1);
		System.out.println(c);
	}
}

package examVehicule;

public class Voiture extends Vehicule {

	public Voiture(String typeCarburant, int capaciteReservoir) {
		super(typeCarburant, capaciteReservoir);
	}

	public Voiture(String couleur, String typeCarburant, int capaciteReservoir) {
		super(couleur, typeCarburant, capaciteReservoir);
	}

	/*
	J'aurai aimé faire une méthode package-private dans Vehicule
	pour éviter de dupliquer ce code, mais je ne suis pas sûr d'en avoir le droit
	 */
	@Override
	public void consommerCarburant() {
		if(getCarburantDisponible()-1<0){
			System.out.println("Plus de carburant !");
		}else{
			setCarburantDisponible(getCarburantDisponible()-1);
		}
	}
}

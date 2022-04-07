package examVehicule;

public class Camion extends Vehicule {
	private final double capaciteMarchandise;
	private double marchandiseEnCharge;


	public Camion(String typeCarburant, int capaciteReservoir, double capaciteMarchandise) {
		super(typeCarburant, capaciteReservoir);
		this.capaciteMarchandise = capaciteMarchandise;
	}

	public Camion(String couleur, String typeCarburant, int capaciteReservoir, double capaciteMarchandise) {
		super(couleur, typeCarburant, capaciteReservoir);
		this.capaciteMarchandise = capaciteMarchandise;
	}

	/*
		J'aurai aimé faire une méthode package-private dans Vehicule
		pour éviter de dupliquer ce code, mais je ne suis pas sûr d'en avoir le droit
		 */
	@Override
	public void consommerCarburant() {
		if(getCarburantDisponible()-2<0){
			System.out.println("Plus de carburant !");
		}else{
			setCarburantDisponible(getCarburantDisponible()-2);
		}
	}

	public double getCapaciteMarchandise() {
		return capaciteMarchandise;
	}

	public double getMarchandiseEnCharge() {
		return marchandiseEnCharge;
	}

	public void chargerMarchandise(double quantite){
		if(marchandiseEnCharge+quantite>capaciteMarchandise){
			System.out.println("Trop de marchandise !");
		}else{
			marchandiseEnCharge += quantite;
		}
	}

	public void dechargerMarchandise(double quantite){
		if(marchandiseEnCharge-quantite<0){
			System.out.println("On ne peut pas avoir une quantité de marchandise négative !");
		}else{
			marchandiseEnCharge -= quantite;
		}
	}

	/*
	Je ne suis pas sûr de comment imbriquer les toString.
	(la facon dont la consigne demande de les faire est différente de ce que l'on a vu en TP)
	*/
	@Override
	public String toString() {
		return String.format("[Vehicule : %s, capaciteMarchandise : %s, marchandiseEnCharge : %s]", super.toString(), capaciteMarchandise, marchandiseEnCharge);
	}
}

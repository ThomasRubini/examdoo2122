package examVehicule;

public abstract class Vehicule {
	private final String couleur, typeCarburant;
	private final int capaciteReservoir;
	private int carburantDisponible;

	public Vehicule(String typeCarburant, int capaciteReservoir) {
		this("blanc", typeCarburant, capaciteReservoir);
	}

	public Vehicule(String couleur, String typeCarburant, int capaciteReservoir) {
		this.couleur = couleur;
		this.typeCarburant = typeCarburant;
		this.capaciteReservoir = capaciteReservoir;
	}

	public String getCouleur() {
		return couleur;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public int getCapaciteReservoir() {
		return capaciteReservoir;
	}

	public int getCarburantDisponible() {
		return carburantDisponible;
	}

	public void setCarburantDisponible(int carburantDisponible) {
		this.carburantDisponible = carburantDisponible;
	}

	@Override
	public String toString() {
		return String.format("[couleur : %s, typeCarburant : %s, capaciteReservoir : %s, carburantDisponible : %s]", couleur, typeCarburant, capaciteReservoir, carburantDisponible);
	}
	public abstract void consommerCarburant();

	public void faireLePlein() {
		if(carburantDisponible==capaciteReservoir){
			System.out.println("Le réservoir est déja rempli !");
		}else{
			carburantDisponible = capaciteReservoir;
		}
	}

	public void ajouterCarburant(int quantite) {
		if(carburantDisponible+quantite>capaciteReservoir){
			System.out.println("Capacité du réservoir dépassée ");
		}else{
			carburantDisponible+=quantite;
		}
	}

	public boolean reservoirVide(){
		return carburantDisponible==0;
	}

	public boolean reservoirPlein(){
		return carburantDisponible==capaciteReservoir;
	}

}

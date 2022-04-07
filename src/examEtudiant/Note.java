package examEtudiant;

public class Note {
	private final String matiere;
	private final double valeur;

	public Note(String matiere, double valeur) {
		this.matiere = matiere;
		this.valeur = valeur;
	}

	public String getMatiere() {
		return matiere;
	}

	public double getValeur() {
		return valeur;
	}

	@Override
	public String toString() {
		return String.format("%s : %.1f", matiere, valeur);
	}
}

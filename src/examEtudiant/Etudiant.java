package examEtudiant;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private final String nom;
	private final List<Note> notes;

	public Etudiant(String nom) {
		this.nom = nom;
		this.notes = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void noter(String matiere, double valeur){
		notes.add(new Note(matiere, valeur));
	}

	public double getMoyenne(){
		if(notes.size()==0)return -1; // We should add this in the javadoc to make callers aware
		int total = 0;
		for(Note n : notes)total += n.getValeur();
		return total/(double)notes.size();
	}

	@Override
	public String toString() {
		return String.format("Etudiant %s - Moyenne : %.2f", nom, getMoyenne());
	}
}

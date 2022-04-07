package examEtudiant;

public class Alternant extends Etudiant {

	private String evalEntreprise;

	public Alternant(String nom) {
		super(nom);
	}

	public void setEvaluation(String evalEntreprise) {
		switch(evalEntreprise){
			case "Excellent":
			case "Satisfaisant":
			case "Passable":
			case "Insuffisant":
				this.evalEntreprise = evalEntreprise;
				break;
			default:
			throw new IllegalArgumentException("Invalid evaluation value");

		}
	}

	@Override
	public double getMoyenne() {
		double moy = super.getMoyenne();
		if(evalEntreprise==null)return moy;
		switch(evalEntreprise){
			case "Excellent":{
				moy+=2;
				break;
			}
			case "Satisfaisant":{
				moy+=1;
				break;
			}
			case "Insuffisant":{
				moy-=1;
				break;
			}
		}

		if(moy>20)return 20;
		else if(moy<0)return 0;
		else return moy;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(" - Evaluation : ");
		if(evalEntreprise==null){
			sb.append("Aucune");
		}else{
			sb.append(evalEntreprise);
		}
		for(Note n : getNotes()){
			sb.append("\n\t").append(n.getMatiere()).append(" : ").append(n.getValeur());
		}
		return sb.toString();

	}

	// Je pense que les notes devraient être ajoutées au toString de Etudiant, mais la consigne ne dit pas ca
}

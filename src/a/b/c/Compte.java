package a.b.c;

public abstract class Compte implements ICompte{

	private int code;
	protected float solde;

	public Compte(int code, float solde) {

		this.code = code;
		this.solde = solde;
	}

	public Compte() {

	}
	
	public abstract void afficher();

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}

	/*public final void verser(float mt) { //on ne peut pas redefinir une methode final
		solde = solde + mt;
	}

	public void retirer(float mt) {
		solde = solde - mt;
	}*/
}

package a.b.c;

public final class CompteSimple extends Compte{ // on ne peut heriter une classe final

	private float decouvert;
	private final float taux = 2;

	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	@Override
	public void retirer(float mt) {
		if (mt < solde + decouvert)
			solde = solde - mt;
	}

	@Override
	public void afficher() {
		System.out.println("C'est un compte simple");

	}

	@Override
	public void verser(float mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getSolde() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package appli;

import a.b.c.Compte;
import a.b.c.CompteSimple;

public class Application {

	public static void main(String[] args) {

   Compte c = new CompteSimple(1, 3000, 1000);
   
   c.verser(8000);
   c.retirer(5000);
   System.out.println(c.toString());
   c.afficher();

	}

}

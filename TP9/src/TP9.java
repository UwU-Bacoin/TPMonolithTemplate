package tp9;

import java.util.concurrent.ThreadLocalRandom;

import bitmap.*;

public class TP9 {
	
	/**
	 * Calcule un entier aléatoire entre a (inclus) et b (inclus)
	 * @param a un entier
	 * @param b un entier
	 * @pre On doit avoir a < b
	 * @return Un entier aléatoire entre a (inclus) et b (inclus)
	 */
	public static int entierAleatoire(int a, int b) {
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	// TODO écrivez ici vos fonctions
	
	public static void main(String[] args) {

		System.out.println("Début du TP 9");

		// Exemple d'utilisation de la fonction lireImage, et enregistreImage
		Image tigre = BitMap.lireImage("tiger.bmp");
		BitMap.enregistreImage(tigre, "monTigre.bmp");

		// Continuer ici de tester vos fonctions
		
		System.out.println("Fin du TP 9");
	}

}

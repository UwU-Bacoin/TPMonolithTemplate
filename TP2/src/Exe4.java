package tp2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exe4 {

	// Deviner le nombre

	public static int entierAleatoire(int a, int b) {
		// Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	public static void main(String[] args) {

	}
}

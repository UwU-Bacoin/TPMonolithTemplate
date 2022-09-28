package tp9;

/**
 * 
 * Définitions de fonctions pour manipuler les structures Pixel et Image
 * présentées en cours.
 * 
 * Vous pourrez les utiliser dans TP9.java de cette manière:
 * Outils.nomDeFonction(parametres)
 *
 */
public class Outils {

	/**
	 * @return un nouveau pixel de couleur blanche
	 */
	public static Pixel pixelBlanc() {
		Pixel p = new Pixel();
		p.r = 255;
		p.v = 255;
		p.b = 255;
		return p;
	}

	/**
	 * @return un nouveau pixel de couleur grise
	 */
	public static Pixel pixelGris() {
		Pixel p = new Pixel();
		p.r = 200;
		p.v = 200;
		p.b = 200;
		return p;
	}

	/**
	 * @return un nouveau pixel de couleur noire
	 */
	public static Pixel pixelNoir() {
		Pixel p = new Pixel();
		p.r = 0;
		p.v = 0;
		p.b = 0;
		return p;
	}

	/**
	 * 
	 * @param r composante rouge (entier entre 0 et 255)
	 * @param v composante vert (entier entre 0 et 255)
	 * @param b composante bleu (entier entre 0 et 255)
	 * @return un nouveau pixel de composantes (r,v,b)
	 */
	public static Pixel pixel(int r, int v, int b) {
		Pixel p = new Pixel();
		p.r = r;
		p.v = v;
		p.b = b;
		return p;
	}

	/**
	 * @param p un pixel
	 * @return chaîne de caractères indiquant la valeur des 3 composantes de p
	 */
	public static String chainePixel(Pixel p) {
		return "<" + p.r + "," + p.v + "," + p.b + ">";
	}

	/**
	 * Construction d'une nouvelle image (blanche par défaut)
	 * 
	 * @param h entier positif ou nul, hauteur en pixels
	 * @param l entier positif ou nul, largeur en pixels
	 * @return une nouvelle image de dimensions h x l pixels
	 */
	public static Image creerImage(int h, int l) {
		Image monImage = new Image();
		monImage.hauteur = h;
		monImage.largeur = l;
		monImage.tabPixels = new Pixel[l * h];
		for (int i = 0; i < l * h; i++) {
			monImage.tabPixels[i] = pixelBlanc();
		}
		return monImage;
	}

	/**
	 * Accès à un pixel dans une image
	 * 
	 * @param i une image
	 * @param x coordonnée verticale, 0 <= x < i.hauteur
	 * @param y coordonnée horizontale, 0 <= y < y.largeur
	 * @return le pixel aux coordonnées (x,y) dans l'image i
	 */
	public static Pixel getPixel(Image i, int x, int y) {
		return i.tabPixels[x * i.largeur + y];
	}

	/**
	 * Modification d'une image i, aux coordonnées (x,y). Le pixel aux coordonnées
	 * (x,y) dans l'image i est modifié en le pixel p.
	 * 
	 * @param i une image
	 * @param x coordonnée verticale, 0 <= x < i.hauteur
	 * @param y coordonnée horizontale, 0 <= y < y.largeur
	 * @param p un pixel
	 */
	public static void setPixel(Image i, int x, int y, Pixel p) {
		i.tabPixels[x * i.largeur + y] = p;
	}

	/**
	 * Test d'égalité pour deux pixels
	 * 
	 * @param p1 un pixel
	 * @param p2 un pixel
	 * @return un booléen qui est vrai ssi les pixels p1 p2 ont les mêmes
	 *         composantes
	 */
	public static boolean egalPixel(Pixel p1, Pixel p2) {
		return (p1.r == p2.r && p1.v == p2.v && p1.b == p2.b);
	}

}

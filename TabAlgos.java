import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
/**
* Ma class TabAlgos.
* package-info.java: toutes les infos sur le package.
* @author bonaventureyoumbi@yahoo.fr (Bonaventure Youmbi).
*/
public final class TabAlgos {
/** Constructeur de la classe. */
private TabAlgos() {
// TODO
}
/**
* Renvoie la valeur la plus grande d'un tab.
* @param tab est un tab d'entiers.
* @return int le plus grand.
*/
public static int plusGrand(final int[] tab) {
/** Initialiser et affecter à la variable
* le premier élément de mon tab. */
int plusGrand = tab[0];
for (int i = 0; i < tab.length; i++) {
/** A chaque fois on recupère l'entier
* supérieur à la valeur initiale. */
if (tab[i] > plusGrand) {
plusGrand = tab[i];
}
}
return plusGrand;
}
/** Test du plus grand. */
@Test
public void testPlusGrand() {
// TODO
}
/**
* Calcul la moyenne des valeurs d'un tab.
* @param tab est un tableau d'entiers.
* @return double la moyenne.
*/
public static double moyenne(final int[] tab) {
double moyenne = 0.0;
double sumarize = 0;
int tablength = tab.length;
for (int aTab : tab) {
sumarize = sumarize + aTab;
}
moyenne = sumarize / tablength;
return moyenne;
}
/** Test de la moyenne. */
@Test
public void testMoyenne() {
// TODO
}
/**
* Teste si 2 tabx sont identiques
* (avec les elements dans le meme ordre).
* @param tab1 est un tab d'entiers.
* @param tab2 est un tab d'entiers.
* @return boolean si les tab sont
* identiques.
*/
public static boolean egaux(final int[] tab1, final int[] tab2) {
boolean egalite = false;
int tab1length = tab1.length;
int tab2length = tab2.length;
/** Verifier la taille des tableaux, ensuite les valeurs dans l'ordre.*/
if (tab2length == tab1length) {
for (int i = 0; i < tab1length; i++) {
if (tab1[i] == tab2[i]) {
egalite = true;
}
}
} else {
return false;
}
return egalite;
}
/** Test de deux tabeaux d'entiers égaux. */
@Test
public void testEgaux() {
// TODO
}
}
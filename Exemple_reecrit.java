 /**
 * Ma class d'exemple.
 * package-info.java: toutes les infos sur le package.
 * @author bonaventureyoumbi@yahoo.fr (bonaventureyoumbi).
 */
public class Exemple {
    /** Attribut t de stype String. */
    private String t;
    /** Attribut v de stype Integer. */
    private int v;
    /**
     * @param machaine est une chaîne de caractère.
     */
    public Exemple(final String machaine) {
        this.t = machaine;
    }
    /** @return la valeur de v. */
    public final int getV() {
        return this.v;
    }
    /** @param monentier est un entier.  */
    public final void setV(final int monentier) {
        this.v = monentier;
    }
    /** @return machaine si monentier est positif. */
    public final String getT() {
        String tempT = "";
        if (this.v > 0) {
            tempT = this.t;
        }
        return tempT;
    }
}

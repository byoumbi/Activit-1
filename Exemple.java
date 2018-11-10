
/**
*Ma class d'Exemple.
*/
public class Exemple {
private final String t;
private final int v;
public final Exemple (String t){
 t = t;
}
/**
* @return la valeur de v
*/
public int getV(){
return this.v;
}
public final void setV(int v){ this.v=v; }
/**
* @return t si v est positif
*/
public final String getT(){
if (v > 0 ) return t;
}
} 
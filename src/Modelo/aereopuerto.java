
package Modelo;


public class aereopuerto {
 public pasajeros[] vec;
    public int tam;
    pasajeros aux, aux1;

    public aereopuerto(int n) {
        vec = new pasajeros[n];
        setTam(0);

    }

    public pasajeros[] getVec() {
        return vec;
    }

    public void setVec(pasajeros[] vec) {
        this.vec = vec;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
       public void agregarCuenta(pasajeros objp) {
        vec[tam] = objp;
        tam++;

    }
   
   
   
}

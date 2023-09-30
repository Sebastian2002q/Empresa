package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int unidadesPrestadas;
    private double subTotal;
    private Objeto objeto;
    
    //Constructor 
    public DetallePrestamo(int unidadesPrestadas, double subTotal, Objeto objeto){
        assert unidadesPrestadas >= 0;
        assert subTotal >= 0;
        assert objeto != null;
        this.unidadesPrestadas = unidadesPrestadas;
        this.subTotal = subTotal;
        this.objeto = objeto;
        objeto.modificarUnidades(unidadesPrestadas);
    }

    //Getters
    public int getUnidadesPrestadas() {
        return unidadesPrestadas;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Objeto getObjeto() {
        return objeto;
    }



}

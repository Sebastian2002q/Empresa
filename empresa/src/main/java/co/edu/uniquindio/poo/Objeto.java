package co.edu.uniquindio.poo;

public class Objeto {
    private String nombre;
    private String codigo;
    private int unidadesDisponibles;
    private String estado;
    private double precioAlquiler;
    
    //Constructor
    public Objeto(String nombre, String codigo, int unidadesDisponibles, String estado, double precioAlquiler){
        assert nombre != null;
        assert codigo != null;
        assert unidadesDisponibles >= 0;
        assert estado != null;
        assert precioAlquiler >= 0;
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.estado = estado;
        this.precioAlquiler = precioAlquiler;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public String getEstado() {
        return estado;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    /**
     * Permite modificar las unidades disponibles de un objeto
     * @param unidadesNew
     */
    public void modificarUnidades(int unidadesNew){
        this.unidadesDisponibles = getUnidadesDisponibles() + unidadesNew;
        if (getUnidadesDisponibles()>0){
            this.estado = "Disponible";
        }
        if (getUnidadesDisponibles()==0){
            this.estado = "No disponible";
        }
    }
}

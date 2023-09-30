package co.edu.uniquindio.poo;

public class Cliente {
    private String documento;
    private String nombre;
    private String genero;
    private String ciudadResidencia;
    private TipoDocumento tipoDocumento;
    
    //Constructor
    public Cliente(String documento, String nombre, String genero, String ciudadResidencia, TipoDocumento tipoDocumento){
        assert documento != null;
        assert nombre != null;
        assert genero != null;
        assert ciudadResidencia != null;
        assert tipoDocumento != null;
        this.documento = documento;
        this.nombre = nombre;
        this.genero = genero;
        this.ciudadResidencia = ciudadResidencia;
        this.tipoDocumento = tipoDocumento;
    }
}

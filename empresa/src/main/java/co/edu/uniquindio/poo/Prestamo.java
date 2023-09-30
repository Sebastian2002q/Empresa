package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {
    private String codigo;
    private int diasSolicitados;
    private int diasTranscurridos;
    private double valor;
    private Empleado empleado;
    private Cliente cliente;
    private final Collection<DetallePrestamo> detallePrestamos;

    //Constructor
    public Prestamo(String codigo, int diasSolicitados, int diasTranscurridos, double valor, Empleado empleado, Cliente cliente){
        assert codigo != null;
        assert diasSolicitados >= 0;
        assert diasTranscurridos >= 0;
        assert valor >= 0;
        assert empleado != null;
        assert cliente != null;
        this.codigo = codigo;
        this.diasSolicitados = diasSolicitados;
        this.diasTranscurridos = diasTranscurridos;
        this.valor = valor;
        this.empleado = empleado;
        this.cliente = cliente;
        this.detallePrestamos = new LinkedList<>();
    }
}

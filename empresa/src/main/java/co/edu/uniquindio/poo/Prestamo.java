package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;

public class Prestamo {
    private String codigo;
    private int diasSolicitados;
    private int diasTranscurridos;
    private double valor;
    private Empleado empleado;
    private Cliente cliente;
    private final Collection<DetallePrestamo> detallePrestamos;

    //Constructor
    public Prestamo(String codigo, int diasSolicitados, double valor, Empleado empleado, Cliente cliente){
        assert codigo != null;
        assert diasSolicitados >= 0;
        assert valor >= 0;
        assert empleado != null;
        assert cliente != null;
        this.codigo = codigo;
        this.diasSolicitados = diasSolicitados;
        this.diasTranscurridos = 0;
        this.valor = valor;
        this.empleado = empleado;
        this.cliente = cliente;
        this.detallePrestamos = new LinkedList<>();
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public int getDiasSolicitados() {
        return diasSolicitados;
    }

    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public double getValor() {
        return valor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return Collections.unmodifiableCollection(detallePrestamos);
    }
}

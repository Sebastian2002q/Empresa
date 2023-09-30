/**
 * Clase para probar el funcionamiento del código de la empresa
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Empresa{
    private String nombre;
    private String nit;
    private final Collection<Empleado> empleados;
    private final Collection<Cliente> clientes;
    private final Collection<Prestamo> prestamos;
    private final Collection<Objeto> objetos;
    
    //Constructor
    public Empresa(String nombre, String nit){
        assert nombre != null;
        assert nit != null;
        this.nombre = nombre;
        this.nit = nit;
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.prestamos = new LinkedList<>();
        this.objetos = new LinkedList<>();
    }

    


}

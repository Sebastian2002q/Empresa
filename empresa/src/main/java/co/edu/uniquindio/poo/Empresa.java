/**
 * Clase empresa;
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

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

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public Collection<Empleado> getEmpleados(){
        return Collections.unmodifiableCollection(empleados);
    }

    public Collection<Cliente> getClientes() {
        return Collections.unmodifiableCollection(clientes);
    }

    public Collection<Prestamo> getPrestamos() {
        return Collections.unmodifiableCollection(prestamos);
    }

    public Collection<Objeto> getObjetos() {
        return Collections.unmodifiableCollection(objetos);
    }
    
    /** 
     * Permite registrar un cliente a la listaClientes  
     * @param cliente Cliente a ser registrado
     * @throws Se genera si el cliente ya se encuentra registrado
    */
    public void registrarCliente(Cliente cliente){
        validarClienteExiste(cliente);
        clientes.add(cliente);
    }

    /**
     * Valida si el cliente ya se encuentra registrado 
     * @param cliente
     */
    private void validarClienteExiste(Cliente cliente) {
        boolean existeEquipo = buscarClientePorDocumento(cliente.getDocumento()).isPresent();
        assert !existeEquipo: "El cliente ya esta registrado";
    }

    /**
     * Permite buscar un cliente por su documento entre los clientes registrados
     * @param documento
     * @return
     */
    public Optional<Cliente> buscarClientePorDocumento(String documento){
        Predicate<Cliente> condicion = cliente->cliente.getDocumento().equals(documento);
        return clientes.stream().filter(condicion).findAny();
    }

    /** 
     * Permite registrar un empleado a la listaEmpleados  
     * @param empleado Empleado a ser registrado
     * @throws Se genera si el empleado ya se encuentra registrado
    */
    public void registrarEmpleado(Empleado empleado){
        validarEmpleadoExiste(empleado);
        empleados.add(empleado);
    }

    /**
     * Valida si el empleado ya se encuentra registrado 
     * @param empleado
     */
    private void validarEmpleadoExiste(Empleado empleado) {
        boolean existeEquipo = buscarEmpleadoPorCodigo(empleado.getCodigo()).isPresent();
        assert !existeEquipo: "El empleado ya esta registrado";
    }
    
    /**
     * Permite buscar un empleado por su codigo entre los empleados registrados
     * @param codigo
     * @return
     */
    public Optional<Empleado> buscarEmpleadoPorCodigo(String codigo){
        Predicate<Empleado> condicion = empleado->empleado.getCodigo().equals(codigo);
        return empleados.stream().filter(condicion).findAny();
    }

    /** 
     * Permite registrar un prestamo a la listaPrestamos  
     * @param prestamo Prestamo a ser registrado
     * @throws Se genera si el prestamo ya se encuentra registrado
    */
    public void registrarPrestamo(Prestamo prestamo){
        validarPrestamoExiste(prestamo);
        prestamos.add(prestamo);
    }

    /**
     * Valida si el prestamo ya se encuentra registrado 
     * @param prestamo
     */
    private void validarPrestamoExiste(Prestamo prestamo) {
        boolean existeEquipo = buscarPrestamoPorCodigo(prestamo.getCodigo()).isPresent();
        assert !existeEquipo: "El prestamo ya esta registrado";
    }
    
    /**
     * Permite buscar un prestamo por su codigo entre los prestamos registrados
     * @param documento
     * @return
     */
    public Optional<Prestamo> buscarPrestamoPorCodigo(String codigo){
        Predicate<Prestamo> condicion = prestamo->prestamo.getCodigo().equals(codigo);
        return prestamos.stream().filter(condicion).findAny();
    }

    /** 
     * Permite registrar un objeto a la listaObjetos  
     * @param objeto Objeto a ser registrado
     * @throws Se genera si el objeto ya se encuentra registrado
    */
    public void registrarObjeto(Objeto objeto){
        validarObjetoExiste(objeto);
        objetos.add(objeto);
    }

    /**
     * Valida si el ojeto ya se encuentra registrado 
     * @param objeto
     */
    private void validarObjetoExiste(Objeto objeto) {
        boolean existeEquipo = buscarObjetoPorCodigo(objeto.getCodigo()).isPresent();
        assert !existeEquipo: "El objeto ya esta registrado, unicamente modifique las unidades disponibles";
    }
    
    /**
     * Permite buscar un objeto por su codigo entre los objetos registrados
     * @param codigo
     * @return
     */
    public Optional<Objeto> buscarObjetoPorCodigo(String codigo){
        Predicate<Objeto> condicion = objeto->objeto.getCodigo().equals(codigo);
        return objetos.stream().filter(condicion).findAny();
    }
}

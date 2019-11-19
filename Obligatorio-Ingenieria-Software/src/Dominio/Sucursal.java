package Dominio;

public class Sucursal {

    //Atributos
    private int numeroSucursal;
    private String direccion;
    private long telefono;
    
    //Constructores
    public Sucursal(int numeroSucursal, String direccion, long telefono) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    public Sucursal() {
        this.setNumeroSucursal(1);
        this.setDireccion("Direccion");
        this.setTelefono(1);
    }
    
    //Getters && Setters
    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        if (numeroSucursal >= 1) {
            this.numeroSucursal = numeroSucursal;
        } else {
            throw new RuntimeException("numeroSucursalMayorA0");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (!direccion.trim().equals("")) {
            this.direccion = direccion;
        } else {
            throw new RuntimeException("direccionNoVacia");
        }
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if (telefono >= 1) {
            this.telefono = telefono;
        } else {
            throw new RuntimeException("telefonoMayorA0");
        }
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Sucursal{" 
                + "numeroSucursal=" + numeroSucursal 
                + ", direccion=" + direccion 
                + ", telefono=" + telefono + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Sucursal) {
            Sucursal s = (Sucursal) o;
            retorno = this.getNumeroSucursal()
                    == s.getNumeroSucursal();
        }
        return retorno;
    }

    public int hashCode() {
        assert false : "hashCode not designed";
        return 1;
    }

}

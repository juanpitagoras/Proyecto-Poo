public abstract class Asiento {
    protected String numero;
    protected String cateogria;
    protected boolean disponible;

    public Asiento(String numero, String categoria, boolean disponible) {
        this.numero = numero;
        this.cateogria = categoria;
        this.disponible = disponible;
    }

    public String getNumero() {
        return numero;
    }

    public abstract boolean Reservar();
    public abstract boolean Liberar();
    public abstract boolean estaDisponible(); 
    
}
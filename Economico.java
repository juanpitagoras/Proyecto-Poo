public class Economico extends Asiento {
    
    public Economico(String numero, boolean disponible){
        super(numero, "Economica", disponible);

    }

    @Override
    public boolean Reservar();

    @Override
    public boolean Liberar();

    @Override
    public boolean estaDisponible();

    // Implementación de los métodos abstractos de la clase Asiento

} 

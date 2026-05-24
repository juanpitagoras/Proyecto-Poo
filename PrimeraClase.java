public class PrimeraClase extends Asiento {
    
    public PrimeraClase(String numero, boolean dispoible){
        super(numero, "Primera Clase", disponible);

    }

    @Override
    public boolean Reservar();
    
    @Override
    public boolean Liberar();

    @Override
    public boolean estaDisponible();
}

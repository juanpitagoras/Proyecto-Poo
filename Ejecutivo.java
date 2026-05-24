public  class Ejecutivo extends Asiento {

    public Ejecutivo(String numero, boolean dispoible){
        super(numero, "Ejecutivo", disponible);

    }

    @Override
    public boolean Reservar();

    @Override
    public boolean Liberar();

    @Override
    public boolean estaDisponible();

    // Implementación de los métodos abstractos de la clase Asiento
}

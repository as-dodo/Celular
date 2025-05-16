public class Motorola extends Celular{


    public Motorola(String duenio, String modelo, double bateria, boolean estaApagado) {
        super(duenio, modelo, bateria, estaApagado);
        this.pierdeBateria = 0.25;
    }


}

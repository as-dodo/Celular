public class Iphone extends Celular{

    public Iphone(String duenio, String modelo, double bateria, boolean estaApagado) {
        super(duenio, modelo, bateria, estaApagado);
        this.pierdeBateria = 0.1;
    }
}

public class Celular {
    protected String duenio;
    protected String modelo;
    protected double bateria;
    protected boolean estaApagado;
    protected double pierdeBateria;

    public Celular(String duenio, String modelo, double bateria, boolean estaApagado) {
        this.duenio = duenio;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estaApagado = estaApagado;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public boolean isEstaApagado() {
        return estaApagado;
    }

    public void setEstaApagado(boolean estaApagado) {
        this.estaApagado = estaApagado;
    }

    public double getPierdeBateria() {
        return pierdeBateria;
    }

    public void setPierdeBateria(double pierdeBateria) {
        this.pierdeBateria = pierdeBateria;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "dueño='" + duenio + '\''+
                "modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", estaApagado=" + estaApagado +
                '}';
    }
}

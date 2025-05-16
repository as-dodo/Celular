import javax.swing.*;

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

    public static void hacerLlamada(Celular c1, Celular c2, int minutos) {
        if (c1.estaApagado) {
            JOptionPane.showMessageDialog(null, c1.duenio + " no puede llamar — su celular está apagado.");
            return;
        }
        if (c2.estaApagado) {
            JOptionPane.showMessageDialog(null, c2.duenio + " no puede recibir la llamada — su celular está apagado.");
            return;
        }

        double consumo1 = c1.pierdeBateria * minutos;
        c1.bateria -= consumo1;
        if (c1.bateria <= 0) {
            c1.bateria = 0;
            c1.estaApagado = true;
        }

        double consumo2 = c2.pierdeBateria * minutos;
        c2.bateria -= consumo2;
        if (c2.bateria <= 0) {
            c2.bateria = 0;
            c2.estaApagado = true;
        }

        JOptionPane.showMessageDialog(null,
                c1.duenio + " y " + c2.duenio + " hablaron durante " + minutos + " minutos.\n" +
                        "Batería de " + c1.duenio + ": " + c1.bateria + "\n" +
                        "Batería de " + c2.duenio + ": " + c2.bateria);
    }


    public void recargar (){
        this.bateria = 5;
        this.estaApagado = false;
    }


}

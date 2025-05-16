import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        Motorola nastya = new Motorola("nastia","motorola", 5, false);
//        Iphone ilya = new Iphone("ilya","iphone", 5, false);
//        nastya.llamar(15);
//        ilya.llamar(15);

        Celular celular1 = crearCelularDesdeInput("primer");
        Celular celular2 = crearCelularDesdeInput("segundo");

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null,
                    "Menú de opciones:\n" +
                            "1. Hacer llamada entre " + celular1.getDuenio() + " y " + celular2.getDuenio() + "\n" +
                            "2. Ver batería de ambos celulares\n" +
                            "3. Recargar celular de " + celular1.getDuenio() + "\n" +
                            "4. Recargar celular de " + celular2.getDuenio() + "\n" +
                            "5. ¿Está apagado el celular de " + celular1.getDuenio() + "?\n" +
                            "6. ¿Está apagado el celular de " + celular2.getDuenio() + "?\n" +
                            "0. Salir\n");

            switch (opcion) {
                case "1" -> {
                    int min = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos minutos quieren hablar?"));
                    Celular.hacerLlamada(celular1, celular2, min);
                }
                case "2" -> {
                    JOptionPane.showMessageDialog(null,
                            "Batería de " + celular1.getDuenio() + ": " + celular1.getBateria() + "\n" +
                                    "Batería de " + celular2.getDuenio() + ": " + celular2.getBateria());
                }
                case "3" -> {
                    celular1.recargar();
                    JOptionPane.showMessageDialog(null, "Celular de " + celular1.getDuenio() + " recargado.");
                }
                case "4" -> {
                    celular2.recargar();
                    JOptionPane.showMessageDialog(null, "Celular de " + celular2.getDuenio() + " recargado.");
                }
                case "5" -> {
                    String msg = celular1.isEstaApagado() ? "apagado" : "encendido";
                    JOptionPane.showMessageDialog(null, "El celular de " + celular1.getDuenio() + " está " + msg + ".");
                }
                case "6" -> {
                    String msg = celular2.isEstaApagado() ? "apagado" : "encendido";
                    JOptionPane.showMessageDialog(null, "El celular de " + celular2.getDuenio() + " está " + msg + ".");
                }
                case "0" -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (!opcion.equals("0"));
    }

    public static Celular crearCelularDesdeInput(String orden) {
        String duenio = JOptionPane.showInputDialog("Ingrese el nombre del " + orden + " usuario:");

        String[] opciones = {"Motorola", "iPhone"};
        String modelo = (String) JOptionPane.showInputDialog(
                null,
                "¿Qué modelo tiene " + duenio + "?",
                "Seleccionar modelo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        double bateria = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese nivel de batería inicial (entre 0 y 5):"));
        if (bateria < 0) bateria = 0;
        if (bateria > 5) bateria = 5;

        int encendido = JOptionPane.showConfirmDialog(
                null,
                "¿El celular está encendido?",
                "Estado del celular",
                JOptionPane.YES_NO_OPTION);

        boolean estaApagado = encendido != JOptionPane.YES_OPTION;

        if (modelo.equals("iPhone")) {
            return new Iphone(duenio, "iPhone", bateria, estaApagado);
        } else {
            return new Motorola(duenio, "Motorola U9", bateria, estaApagado);
        }
    }
}

public class Persona {
    // Todas las personas pueden hacer muchas cosas. Vamos a simular algunas actividades mediante métodos.

    int edad = 20;
    int hora = 14;
    String dia = "sábado";

    void mayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    void saludar() {
        if (hora < 12) {
            System.out.println("¡Buenos días!");
        } else if (hora < 18) {
            System.out.println("¡Buenas tardes!");
        } else {
            System.out.println("¡Buenas noches!");
        }
    }

    void comer() {
        if (hora >= 7 && hora < 10) {
            System.out.println("Es hora del desayuno.");
        } else if (hora >= 12 && hora < 15) {
            System.out.println("Es hora del almuerzo.");
        } else if (hora >= 19 && hora < 22) {
            System.out.println("Es hora de la cena.");
        } else {
            System.out.println("No es hora de comer ahora.");
        }
    }

    void dormir() {
        if (hora >= 22 || hora < 6) {
            System.out.println("Es hora de dormir.");
        } else {
            System.out.println("Aún no es hora de dormir.");
        }
    }

    void actividadDiaria() {
        if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("domingo")) {
            System.out.println("Es fin de semana. Puedes descansar.");
        } else {
            System.out.println("Es día laboral. A trabajar.");
        }
    }
}
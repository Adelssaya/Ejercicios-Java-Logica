public class resta {
    //definir un metodo - metodo es la manera de ejecutar una funcion
    //dentro de los parentesis nosotros podemos poner N cantidad de argumentos
    //es decir tu puedes pasar los valores que tu deseas
    void resta (double a, double b, double c) {
        System.out.println("el valor que llega como parametro A es: " + a);
        System.out.println("el valor que llega como parametro B es: " + b);
        System.out.println("el valor que llega como parametro C es: " + c);

        double valorDeLaOperacion = a-b-c;
        System.out.println("El valor de la operacion es: " + valorDeLaOperacion);
    }
}

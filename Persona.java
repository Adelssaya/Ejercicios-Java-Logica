public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre, edad
    //etc. Asi que vamos a simular algunas actividades mediante metodos.

    //una buena practica es declarar variables en la parte mas alta del codigo
    int edad = 20;
    void mayorDeEdad(){
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}

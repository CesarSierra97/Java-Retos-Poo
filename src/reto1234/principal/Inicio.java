package reto1234.principal;

import reto1234.salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        
        Persona objeto = new Persona();

        objeto.pedirDatos();
        objeto.mostrarPersona();

        String respuesta = objeto.calcularImc();
        if (objeto.pesoActual < 20) {
            System.out.println(respuesta);
        } else if (objeto.pesoActual >= 20 || objeto.pesoActual < 25) {
            System.out.println(respuesta);
        } else if (objeto.pesoActual > 25) {
            System.out.println(respuesta);
        }
        
        objeto.mayoEdad();

        Persona objeto2 = new Persona("cesar" , "sierra", 1073);

        objeto2.MostrarMetodoconstructor();

        objeto2.MostrarMetodoconstructor(55);
       
        

    }
    
}

public class Main {
    public static void main(String[] args) {
        Persona profesor = new Persona(36, "Javier");
        boolean esMayorDeEdad = profesor.esMayorDeEdad();
        if(esMayorDeEdad){
            System.out.println("El profesor " + profesor.nombre + " es mayor de edad.");
        } else {
            System.out.println("El profesor " + profesor.nombre + " es muy joven!");
        }
    }
}
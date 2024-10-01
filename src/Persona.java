public class Persona {

    int edad;
    String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = false;
        if(this.edad >= 18){
            esMayor = true;
        }
        return esMayor;
    }

}

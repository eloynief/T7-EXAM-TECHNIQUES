package crud;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 7.5);
        Alumno alumno2 = new Alumno("Pedro", 9.0);

        System.out.println(alumno1);
        System.out.println(alumno2);

        alumno1.setNotaMedia(8.0);
        alumno2.setNombre("Pablo");

        System.out.println(alumno1);
        System.out.println(alumno2);
    }
}
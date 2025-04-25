public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;

    public Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombre() {
        if(nombre == null){
            System.out.println("Name not found or student not existing");
        }
        return nombre;
    }

    public int getEdad() {
        if(edad == -1){
            System.out.println("Age not found or student not existing");
        }
        return edad;
    }

    public double[] getNotas() {
        if(notas == null){
            System.out.println("Grades not found or student not existing");
        }
        return notas;
    }
}
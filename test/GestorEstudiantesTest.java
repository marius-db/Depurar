import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GestorEstudiantesTest {

    Estudiante[] estudiantes = new Estudiante[]{
            new Estudiante("Ana",    20, new double[]{8.5, 9.0, 7.5}),
            new Estudiante("Luis",   22, new double[]{6.0, 5.5}),
            new Estudiante("Marta",  19, new double[]{9.5, 10.0}),
            new Estudiante("Carlos", 21, new double[]{})
    };

    //Error 1
    @Test
    public void testCalcularNotaMedia() {
        assertEquals(8.33, GestorEstudiantes.calcularNotaMedia(estudiantes[0]), 0.01);
    }

    //Error 2
    @Test
    public void testCalcularNotaMedia_SinNotas() {
        assertEquals(0, GestorEstudiantes.calcularNotaMedia(estudiantes[3]), 0.01);
    }

    //Error 3
    @Test
    public void testEncontrarMejorEstudiante_NoEstudiantesEnLista() {
        Estudiante[] empty = new Estudiante[]{};
        Estudiante result = GestorEstudiantes.encontrarMejorEstudiante(empty);
        System.out.println(result.getNombre());
        System.out.println(result.getEdad());
        System.out.println(Arrays.toString(result.getNotas()));
    }

    //Error 4
    @Test
    public void testGuardarResultados_EstudianteSinNotas() throws IOException {
        File f = new File("test_results.txt");
        GestorEstudiantes.guardarResultados(estudiantes, f.getPath());
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
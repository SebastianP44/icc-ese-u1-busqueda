import java.util.List;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
                new Persona("Juan", 25, "M"),
                new Persona("Maria", 30, "F"),
                new Persona("Pedro", 20, "M"),
                new Persona("Ana", 28, "F"));
        BusquedaLineal busqueda = new BusquedaLineal(personas);
        Persona personaEncontrada = busqueda.findByName("Maria");
        System.out.println(personaEncontrada);
        Persona personaNoEncontrada = busqueda.findByName("Diego");
        System.out.println(personaNoEncontrada);
        Persona personaEncontrada2 = busqueda.findByName("Ana");
        System.out.println(personaEncontrada2);
    }
}

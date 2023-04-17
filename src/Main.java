import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Accion> colaAcciones = new PriorityQueue<>((a1, a2) -> a2.personaje.celeridad - a1.personaje.celeridad);

        Personaje guerrero = new Personaje(1, "Guerrero", 30);
        Personaje mago = new Personaje(2, "Mago", 20);
        Personaje arquero = new Personaje(3, "Arquero", 40);

        Accion ataqueGuerrero = new Accion(guerrero, "ataque", mago);
        Accion hechizoVelocidadMago = new Accion(mago, "hechizo_velocidad", guerrero);
        Accion ataqueArquero = new Accion(arquero, "ataque", mago);

        colaAcciones.add(ataqueGuerrero);
        colaAcciones.add(hechizoVelocidadMago);
        colaAcciones.add(ataqueArquero);

        while (!colaAcciones.isEmpty()) {
            Accion accionActual = colaAcciones.poll();
            accionActual.ejecutar();

            // Reorganizar la cola de acciones en caso de cambios en la celeridad
            Queue<Accion> colaTemp = new PriorityQueue<>((a1, a2) -> a2.personaje.celeridad - a1.personaje.celeridad);
            colaTemp.addAll(colaAcciones);
            colaAcciones = colaTemp;
        }
    }
}
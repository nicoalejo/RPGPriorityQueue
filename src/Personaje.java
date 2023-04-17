class Personaje implements Comparable<Personaje> {
    int id;
    String nombre;
    int celeridad;

    public Personaje(int id, String nombre, int celeridad) {
        this.id = id;
        this.nombre = nombre;
        this.celeridad = celeridad;
    }

    @Override
    public int compareTo(Personaje otroPersonaje) {
        return Integer.compare(otroPersonaje.celeridad, this.celeridad);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", celeridad=" + celeridad +
                '}';
    }
}
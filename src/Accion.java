class Accion {
    Personaje personaje;
    String tipoAccion;
    Personaje objetivo;

    public Accion(Personaje personaje, String tipoAccion, Personaje objetivo) {
        this.personaje = personaje;
        this.tipoAccion = tipoAccion;
        this.objetivo = objetivo;
    }

    public void ejecutar() {
        System.out.println(personaje.nombre + " realiza " + tipoAccion + " sobre " + objetivo.nombre);
        if ("hechizo_velocidad".equals(tipoAccion)) {
            objetivo.celeridad += 10;
        } else if ("hechizo_lentitud".equals(tipoAccion)) {
            objetivo.celeridad -= 10;
        }
    }
}
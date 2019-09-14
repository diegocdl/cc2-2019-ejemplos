public class Estudiante implements Ordenable {
    protected long carnet;
    protected String nombre;

    public Estudiante(long c, String n) {
        carnet = c;
        nombre = n;
    }

    public boolean gratherThan(Ordenable o) {
        if (o instanceof Estudiante) {
            return this.carnet > o.getId();
        } else {
            return true;
        }
    }

    public long getId() {
        return carnet;
    }

    public String toString() {
        return "Estudiante -> " + carnet + "|" + nombre;
    }
}
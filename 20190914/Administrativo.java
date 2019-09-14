public class Administrativo implements Ordenable {
    protected long id;
    protected String nombre;

    public Administrativo(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public boolean gratherThan(Ordenable o) {
        if (o instanceof Estudiante) {
            return false;
        } else if (o instanceof Administrativo) {
            return this.id > o.getId();
        } else {
            return true;
        }
    }

    public long getId() {
        return id;
    }

    public String toString() {
        return "Administrativo -> " + id + "|" + nombre;
    }
}
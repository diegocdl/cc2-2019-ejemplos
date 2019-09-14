public class Catedratico implements Ordenable {
    protected long id;
    protected String nombre;

    public Catedratico(long id, String n) {
        this.id = id;
        this.nombre = n;
    }

    public boolean gratherThan(Ordenable o) {
        if( o instanceof Catedratico) {
            // Catedratico c = (Catedratico)o;
            // return this.id > c.getId();

            // antes de agregar a la interfaz Ordenable el metodo getId tenia que 
            // realizar el codigo comentado arriba.
            return this.id > o.getId();
        } else {
            return false;
        }
    }

    public long getId() {
        return id;
    }

    public String toString() {
        return "Catedratico -> " + id + "|" + nombre;
    }
}
package futbol;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    final private String posicion;

    public Futbolista() {
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String toString() {
        return String.format("El futbolista %s tiene %d, y juega de %s", this.nombre, this.edad, this.posicion);
    }

    public boolean equals(Futbolista f) {
        if (this == f) {
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract boolean jugarConLasManos();

    public String getPosicion() {
        return posicion;
    }

}

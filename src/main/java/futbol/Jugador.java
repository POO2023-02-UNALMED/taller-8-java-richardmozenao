package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public int compareTo(Futbolista futbolista) {
        if (this.getEdad() > futbolista.getEdad()) {
            return this.getEdad() - futbolista.getEdad();
        } else {
            return futbolista.getEdad() - this.getEdad();
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" con el dorsal %d. Ha marcado %d", this.dorsal, this.golesMarcados);
    }

    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

}

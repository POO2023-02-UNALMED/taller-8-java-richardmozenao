package futbol;

public class Portero extends Futbolista {
    short golesRecibidos;
    byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public Portero() {
        super();
        this.golesRecibidos = 0;
        this.dorsal = 8;
    }

    public boolean jugarConLasManos() {
        return true;
    }

    public String toString() {
        return super.toString()
                + String.format("con el dorsal /d. Le han marcado /d", this.dorsal, this.golesRecibidos);
    }

    public int compareTo(Portero portero) {
        if (this.golesRecibidos > portero.golesRecibidos) {
            return this.golesRecibidos - portero.golesRecibidos;
        } else {
            return portero.golesRecibidos - this.golesRecibidos;
        }
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

}

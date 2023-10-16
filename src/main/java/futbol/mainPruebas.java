package futbol;

public class mainPruebas {
    public static void main(String[] args){
        Jugador f = new Jugador();
		String  comp = "El futbolista Maradona tiene 30, y juega de delantero con el dorsal 7. Ha marcado 289";
		boolean ok = false;
		System.out.println(f);
        System.out.println(comp);
        String a = "a";
        String b = String.format("b%d", 7);
        String cadena = a+b;
        System.out.println(cadena);
    }
}

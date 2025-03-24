public class Televisor {
    private String marca;
    private String modelo;
    private int anio;
    private char tipo;
    private int pulgadas;
    private String resolucion;
    private boolean esSmart;
    private boolean encendido;
    
    private static String pantalla = "FOX";

    public Televisor(String marca, String modelo, int anio, char tipo, int pulgadas, String resolucion,
            boolean esSmart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.esSmart = esSmart;
    }

    @Override
    public String toString() {
        String smart = "";
        if (this.esSmart)
            smart = "-- Smart";
        return String.format("%s %s -- %d pulgadas -- %s %s", marca, modelo, pulgadas, resolucion, smart);
    }

    public static String getPantalla(){
        return pantalla;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public char getTipo() {
        return tipo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

}

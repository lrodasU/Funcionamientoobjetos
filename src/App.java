public class App {
    public static void main(String[] args) throws Exception {
        Televisor teleSamsung = new Televisor("Samsung", "Crystal UHD DU7000", 2025, 'O', 75, "4K", true);
        Televisor teleLG = new Televisor("LG", "Infinia LX9500", 2010, 'L', 47, "1080p", false);

        teleSamsung.encender();

        System.out.println(teleSamsung.toString());
        System.out.println(teleLG.toString());

        System.out.println("El televisor Samsung se encuentra " + (teleSamsung.estaEncendido() ? "encendido" : "apagado"));
        System.out.println("El televisor LG se encuentra " + (teleLG.estaEncendido() ? "encendido" : "apagado"));

        System.out.println("Contenido pantalla: "+Televisor.getPantalla());
    }
}

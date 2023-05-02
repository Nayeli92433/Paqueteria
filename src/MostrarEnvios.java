public class MostrarEnvios {
    CalcularValorEnvio calcularValorEnvio= new CalcularValorEnvio();
    public void imprimirEnvios(PaqueteDeEnvio[] paquetes) {
        for (PaqueteDeEnvio paquete : paquetes) {
            System.out.println("_____________________________________________________________________");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          DATOS DEL ENVIO");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Remitente: " + paquete.getRemitente().getNombres() + " " + paquete.getRemitente().getApellidos());
            System.out.println("Destinatario: " + paquete.getDestinatario().getNombres() + " " + paquete.getDestinatario().getApellidos());
            System.out.println("Tipo de envío: " + paquete.getTipoEnvio());
            System.out.println("Contenido: " + paquete.getContenido());
            System.out.println("Peso: " + paquete.getPeso());
            System.out.println("Valor del envío: " + calcularValorEnvio.calcularValorEnvio(paquete.getPeso(),paquete.getTipoEnvio(),paquete.getContenido()));
            System.out.println("---------------------------------------------------------------------");
        }
    }
}

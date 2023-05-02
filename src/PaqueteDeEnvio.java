public class PaqueteDeEnvio {
    private Persona remitente;
    private Persona destinatario;
    private String tipoEnvio;
    private String contenido;
    private double peso;

    public static class Persona {
        private String nombres;
        private String apellidos;
        private String direccion;
        private String telefono;

        public Persona(String nombres, String apellidos, String direccion, String telefono) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombres() {
            return nombres;
        }
        public String getApellidos() {
            return apellidos;
        }
    }

    public PaqueteDeEnvio(Persona remitente, Persona destinatario, String tipoEnvio, String contenido, double peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.contenido = contenido;
        this.peso = peso;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public String getContenido() {
        return contenido;
    }

    public double getPeso() {
        return peso;
    }
}

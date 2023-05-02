public class CalcularValorEnvio {
    public double calcularValorEnvio(double peso, String tipoEnvio, String contenido) {
        double costoEnvio = 0;
        if (tipoEnvio.equals("nacional")) {
            costoEnvio = calcularNacional(peso, contenido);

        } else if (tipoEnvio.equals("internacional")) {
            costoEnvio = calcularInternacional(peso, contenido);
        }

        return costoEnvio;
    }

    public double calcularNacional(double peso, String contenido) {
        double costoEnvio = 0;
        if (contenido.equals("documento")) {
            if (peso <= 2) {
                costoEnvio = 400;
            } else if (peso > 2) {
                costoEnvio = 600;
            }
        } else if (contenido.equals("mercancía")) {
            if (peso <= 5) {
                costoEnvio = 800;
            } else if (peso > 5) {
                costoEnvio = 1000;
            }
        }
        return costoEnvio;
    }

    public double calcularInternacional(double peso, String contenido) {
        double costoEnvio=0;
        if (contenido.equals("documento")) {
            if (peso <= 2) {
                costoEnvio = 4000;
            } else if (peso > 2) {
                costoEnvio = 6000;
            }
        } else if (contenido.equals("mercancía")) {
            if (peso <= 5) {
                costoEnvio = 9000;
            } else if (peso > 5) {
                costoEnvio = 12000;
            }
        }
        return costoEnvio;
    }
}




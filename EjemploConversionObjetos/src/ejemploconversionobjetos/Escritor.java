package ejemploconversionobjetos;

public class Escritor extends Empleado {
    
    private TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()
                + "\nTipo Escritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoEscrituraTexto() {
        return tipoEscritura.getDescripcion();
    }
}

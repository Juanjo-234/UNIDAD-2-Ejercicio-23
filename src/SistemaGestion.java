public class SistemaGestion {
    private GeneradorReporte generadorReporte;

    public SistemaGestion(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void procesarYExportar(String datosBrutos) {
        generadorReporte.exportar(datosBrutos);
    }

    public void setGeneradorReporte(GeneradorReporte excel) {

    }
}

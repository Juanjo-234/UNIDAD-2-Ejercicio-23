//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    GeneradorReporte pdf = new ReportePDF();
    GeneradorReporte excel = new ReporteEXCEL();
    GeneradorReporte html = new ReporteHTML();


    String dataset = "Resumen de ventas anuales y métricas de rendimiento";

    System.out.println("=== PRUEBA 1: Reporte PDF ===");
    SistemaGestion sistema = new SistemaGestion(pdf);
    sistema.procesarYExportar(dataset);

    System.out.println("=== PRUEBA 2: Reporte Excel ===");
    sistema.setGeneradorReporte(excel);
    sistema.procesarYExportar(dataset);

    System.out.println("=== PRUEBA 3: Reporte HTML ===");
    sistema.setGeneradorReporte(html);
    sistema.procesarYExportar(dataset);
}

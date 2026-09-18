public class ReportePDF implements  GeneradorReporte{
  public void exportar(String contenido){
        System.out.println("---GENERANDO DOCUMENTO PDF---");
        System.out.println("-----------------------------");
        System.out.println("ENCABEZADO DE PAGINA (PDF)\n");
        System.out.println("Contenido: " + contenido);
        System.out.println("\nPIE DE PAGINA Pagina 1-1");
        System.out.println("-----------------------------");
        System.out.println("---DOCUMENTO EXPORTADO EITOSAMENTE---");
    }
}

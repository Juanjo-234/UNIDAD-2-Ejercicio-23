public class ReporteHTML implements  GeneradorReporte{
   public void exportar(String contenido){

        System.out.println("[HTML] Generando estructura de etiquetas web...");
        System.out.println("<html>");
        System.out.println("  <head><title>Reporte Web</title></head>");
        System.out.println("  <body>");
        System.out.println("    <h1>Reporte General</h1>");
        System.out.println("    <p>" + contenido + "</p>");
        System.out.println("  </body>");
        System.out.println("</html>");
        System.out.println("Archivo HTML generado exitosamente.\n");

    }
}

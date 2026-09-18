public class ReporteEXCEL implements  GeneradorReporte{
   public void exportar(String contenido){
        System.out.println("ESTRUCTURANDO FILAS Y COLUMNAS EN HOJA DE CÁLCULO");
        System.out.println("+-----------------------+------------------------------+");
        System.out.println("        ID_CELDA        |   VALOR                      |");
        System.out.println("+-----------------------+------------------------------+");
        System.out.println("        CONTENIDO       |     " + contenido + "        |");
        System.out.println("+-----------------------+------------------------------+");
        System.out.println("Archivo de excel exportado exitosamente\n");
    }
}

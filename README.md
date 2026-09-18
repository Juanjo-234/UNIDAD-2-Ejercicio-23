Resolución del ejercicio N°23 de la unidad 2 de programacion 2.
Este programa simula un sistema de gestión empresarial centralizado capaz de procesar y exportar información institucional hacia múltiples formatos de salida de manera flexible y modular mediante el uso de interfaces.

Clases e Interfaz Utilizadas
GeneradorReporte (Interfaz): Define el contrato estándar que deben cumplir todos los componentes encargados de exportar información.
ReportePDF: Implementa la interfaz simulando la creación de documentos orientados a la impresión y diseño estático.
ReporteExcel: Implementa la interfaz simulando la estructuración de datos tabulares y hojas de cálculo.
ReporteHTML: Implementa la interfaz simulando la generación de páginas web con etiquetas y contenido estructurado.
SistemaGestion: Clase coordinadora que centraliza el procesamiento de datos y utiliza la abstracción del reporte para cambiar de formato dinámicamente.

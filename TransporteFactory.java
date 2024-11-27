
// Padrão Factory Method aplicado para criar diferentes tipos de transporte.
public class TransporteFactory {
  // Método de fábrica para instanciar objetos de transporte.
  public static Transporte criarTransporte(String tipo) {
      switch (tipo.toLowerCase()) {
          case "onibus":
              return new TransporteOnibus(); // Retorna uma instância de TransporteOnibus.
          case "metro":
              return new TransporteMetro(); // Retorna uma instância de TransporteMetro.
          case "trem":
              return new TransporteTrem(); // Retorna uma instância de TransporteTrem.
          default:
              throw new IllegalArgumentException("Tipo de transporte inválido");
      }
  }
}


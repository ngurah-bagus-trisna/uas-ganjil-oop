class Kamar {
  String jenis;

  public Kamar(String jenis) {
      this.jenis = jenis;
  }
}

class Rumah {
  String alamat;
  Kamar kamar; 

  public Rumah(String alamat, String jenisKamar) {
      this.alamat = alamat;
      this.kamar = new Kamar(jenisKamar);
  }

  public void Detail() {
      System.out.println("Rumah di " + alamat + " memiliki kamar: " + kamar.jenis);
  }
}

public class CompositionExample {
  public static void main(String[] args) {
      Rumah rumah = new Rumah("Jl. Merdeka No. 10", "Tidur");
      rumah.Detail();
  }
}
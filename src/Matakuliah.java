public class Matakuliah {

  

  private String kode;
  private String nama;
  private int sks;
  private String indexNilai;

  // Constructor
  public Matakuliah(String kode, String nama,  String indexNilai,int sks) {
    this.kode = kode;
    this.nama = nama;
    this.indexNilai = indexNilai;
    this.sks = sks;

  }

  // Getter and Setter methods
  public String getKode() {
    return kode;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getSks() {
    return sks;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }

  public String getIndexNilai() {
    return indexNilai;
  }

  public void setIndexNilai(String indexNilai) {
    this.indexNilai = indexNilai;
  }

  // Method to calculate nilai index
  public double nilaiIndex() {
    // Perform calculations based on indexNilai and return the result
    // You need to implement this method based on the calculation logic for indexNilai
    // For demonstration purposes, let's assume indexNilai 'A' represents 4.0, 'B' represents 3.0, etc.
    switch (indexNilai) {
      case "A":
        return 4.0;
      case "B":
        return 3.0;
      case "C":
        return 2.0;
      case "D":
        return 1.0;
      case "E":
        return 0.0;
      default:
        return -1.0; // Invalid indexNilai
    }
  }

  public String display() {
    StringBuilder sb = new StringBuilder();
    sb.append("Kode: ").append(kode).append("\n");
    sb.append("Nama: ").append(nama).append("\n");
    sb.append("SKS: ").append(sks).append("\n");
    sb.append("Index Nilai: ").append(indexNilai).append("\n");
    sb.append("Nilai Index: ").append(nilaiIndex()).append("\n");
    return sb.toString();
}



}

public class TranskripNilaiMain {


    public static void main(String[] args) {

    Matakuliah mk1 = new Matakuliah("001", "algoritma pemrograman 1", "A", 3);
    Matakuliah mk2 = new Matakuliah("002", "algoritma pemrograman 2", "BC", 3);
    Matakuliah mk3 = new Matakuliah("002", "pemrograman berorientasi objek", "B", 4);
    
    kartuHasilStudi khs = new kartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Create object for Mahasiswa
        Mahasiswa mhs = new Mahasiswa("223040077","azhar");

        // Create object for TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);// Hitung IPK setelah menambahkan KHS
        transkrip.hitungIPK(); 
        transkrip.display();
    }


  }


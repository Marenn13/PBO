

package utspbo;


public class MainClass {
    public static void main(String[] args) {
     //(String Nama, int jmlKamar, int jmlDokter, int jumObat)
        System.out.println("=== HOSPYTAL ===");
        RumahSakit RS = new RumahSakit ("xft",100,30,500);
        System.out.println("Nama Rs        :"+RS.getNama());
        System.out.println("Jumlah Kamar   :"+ RS.getJmlKamar());
        System.out.println("Jumlah Dokter  :"+RS.getJmlDokter());
        System.out.println("Jumlah Obat    :"+ RS.getJumObat());
        
        System.out.println();
      
      
      Pasien [] daftarPasien=new Pasien [2];
      daftarPasien[0]=new Pasien ("Lengkara","perempuan",19, "jln. raja wali", "Demam", 100000,20000);
       
      daftarPasien[1]=new Pasien ("Masnaka","Laki-laki",19, "jln. garuda" , "Flu" ,80000,100000);
      RS.setdaftarPasien(daftarPasien);
      
      
      Dokter []daftarDokter=new Dokter [2];
      daftarDokter[0]=new Dokter ("Dr. kristin", "Dr. Gigi", "Senin-Rabu");
      daftarDokter[1]=new Dokter ("Dr. Budy", "Dr. Umum", "Kamis-Sabtu");
      RS.setdaftarDokter(daftarDokter);
      
      Obat []daftarObat=new Obat[2];
      daftarObat[0]=new Obat ("procold",500, "500 mg",200000);
      daftarObat [1]=new Obat ("paramex",400, "500 mg",300000);
      RS.setdaftarObat(daftarObat);
      
      
      
      Pasien []pasienRS= RS.getdaftarPasien();
        for (Pasien P : pasienRS){
          System.out.println("=== Daftar Pasien ===");
          System.out.println("Nama Pasien    :"+ P.getNama());
          System.out.println("Umur Pasien    :"+ P.getUmur());
          System.out.println("Jenis Kelamin  :"+ P.getJk());
          System.out.println("Alamat         :"+ P.getAlamat());
          System.out.println("Diagnosa       :"+ P.getDiagnosa());
          System.out.println("Total Biaya    :"+ P.getBiayaPengobatanPasien());
          System.out.println();
        }
          
          
        Dokter []DokterRS= RS.getdaftarDokter();
         for (Dokter D : DokterRS){
             System.out.println("=== Daftar Dokter ===");
              System.out.println("Nama Dokter  :"+ D.getNama());
              System.out.println("Spesialis    :"+ D.getSpesialis());
              System.out.println("Jadwal Kerja :"+ D.getJadwal());
              System.out.println();
         }
         Obat[]ObatRS=RS.getdaftarObat();
         for (Obat O:ObatRS){
             System.out.println("=== Daftar Obat ===");
             System.out.println("Nama Obat   :"+ O.getNamaObat());
             System.out.println("Jumlah Stok :"+ O.getStok());
             System.out.println("Dosis       :"+ O.getDosis());
             System.out.println();
         }
         
        
//       System.out.println("Daftar Pasien:");
//        for (int i = 0; i < daftarPasien.length; i++) {
//            if (daftarPasien[i] != null) {
//                System.out.println(daftarPasien[i].getNama() + ":" + daftarPasien[i].getJk() + ":" + daftarPasien [i].getDiagnosa()+ ":" + daftarPasien[i].getAlamat());
//                System.out.println();
//            }
//        }
//
//        System.out.println("Daftar Obat:");
//        for (int i = 0; i < daftarObat.length; i++) {
//            if (daftarObat[i] != null) {
//                System.out.println(daftarObat[i].getNamaObat() + " - " + daftarObat[i].getDosis() + ":" + daftarObat[i].getStok() + " buah");
//                System.out.println();
//            }
//        }
//
//        System.out.println("Daftar Tenaga Medis:");
//        for (int i = 0; i < daftarDokter.length; i++) {
//            if (daftarDokter[i] != null) {
//                System.out.println( daftarDokter[i].getNama() + ":" + daftarDokter[i].getSpesialis() +":"+ daftarDokter[i].getJadwal());
//                System.out.println();

 }
      
      
        
    }
    




    


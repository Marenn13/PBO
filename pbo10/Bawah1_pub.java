
package pbo10;


public class Bawah1_pub extends Atas_pub {
    public void cetak1(){
        System.out.println("Ada di kelas Bawah..");
    }
    public void cetak2 (){
        System.out.println("Ada di class Bawah..");
        System.out.println("i ="+i);
    }
    public static void main(String[] args) {
        Bawah1_pub bwh = new Bawah1_pub ();
        bwh.cetak1();
        bwh.cetak2();
    }
    
    
}

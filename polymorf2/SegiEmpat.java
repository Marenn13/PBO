

package Bangundatar;

public class SegiEmpat extends BangunDatar {
    private double panjang;
    private double lebar;

    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    @Override
    public double HitKel() {
        return 2 * (panjang + lebar);
    }
    @Override
    public double HitLuas() {
        return panjang * lebar;
       
    }
    
    
    
}

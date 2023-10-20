package Bangundatar;
public class Lingkaran extends BangunDatar {
    private double r;
    private double Phi;
    public double getPhi() {
        return Phi;
    }
    public void setPhi(double Phi) {
        this.Phi = Phi;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double HitKel() {
        return 2 * Math.PI * r;
    }
    @Override
    public double HitLuas() {
        return Math.PI * r * r;
     
    }

}

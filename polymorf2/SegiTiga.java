
package Bangundatar;
public class SegiTiga extends BangunDatar{
    private double sisi1, sisi2, sisi3;
   
    public double getSisi1() {
        return sisi1;
    }
    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }
    public double getSisi2() {
        return sisi2;
    }
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }
    public double getSisi3() {
        return sisi3;
    }
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
     @Override
    public double HitKel() {
        return sisi1 + sisi2 + sisi3;
    }
    @Override
    public double HitLuas() {
      double   s = (sisi1 + sisi2 + sisi3)/ 2;
      return Math.sqrt (s * (s - sisi1) *s * (s - sisi2) * (s - sisi3));
      
    }
    
}

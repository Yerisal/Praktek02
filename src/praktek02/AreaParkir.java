package praktek02;

public class AreaParkir {
    double panjang;
    double lebar;

    public AreaParkir() {
        panjang = 10;
        lebar = 20;
    }

    public AreaParkir(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
       
    void cetakInfo(){
        System.out.println("============================");
        System.out.println("Panjang             : "+panjang);
        System.out.println("Lebar               : "+lebar);
        System.out.println("============================");
    }
    
    double hitungLuas(){
        double luas;
        luas = panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya Adalah      : "+hitungLuas());
    }
}

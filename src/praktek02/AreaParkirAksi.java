package praktek02;

public class AreaParkirAksi {
    public static void main(String[] args) {
        AreaParkir ap1 = new AreaParkir();
        
        ap1.panjang = 15;
        ap1.lebar = 30;
        
        ap1.cetakInfo();
        System.out.println("Luas Area Parkir    : "+ap1.hitungLuas());
    }
}

package head.first;

/**
 * Created by wib_ on 2/3/2017.
 */
public class Arithmat {
    public static void main(String[] args) {
        Square persegi;
        float hasilLuas;
        float hasilKeliling;
        float panjang = 4;
        float lebar = 3;

        persegi = new Square();

        hasilKeliling = persegi.hitungKeliling(panjang, lebar);
        hasilLuas = persegi.hitungLuas(panjang, lebar);

        System.out.println(hasilKeliling);
        System.out.println(hasilLuas);
    }
}

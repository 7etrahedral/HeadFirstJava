package head.first;

/**
 * Created by wib_ on 2/3/2017.
 */
public class Square {
    float luas;
    float keliling;

    public float hitungLuas (float p, float l) {
        luas = p * l;
        return luas;
    }

    public float hitungKeliling (float p, float l) {
        keliling = 2 * (p *l);
        return keliling;
    }

}

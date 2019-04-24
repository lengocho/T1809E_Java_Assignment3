public class Main_Fraction {
    public static void main(String[] args) {
        Fraction phanSo_1 = new Fraction(4,8);
        Fraction phanSo_2 = new Fraction(3,9);
        phanSo_1.rutGonPhanSo();
        phanSo_2.rutGonPhanSo();
        phanSo_1.add(phanSo_2);
        phanSo_1.sub(phanSo_2);
        phanSo_1.mul(phanSo_2);
        phanSo_1.div(phanSo_2);
    }
}

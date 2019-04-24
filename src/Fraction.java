public class Fraction {
    public int tuSo, mauSo;
    public int PhanSo;
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public Fraction (int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void nhapPhanso (){
            getTuSo();
            getMauSo();
    }
    public void inPhanSo() {
        System.out.println("Phân số đó là: " + tuSo + "/" + mauSo);
    }
    public int UCLN (int a, int b){
        while (a != b){
            if (a > b) {
                a -=b;
            } else {
                b -=a;
            }
        }
        return a;
    }
    public void rutGonPhanSo (){
        int i = UCLN(this.getTuSo(),this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
    public void nghichDaoPhanSo (){
        int k = getTuSo();
        this.setTuSo(this.getMauSo());
        this.setMauSo(this.getTuSo());
        System.out.println("Nghich dao phan so la: " + getTuSo() + "/" + k);
    }
    public void add(Fraction ps){
        int tu = this.tuSo * ps.getMauSo() + ps.tuSo * this.getMauSo();
        int mau= this.mauSo * ps.getMauSo();
        Fraction tong2Phanso = new Fraction(tu,mau);
        tong2Phanso.rutGonPhanSo();
        System.out.println("Tong 2 phan so la: " + tong2Phanso.tuSo + "/" + tong2Phanso.mauSo);
    }
    public void sub(Fraction ps){
        int tu = this.tuSo * ps.getMauSo() - ps.tuSo * this.getMauSo();
        int mau= this.mauSo * ps.getMauSo();
        Fraction hieu2Phanso = new Fraction(tu,mau);
        hieu2Phanso.rutGonPhanSo();
        System.out.println("Hieu 2 phan so la: " + hieu2Phanso.tuSo + "/" + hieu2Phanso.mauSo);
    }
    public void mul(Fraction ps){
        int tu = this.tuSo * ps.getTuSo();
        int mau= this.mauSo * ps.getMauSo();
        Fraction tich2Phanso = new Fraction(tu,mau);
        tich2Phanso.rutGonPhanSo();
        System.out.println("Tich 2 phan so la: " + tich2Phanso.tuSo + "/" + tich2Phanso.mauSo);
    }
    public void div(Fraction ps){
        int tu = this.tuSo * ps.getMauSo();
        int mau= this.mauSo * ps.getTuSo();
        Fraction chia2Phanso = new Fraction(tu,mau);
        chia2Phanso.rutGonPhanSo();
        System.out.println("Chia 2 phan so la: " + chia2Phanso.tuSo + "/" + chia2Phanso.mauSo);
    }
}

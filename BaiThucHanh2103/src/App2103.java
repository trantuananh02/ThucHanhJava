public class App2103 {
    public static void main(String[] args) {
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhapHCN();
        HCN.chuViHCN();
        HCN.dienTichHCN();

        Person ps = new Person();
        ps.set();
        System.out.println("cac thong tin ban nhap la: ");
        ps.get();
    
        Sinhvien sv = new Sinhvien();
        sv.nhapSV();
        sv.laySV();

        pTB2 pt = new pTB2();
        pt.nhapPT2();
        pt.inPT2();
}
}
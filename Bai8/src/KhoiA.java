public class KhoiA extends Thisinh{
    public static final String TOAN = "Toán";
    public static final String lY = "Lý";
    public static final String HOA = "Hóa";

    public KhoiA() {}

    public KhoiA(String hoTen, String diaChi, String sbd, String dienUuTien) {
        super(hoTen, diaChi, sbd, dienUuTien);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Khối A }";
    }

}

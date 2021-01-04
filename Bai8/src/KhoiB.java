public class KhoiB extends Thisinh{
    public static final String TOAN = "Toán";
    public static final String SINH = "Sinh";
    public static final String HOA = "Hóa";

    public KhoiB() {}

    public KhoiB(String hoTen, String diaChi, String sbd, String dienUuTien) {
        super(hoTen, diaChi, sbd, dienUuTien);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Khối B }";
    }
}

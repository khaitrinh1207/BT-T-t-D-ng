public class KhoiC extends Thisinh{
    public static final String VAN = "Văn";
    public static final String SU = "Sử";
    public static final String DIA = "Địa";

    public KhoiC() {}

    public KhoiC(String hoTen, String diaChi, String sbd, String dienUuTien) {
        super(hoTen, diaChi, sbd, dienUuTien);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Khối C }";
    }
}

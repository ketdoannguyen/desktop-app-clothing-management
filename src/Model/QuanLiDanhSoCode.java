package Model;

public class QuanLiDanhSoCode {
	private String LoaiHang;
	private String MaMatHang;
	private String MaMatHan;
        private String GioiTinh;
	private String Size;
	private String Mau;
        private String NoiSanXuat;
	private int SoLuongNhap;
        private int STT;
	private int SoLuongBan;
	private int SoLuongCon;
	private int GiaNhap;
	private int GiaBan;
	private long TienVon;
        private long TienBan;
	private long TienLoi;
        private String ThoiGian;

	public String getLoaiHang() {
		return LoaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		this.LoaiHang = loaiHang;
	}
	public String getMaMatHang() {
		return MaMatHang;
	}
	public void setMaMatHang(String maMatHang) {
		this.MaMatHang = maMatHang;
	}
        public String getNoiSanXuat() {
		return NoiSanXuat;
	}
	public void setNoiSanXuat(String a) {
		this.NoiSanXuat = a;
	}
        public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String a) {
		this.GioiTinh = a;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		this.Size = size;
	}
	public String getMau() {
		return Mau;
	}
        public void setThoiGian(String a) {
		this.ThoiGian = a;
	}
	public String getThoiGian() {
		return ThoiGian;
	}
	public void setMau(String mau) {
		this.Mau = mau;
	}
	public int getSoLuongNhap() {
		return SoLuongNhap;
	}
	public void setSoLuongNhap(int soLuongNhap) {
		this.SoLuongNhap = soLuongNhap;
	}
        
        public int getSTT() {
		return STT;
	}
	public void setSTT(int STT) {
		this.STT = STT;
	}
	public int getSoLuongBan() {
		return SoLuongBan;
	}
	public void setSoLuongBan(int soLuongBan) {
		this.SoLuongBan = soLuongBan;
	}
        public void setSoLuongCon(int a) {
		this.SoLuongCon = a;
	}
	public int getSoLuongCon() {
		return SoLuongCon ;
	}

	public int getGiaNhap() {
		return GiaNhap;
	}
	public void setGiaNhap(int giaNhap) {
		this.GiaNhap = giaNhap;
	}
	public int getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(int giaBan) {
		this.GiaBan = giaBan;
	}
        
	public long getTienVon() {
		return GiaNhap*SoLuongNhap;
	}
        public long getTienBan() {
		return GiaBan*SoLuongBan;
	}
	public long getTienLoi() {
		return (GiaBan-GiaNhap)*SoLuongBan ;
	}
	
	public long getTongTien() {
		return GiaBan*SoLuongNhap ;
        }
	
}


package Model;


public class BanHangCode {
        private int STT ;
        private int LanBan ;
        private String LoaiHang ;
        private String MaMatHang ;
        private int GiaBan ;
        private int SoLuongBan ;
        private String ThoiGianBan ;
        private long TienBan ;
        private int GiamGia ;
        private long TienPhaiTra ;
        private String TheKhachHang ;

        public int getSTT() {
            return STT;
        }
        public void setSTT(int sTT) {
            STT = sTT;
        }
	public int getLanBan() {
		return LanBan;
	}
	public void setLanBan(int lanBan) {
		LanBan = lanBan;
	}
	public String getLoaiHang() {
		return LoaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		LoaiHang = loaiHang;
	}
	public String getMaMatHang() {
		return MaMatHang;
	}
	public void setMaMatHang(String maMatHang) {
		MaMatHang = maMatHang;
	}
	public int getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}
	public int getSoLuongBan() {
		return SoLuongBan;
	}
	public void setSoLuongBan(int soLuongBan) {
		SoLuongBan = soLuongBan;
	}
	public String getThoiGianBan() {
		return ThoiGianBan;
	}
	public void setThoiGianBan(String thoiGianBan) {
		ThoiGianBan = thoiGianBan;
	}
	public long getTienBan() {
		return SoLuongBan*GiaBan ;
	}
        public int getGiamGia() {
		return GiamGia;
	}
	public void setGiamGia(int giamGia) {
		GiamGia = giamGia;
	}
        public void setTienPhaiTra(long a) {
            TienPhaiTra = a ;
        }
        public long getTienPhaiTra() {
		return TienPhaiTra ;
        }
        public String getTheKhachHang() {
		return TheKhachHang;
	}
	public void setTheKhachHang(String theKhachHang) {
		TheKhachHang = theKhachHang;
	}
       
}

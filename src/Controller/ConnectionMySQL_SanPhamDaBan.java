package Controller;

import java.sql.*;
import java.util.ArrayList;
import Model.BanHangCode;
public class ConnectionMySQL_SanPhamDaBan extends ClassConnection_KhoHang{
    private Connection conn ;
    private ArrayList<BanHangCode> list;
    public ConnectionMySQL_SanPhamDaBan(){
        conn = super.Connection();
    }
    public ArrayList<BanHangCode> getListThongTinDonHangBan(){
        ArrayList<BanHangCode> list = new ArrayList<BanHangCode>();
        list.clear();
        String sql = "SELECT * FROM banhang ; ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BanHangCode x = new BanHangCode();
                x.setLanBan(rs.getInt("LanBan"));
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setThoiGianBan(rs.getString("ThoiGianBan"));
                x.setGiamGia(rs.getInt("GiamGia"));
                x.setTienPhaiTra(rs.getInt("TienPhaiTra"));
                x.setTheKhachHang(rs.getString("TheKhachHang"));
                
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    public boolean addQuanLi(BanHangCode x) throws SQLException{
        String sql = "INSERT INTO banhang(LanBan,LoaiHang,MaMatHang,GiaBan,SoLuongBan,ThoiGianBan,TienBan,GiamGia,TienPhaiTra,TheKhachHang) VALUES(?,?,?,?,?,?,?,?,?,?) ;";
        PreparedStatement ps = conn.prepareStatement(sql);
        int t = 0;
        
        ps.setInt(1,x.getLanBan());
        ps.setString(2,x.getLoaiHang());
        ps.setString(3,x.getMaMatHang());
        ps.setInt(4,x.getGiaBan());
        ps.setInt(5,x.getSoLuongBan());
        ps.setString(6,x.getThoiGianBan());
        ps.setInt(7,Integer.parseInt(x.getTienBan()+""));
        ps.setInt(8,x.getGiamGia());
        ps.setInt(9,Integer.parseInt(x.getTienBan()+""));
        ps.setString(10,x.getTheKhachHang());
        
        return ps.executeUpdate() > 0 ;
    }
    public ArrayList<BanHangCode> getListBanHang(){
        ArrayList<BanHangCode> list = new ArrayList<BanHangCode>();
        list.clear();
        String sql = "SELECT * FROM banhang ;";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BanHangCode x = new BanHangCode();
                x.setLanBan(rs.getInt("LanBan"));
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setThoiGianBan(rs.getString("ThoiGianBan"));
                x.setGiamGia(rs.getInt("GiamGia"));
                x.setTheKhachHang(rs.getString("TheKhachHang"));
                
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    public boolean DeleteQuanLi(int k) throws SQLException{
        String sql = "DELETE FROM banhang WHERE (LanBan = '"+k+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean DeleteDonHangLoi() throws SQLException{
        String sql = "DELETE FROM banhang WHERE (GiamGia = 0);";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean DeleteThanhPhanGioHang(BanHangCode x) throws SQLException{
        String sql = "DELETE FROM banhang WHERE (ThoiGianBan = '"+x.getThoiGianBan()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean SoLuongBanGioHang(BanHangCode x,int k) throws SQLException{
        String sql = "UPDATE banhang SET SoLuongBan = "+k+" , TienBan = "+(x.getGiaBan()*k)+" WHERE (ThoiGianBan = '"+x.getThoiGianBan()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
        
    }
   
    public boolean LuuTruThongTinCuoi(BanHangCode x) throws SQLException{
        String sql = "UPDATE banhang SET GiamGia = "+x.getGiamGia()+" , TienPhaiTra = "+x.getTienPhaiTra()+" WHERE (ThoiGianBan = '"+x.getThoiGianBan()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean TienPhaiTra(BanHangCode x) throws SQLException{
        String sql = "UPDATE banhang SET TienPhaiTra = "+x.getTienPhaiTra()+" WHERE (ThoiGianBan = '"+x.getThoiGianBan()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        return ps.executeUpdate() > 0 ;
    }
}

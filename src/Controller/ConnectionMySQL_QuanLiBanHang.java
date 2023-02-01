
package Controller;

import java.sql.*;
import java.util.ArrayList;
import Model.QuanLiDanhSoCode;

public class ConnectionMySQL_QuanLiBanHang extends ClassConnection_KhoHang{
    private Connection conn ;
    public ConnectionMySQL_QuanLiBanHang(){
        conn = super.Connection();
    }
    public boolean Edit(QuanLiDanhSoCode x) throws SQLException{
        String sql = "UPDATE bangthongtin SET  SoLuongCon = SoLuongCon - "+x.getSoLuongBan()+" , SoLuongBan = SoLuongBan + "
                +x.getSoLuongBan()+" , TienBan = TienBan + "+x.getTienBan()+" WHERE MaMatHang = '"+x.getMaMatHang()+"' ; ";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public ArrayList<QuanLiDanhSoCode> LocListBanHang(String a, String b){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin WHERE "+a+" LIKE '%"+b+"%'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
     }
    public ArrayList<QuanLiDanhSoCode> LocListSoBanHang(String a, String b){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin WHERE "+a+" "+b;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
     }
    public ArrayList<QuanLiDanhSoCode> getListBanHang(){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin ORDER BY STT ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    
    }
    
    public ArrayList<QuanLiDanhSoCode> DaBanListBanHang(){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin WHERE SoLuongBan > 0 ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
     }
     
     public ArrayList<QuanLiDanhSoCode> ChuaBanListBanHang(){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin WHERE SoLuongNhap = SoLuongCon  ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
     }
     
     public ArrayList<QuanLiDanhSoCode> DaHetListBanHang(){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin WHERE SoLuongCon = 0";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                x.setSoLuongBan(rs.getInt("SoLuongBan"));
                x.setSoLuongCon(rs.getInt("SoLuongCon"));
                x.setGiaNhap(rs.getInt("GiaNhap"));
                x.setGiaBan(rs.getInt("GiaBan"));
                x.setThoiGian(rs.getString("ThoiGian"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
     }

    
}

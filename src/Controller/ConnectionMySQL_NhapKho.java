package Controller;
import java.sql.*;
import java.util.ArrayList;
import Model.QuanLiDanhSoCode;
        
public class ConnectionMySQL_NhapKho extends ClassConnection_KhoHang{
    private Connection conn ;
    private ArrayList<QuanLiDanhSoCode> list;
    
    //Ket Noi vs Co So Du Lieu
    public ConnectionMySQL_NhapKho(){
        conn = super.Connection();
    }
    
    
    public ArrayList<QuanLiDanhSoCode> getListQuanLy(){
        ArrayList<QuanLiDanhSoCode> list = new ArrayList<QuanLiDanhSoCode>();
        list.clear();
        String sql = "SELECT * FROM bangthongtin ORDER BY STT";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setSTT(rs.getInt("STT"));
                x.setLoaiHang(rs.getString("LoaiHang"));
                x.setMaMatHang(rs.getString("MaMatHang"));
                x.setGioiTinh(rs.getString("GioiTinh"));
                x.setSize(rs.getString("Size"));
                x.setMau(rs.getString("Mau"));
                x.setNoiSanXuat(rs.getString("NoiSanXuat"));
                x.setSoLuongNhap(rs.getInt("SoLuongNhap"));
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
    int t;
    public boolean addQuanLi(QuanLiDanhSoCode x) throws SQLException{
        String sql = "INSERT INTO bangthongtin(STT,LoaiHang,MaMatHang,GioiTinh,Size,Mau,NoiSanXuat,SoLuongNhap,SoLuongBan,SoLuongCon,"
                + "GiaNhap,GiaBan,TienVon,TienBan,TienLoi,ThoiGian) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ;";
        PreparedStatement ps = conn.prepareStatement(sql);
        int t = 0;
        
        
        list = getListQuanLy();
        int max = 0;
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode ql = list.get(i);
            if(max < ql.getSTT())
                max = ql.getSTT() ;
        }

        ps.setInt(1,max+1);
        ps.setString(2,x.getLoaiHang());
        ps.setString(3,x.getMaMatHang());
        ps.setString(4,x.getGioiTinh());
        ps.setString(5,x.getSize());
        ps.setString(6,x.getMau());
        ps.setString(7,x.getNoiSanXuat());
        ps.setInt(8,x.getSoLuongNhap());
        ps.setInt(9,t);
        ps.setInt(10,x.getSoLuongNhap());
        ps.setInt(11,x.getGiaNhap());
        ps.setInt(12,x.getGiaBan());
        ps.setInt(13,Integer.parseInt(x.getTienVon()+""));
        ps.setInt(14,Integer.parseInt(x.getTienBan()+""));
        ps.setInt(15,Integer.parseInt(x.getTienLoi()+""));
        ps.setString(16,x.getThoiGian());
        return ps.executeUpdate() > 0 ;
    }
    
    public boolean EditQuanLi(QuanLiDanhSoCode x) throws SQLException{
        String sql = "UPDATE bangthongtin SET LoaiHang = '"+x.getLoaiHang()
                 + "' , GioiTinh = '"+x.getGioiTinh()
                 + "' , Size = '"+x.getSize()
                + "' , Mau = '"+x.getMau()
                + "' , NoiSanXuat = '"+x.getNoiSanXuat()
                + "' , SoLuongNhap = '"+x.getSoLuongNhap()
                + "' , GiaNhap = '"+x.getGiaNhap()
                + "' , GiaBan = '"+x.getGiaBan()
                + "' , TienVon = '"+x.getTienVon()
                + "' , TienBan = '"+x.getTienBan()
                + "' , TienLoi = '"+x.getTienLoi()
                + "' WHERE MaMatHang = '"+x.getMaMatHang()+"'  ; ";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean DeleteQuanLi(QuanLiDanhSoCode x) throws SQLException{
        String sql = "DELETE FROM bangthongtin WHERE (MaMatHang = '"+x.getMaMatHang()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public static void main(String[] args){
        new ConnectionMySQL_NhapKho();
    }
}

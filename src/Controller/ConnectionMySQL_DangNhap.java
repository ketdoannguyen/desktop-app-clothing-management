package Controller;

import java.sql.*;
import java.util.ArrayList;
import Model.DangNhapCode;

public class ConnectionMySQL_DangNhap extends ClassConnection_DangNhap{
    private Connection conn ; 
    public ConnectionMySQL_DangNhap(){
        conn = super.Connection();
    }
    
    public boolean addDangNhap(DangNhapCode x) throws SQLException{
        String sql = "INSERT INTO bangdangnhap(TenDangNhap,MatKhau) VALUES(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,x.getTenDangNhap());
        ps.setString(2,x.getMatKhau());
        return ps.executeUpdate() > 0 ;
    }
    
    public ArrayList<DangNhapCode> getListDangNhap(){
        ArrayList<DangNhapCode> list = new ArrayList<DangNhapCode>();
        list.clear();
        String sql = "SELECT * FROM bangdangnhap";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DangNhapCode x = new DangNhapCode();
                x.setTenDangNhap(rs.getString("TenDangNhap"));
                x.setMatKhau(rs.getString("MatKhau"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    
     public static void main(String[] args){
        new ConnectionMySQL_DangNhap();
    }
}

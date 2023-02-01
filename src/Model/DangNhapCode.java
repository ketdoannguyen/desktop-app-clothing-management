package Model;

public class DangNhapCode {
    private String TenDangNhap ;
    private String MatKhau ;
    
    public DangNhapCode(){}
    public DangNhapCode(String a, String b){
        TenDangNhap = a ;
        MatKhau = b ;
    }
    
    public void setTenDangNhap(String a){
        TenDangNhap = a ;
    }
    public String getTenDangNhap(){
        return TenDangNhap ;
    }
    public void setMatKhau(String a){
        MatKhau = a ;
    }
    public String getMatKhau(){
        return MatKhau ;
    }
}

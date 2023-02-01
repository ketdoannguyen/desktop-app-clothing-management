
package Time;

import java.util.Calendar ;
import java.util.Date; 

public class TimePlay {
    private int second ;
    private int minute ;
    private int hour ;
    private int ngay ;
    private int nam ;
    private int thang ;
    public String time ;
    
    boolean So(char a) {
		if(a>=48 && a<=57)
			return true;
		return false;
	}
	int Chuyen(char a,char b) {
		String s1= String.valueOf(a);
		String s2= String.valueOf(b);
		String s = s1.concat(s2);
		int t = Integer.parseInt(s);
		return t;
	}
	public String TimeNow() {
		Calendar t = Calendar.getInstance() ; 
		Date date = t.getTime() ;
		String a = String.valueOf(date);
		char[] ch = a.toCharArray() ;
		for(int i=0 ; i<ch.length ; i++) {
			if(So(ch[i])==true && So(ch[i+1])==true && ch[i+2] == ':')
			{
				second  = Chuyen(ch[i],ch[i+1]);
				minute = Chuyen(ch[i+3],ch[i+4]);
				hour = Chuyen(ch[i+6],ch[i+7]);
				break;
			}
                        if(So(ch[i+1])==true && So(ch[i+2])==true && ch[i] ==' '&&ch[i+3] ==' '){
                                ngay = Chuyen(ch[i+1],ch[i+2]);
                        }
                        Thang(ch[i],ch[i+1],ch[i+2]);
		}
                String s1= String.valueOf(ch[ch.length-4]);
		String s2= String.valueOf(ch[ch.length-3]);
                String s3= String.valueOf(ch[ch.length-2]);
                String s4= String.valueOf(ch[ch.length-1]);
		String s = s1 + "" + s2 + "" +s3 + "" + s4 ;
		nam = Integer.parseInt(s);
                String thoigian = second+":"+minute+":"+hour+" "+ngay+"/"+thang+"/"+nam ;
                return thoigian ;
	}
        void Thang(char a,char b,char c){
            if(a == 'J' && b == 'a' && c == 'n')
                thang = 1;
            if(a == 'F' && b == 'e' && c == 'b')
                thang = 2;
            if(a == 'M' && b == 'a' && c == 'r')
                thang = 3;
            if(a == 'A' && b == 'p' && c == 'r')
                thang = 4;
            if(a == 'M' && b == 'a' && c == 'y')
                thang = 5;
            if(a == 'J' && b == 'u' && c == 'n')
                thang = 6;
            if(a == 'J' && b == 'u' && c == 'l')
                thang = 7;
            if(a == 'A' && b == 'u' && c == 'g')
                thang = 8;
            if(a == 'S' && b == 'e' && c == 'p')
                thang = 9;
            if(a == 'O' && b == 'c' && c == 't')
                thang = 10;
            if(a == 'N' && b == 'o' && c == 'v')
                thang = 11;
             if(a == 'D' && b == 'e' && c == 'c')
                thang = 12;
        }
    
    public static void main(String[] args){
        TimePlay x = new TimePlay() ;
        System.out.print(""+x.TimeNow());
    }
}

package btvn_class;

import java.util.Scanner;

public class Thongtin { 
	
	String hoten;
	String sex;
	int age;
	String tenchuyen;
	int time;
	String loaive;
	int soluong;
	
	Thongtin(String hoten,String sex,int age,String tenchuyen,int time,String loaive,int soluong)
	{
		this.hoten=hoten;
		this.sex=sex;
		this.age=age;
		this.tenchuyen=tenchuyen;
		this.time=time;
		this.loaive=loaive;
		this.soluong=soluong;
	}
	Thongtin()
	{
		hoten="";
		sex="";
		age=0;
		tenchuyen="";
		time=0;
		loaive="";
		soluong=0;
	}
	public void nhap() {
		Scanner scan=new Scanner(System.in);
		System.out.println("nhập tên khách hàng");
		hoten = scan.nextLine();
		
		System.out.println("Giới tính");
		sex = scan.nextLine();
			
		System.out.println("Tên chuyến bay");
		tenchuyen = scan.nextLine();
		
		System.out.println("Tuổi");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Thời gian bay");
		time = scan.nextInt();
		scan.nextLine();
		System.out.println("Số lượng vé");
		soluong = scan.nextInt();
		scan.nextLine();
		System.out.println("Loại vé");
		loaive = scan.nextLine();
	}
	
	public float tinhtien() {
		float tien=0;
		if(loaive=="trung cấp" && age <6)
		{
			tien =soluong*2000*4/5;
		}
		else if(time >4&&time<20)
		 {
			 if(loaive.compareTo("trung cấp")==0)
			 {
				 tien=soluong*2000*1/2;
			 }
			 else if(loaive.compareTo("cao cấp")==0)
			 {
				 tien=soluong*10000*1/2;
			 }
			 else if(loaive.compareTo("thương gia")==0)
			 {
				 tien=soluong*5000*1/2;
			 }
		 }
			 else if(loaive.compareTo("cao cấp")==0)
			 {
				 tien=soluong*10000;
			 }
			 else if(loaive.compareTo("thương gia")==0)
			 {
				 tien=soluong*5000;
			 }
			 else if(loaive.compareTo("trung cấp")==0)
			 {
				 tien=soluong*2000;
			 }
				 
		  
		return tien;
	}
	public void xuat()
	{
		float z=tinhtien();
		System.out.println(" họ tên khách hàng: "+hoten+" tuổi: "+age+" tên chuyến bay: "+tenchuyen+" thời gian bay: "+time+" loại ve mua: "+loaive+" số lương mua: "+soluong+" số tiền phải trả: "+z);
	}
}

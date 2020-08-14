package btvn_class;

import java.util.Scanner;

public class Thanhtoan {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("nhập số người mua vé");
		int n=scan.nextInt();
		
		Thongtin khach[]=new Thongtin[n];

		float tong=0;
		for(int i=0;i<n;i++)
		{
			khach[i]=new Thongtin();
			khach[i].nhap();
			khach[i].xuat();
			tong+=khach[i].tinhtien();
		}
		System.out.println("tổng số tiền thu đuọc là"+tong);
	}

}

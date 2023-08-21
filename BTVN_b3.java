import java.util.*;
public class btvn_b3 {

	public static void main(String[] args) {
//	//	bai 1
//		  Scanner s= new Scanner(System.in);
//	        System.out.print("Nhap so phan tu mang n : ");
//	        int n = s.nextInt();
//	        int [] a = new int[n];
//	        for(int i=0;i<n;i++)
//	        {
//	            System.out.print("a["+i+"] = ");
//	            a[i]=s.nextInt();
//	        }
//	        int dem = 0;
//	        for(int i=0;i<n;i++)
//	        {
//	           for(int j=0;j<n;j++)
//	           {
//	            if(a[i]==a[j])
//	            dem++;
//	           }
//	           System.out.println(a[i] + " xuat hien "+dem+" lan");
//	           dem=0;
//	        }
//		bai 2
//		 Scanner s= new Scanner(System.in);
//	        System.out.print("Nhap so phan tu mang n : ");
//	        int n = s.nextInt();
//	        int [] a = new int[n];
//	        int [] b = new int[n+1];
//	        int [] c = new int[n-1];
//	        for(int i=0;i<n;i++)
//	        {
//	            System.out.print("a["+i+"] = ");
//	            a[i]=s.nextInt();
//	        }
//	        System.out.print("Nhap vi tri : ");
//	        int vt = s.nextInt();
//	        if(vt<=0 || vt>n)
//	        {
//	            System.out.print("Vi tri nhap khong hop le !");
//	        }
//	        else{
//	        System.out.print("Nhap 1 de them , nhap 2 de xoa ! : ");
//	        int x=s.nextInt();
//	        if(x==1)
//	        {
//	            System.out.print("Nhap gia tri phan tu moi : ");
//	            int gt = s.nextInt();
//	            for(int i=0;i<=n;i++)
//	            {
//	               if(i<(vt-1))
//	               {
//	                b[i]=a[i];
//	               } 
//	               if(i==(vt-1))
//	               {
//	                b[i]=gt;
//	               }
//	               if(i>(vt-1))
//	               {
//	                b[i]=a[i-1];
//	               }
//	            }
//	            System.out.println("Ket qua : ");
//	            for(int xuat : b)
//	            {
//	            System.out.print(xuat + " ");
//	            }
//	        }
//	        if(x==2)
//	        {
//	            for(int i=0;i<(n-1);i++)
//	            {
//	                if(i<(vt-1))
//	                {
//	                    c[i]=a[i];
//	                }
//	                if(i>=(vt-1))
//	                {
//	                    c[i]=a[i+1];
//	                }
//	            }
//	            System.out.print("Ket qua : ");
//	            for(int xuat : c)
//	            {
//	            System.out.print(xuat + " ");
//	            }
//	        }
//	        else{
//	            System.out.print("Sai cu phap ! ");
//	        }
//	    }
//		bai 3 
//		 Scanner s= new Scanner(System.in);
//		    System.out.print("Nhap so luong phan tu : ");
//		    int n= s.nextInt();
//		    int [] a=new int[n];
//		    for(int i=0;i<n;i++)
//		    {
//		        System.out.print("a["+i+"] = ");
//		        a[i]=s.nextInt();
//		    }
//		    System.out.print("mang vua nhap la : ");
//		    for(int i=0;i<n;i++)
//		    {
//		        System.out.print(a[i]+" ");
//		    }
//		    System.out.print("\nmang sau khi sap xep la : ");
//		    for(int i=0;i<n;i++)
//		    {
//		        for(int j=i+1;j<n;j++)
//		        {
//		            if(a[i]>a[j])
//		            {
//		                int b =a[i];
//		                a[i] = a[j];
//		                a[j]= b;
//		            }
//		        }
//		    }
//		     for(int i=0;i<n;i++)
//		    {
//		        System.out.print(a[i]+" ");
//		    }
		//bai 4
		 Scanner s= new Scanner(System.in);
        String a = s.nextLine();
        String b = new StringBuilder(a).reverse().toString();
        if(a.compareTo(b)==0)
        System.out.println("True");
        else
        System.out.println("False");
	}
}

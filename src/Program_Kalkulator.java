import java.util.Scanner;

public class Program_Kalkulator {
	static Scanner sc=new Scanner(System.in);
	static int pil;
	public static void main(String[] args) {
		title();
		menu();
		while(pil!=6){
			program();
		}
	}
	
	static void title(){
		System.out.println("\n\t\t\tSMART KALKULATOR\n\t\tby Syauqi Rahmat Sugara (133040249)\n");
	}
	static void menu(){
		System.out.println("Menu: ");
		System.out.println("1. Perkalian\t2. Pembagian\t3. Penjumlahan\t4. Pengurangan\t5. Perpangkatan\t  6. Keluar");
	}
	static void input_pil(){
		System.out.print("\nMasukkan Angka Pilihan Menu: ");
		pil=sc.nextInt();
	}
	static void program(){
		int a,b,c,i,hasilpangkat=1;
		float bagi;
		
		input_pil();
		
		switch(pil){
		case 1: 
			System.out.println("Perkalian");
			System.out.print("Bil 1: ");
			a=sc.nextInt();
			System.out.print("Bil 2: ");
			b=sc.nextInt();
			c=a*b;
			System.out.println("Hasil "+a+"*"+b+" = "+c);
			break;
		case 2:
			System.out.println("Pembagian");
			System.out.print("Bil 1: ");
			a=sc.nextInt();
			System.out.print("Bil 2: ");
			b=sc.nextInt();
			bagi=(float) a/b;
			System.out.println("Hasil "+a+"/"+b+" = "+bagi);
			break;
		case 3:
			System.out.println("Penjumlahan");
			System.out.print("Bil 1: ");
			a=sc.nextInt();
			System.out.print("Bil 2: ");
			b=sc.nextInt();
			c=a+b;
			System.out.println("Hasil "+a+"+"+b+" = "+c);
			break;
		case 4:
			System.out.println("Pengurangan");
			System.out.print("Bil 1: ");
			a=sc.nextInt();
			System.out.print("Bil 2: ");
			b=sc.nextInt();
			c=a-b;
			System.out.println("Hasil "+a+"-"+b+" = "+c);
			break;
		case 5:
			System.out.println("Perpangkatan");
			System.out.print("Bil: ");
			a=sc.nextInt();
			System.out.print("Pangkat: ");
			b=sc.nextInt();
			for(i=1;i<=b;i++){
				hasilpangkat=hasilpangkat*a;
			}
			System.out.println("Hasil "+a+" pangkat "+b+" = "+hasilpangkat);
			break;
		case 6:
			char out;
			System.out.print("Apakah anda yakin ingin keluar?\ny atau t : ");
			out=sc.findWithinHorizon(".",0).charAt(0);
			if(out=='y'){
				System.out.println("\nTerima Kasih telah menggunakan SMART KALKULATOR...\n"
						+ "by Syauqi Rahmat Sugara");
			}
			if(out=='t'){
				program( );
			}
			break;
		default:
			System.out.println("Ma'af angka yang anda masukkan salah");
			System.out.println("Silakan ulangi kembali !");
			break;
		}
		
	}
	
}

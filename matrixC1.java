import java.util.Scanner; 
class matrix{
	int a[][];
	int r,c;
	matrix(int x,int y){
		this.r=x;
		this.c=y;
	}
	void read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for rows and coloumns");
		for(int i=0;i<r;i++){
			for (int k=0;k<c;k++){
				a[i][k]=sc.nextInt();
			}
		}
	}
	void add(matrix m1,matrix m2){
		for(int i=0;i<r;i++){
			for(int k=0;k<c;k++){
				this.a[i][k]=m1.a[i][k]+m2.a[i][k];
			}
		}
	}
	void display(){
		for(int i=0;i<r;i++){
			for(int k=0;k<c;k++){
				System.out.print(a[i][k]+" ");
				
			}
			System.out.println();
		}
	}
}
class newmatrix{
	public static void main(String ab[]){
		System.out.println("Enter rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int z=sc.nextInt();
		matrix m1=new matrix(b,z);
		m1.a=new int[b][z];
		m1.read();
		matrix m2=new matrix(b,z);
		m2.a=new int[b][z];
		m2.read();
		matrix m3=new matrix(b,z);
		m3.a=new int[b][z];
		m3.add(m1,m2);
		m3.display();
		
	}
}
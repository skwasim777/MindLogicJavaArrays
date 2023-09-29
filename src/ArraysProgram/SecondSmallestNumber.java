package ArraysProgram;

public class SecondSmallestNumber {
		public static int secondSmallestNumber(int a[],int total) {
			int temp=0;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			return a[1];
		}
		public static void main(String[] args) {
			int a[]= {1,2,3,4,5,6};
			System.out.println("second smallest number " + secondSmallestNumber(a,6));
		}
}

package Homework;

public class HW1 {
	public static void main(String[] args) {
		draw1(2);
		draw2(2);
		draw3(2);
		draw4(4);
		draw5(2);
		draw6(4);
		draw7(4);
		draw8(4);
	}
	
	
	static void draw1 (int n) {
		for(int i = 0;i<n;i++)
		System.out.print("*");
		System.out.println();
	}
	
	static void draw2 (int n) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void draw3(int n) {
		for(int i = 0;i<n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(j);
			}
		System.out.println();
		}
	}
	
	static void draw4(int n) {
		for(int i = 0;i<n;i++) {
			for(int j = n;j>0;j--) {
				System.out.print(j);
			}
		System.out.println();
		}
	}
	
	static void draw5(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(i);
			}
		System.out.println();
		}
	}
	
	static void draw6(int n) {
		for(int i = n;i>0;i--) {
			for(int j = 0;j<n;j++) {
				System.out.print(i);
			}
		System.out.println();
		}
	}
	
	static void draw7(int n) {
		for(int i = 1;i<=n*n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(i);
				i++;
			}
			i--;
		System.out.println();
		}
	}
	
	static void draw8(int n) {
		for(int i = n*n;i>0;i--) {
			for(int j = 0;j<n;j++) {
				System.out.print(i);
				i--;
			}
			i++;
		System.out.println();
		}
	}
}


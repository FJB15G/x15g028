package jp.ac.chibafjb.x15g028.kd172;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] x = {1,2,3};
		int i; 
		int[] y = {7,8};
		int[] z = {0,0,0,0,0};
		int m = x.length;
		int n = y.length;
		for(i=0;i<m;i++){
			z[i]=x[i];
		}
		for(i=n;i>0;i--){
			z[(m+n)]=y[i];
		}
		System.out.println(z[i]);
	}

}
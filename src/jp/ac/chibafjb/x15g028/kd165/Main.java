package jp.ac.chibafjb.x15g028.kd165;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a ={5,10,15};
		int i;
		int[] b ={0,0,0};
		int m = a.length;
		for(i=0;i<m;i++){
			b[i]=a[m-1-i];
			System.out.println("b["+i+"] = "+b[i]);
	}

}
}
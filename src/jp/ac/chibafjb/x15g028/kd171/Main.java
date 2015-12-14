package jp.ac.chibafjb.x15g028.kd171;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a={100,200,300,0};
		int i;
	
		int k = a.length-1;
		for(i=k;i>0;i--){
			a[i]=a[i-1];
		}
		for(i=0;i<k+1;i++){
			System.out.println("data["+(i)+"] = "+a[i]);
		}
	}

}

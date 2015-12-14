package jp.ac.chibafjb.x15g028.kd161;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int test[] = new int[2];
		int i;
		int work;
		test[0] = 10;
		test[1] = 20;
		work = test[1];
		test[1] = test[0];
		test[0] = work;
		
		for(i=0;i<=test.length;i++){
			System.out.println("test["+i+"] = "+(test[i]));
	}

	}
}

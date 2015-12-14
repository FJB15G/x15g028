package jp.ac.chibafjb.x15g028.kdT21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ハンバーガーの個数　　-->　5\nフライドポテトの個数　-->　4");
		Scanner sin = new Scanner(System.in);
		int s1 = sin.nextInt();
		int s2 = sin.nextInt();
		int a =100*s1;
		int b = 180*s2;
		int c = a+b;
		int d = (int)Math.floor(c*0.08);
		int f =10000;
		sin.close();
		System.out.println("ハンバーガーの代金"+(a)+"円");
		System.out.println("フライドポテトの代金"+(b)+"円");
		System.out.println("小計"+(c));
		
		System.out.println("消費税"+d+"円");
		System.out.println("合計金額"+(c+d)+"円");
		System.out.println("受取金額　　　    　　　-->　10000");
		System.out.println("つり銭　　　　　　　　＝　"+(f-(c+d))+"円");
	}

}

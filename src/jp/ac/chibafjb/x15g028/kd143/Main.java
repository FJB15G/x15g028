package jp.ac.chibafjb.x15g028.kd143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("住所の入力 --> 船橋市本町7-12-16");
		System.out.println("氏名の入力 --> 船橋太郎");
		System.out.println("電話番号の入力 --> 047-425-1051");
		Scanner sin = new Scanner(System.in);
		
		String s1 = sin.next();
		String s2 = sin.next();
		String s3 = sin.next();
		
		sin.close();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

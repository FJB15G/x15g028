package jp.ac.chibafjb.x15g028.kd142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数ａの入力  --> 1000");
		System.out.println("整数ｂの入力  --> 25");
	Scanner sin = new Scanner(System.in);
		int s1 = sin.nextInt();
		int s2 = sin.nextInt();
		sin.close();
		
		System.out.println(s1+" + "+s2+" = "+(s1+s2));
		System.out.println(s1+" - "+s2+" = "+(s1-s2));
		System.out.println(s1+" * "+s2+" = "+(s1*s2));
		System.out.println(s1+" / "+s2+" = "+(s1/s2));
	}

}

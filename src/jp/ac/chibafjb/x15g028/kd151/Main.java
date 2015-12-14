package jp.ac.chibafjb.x15g028.kd151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ａの入力 --> 123.4\nｂの入力 --> 56.7");
		Scanner sin = new Scanner(System.in);
		
		Float s1 = sin.nextFloat();
		Float s2 = sin.nextFloat();
		sin.close();
		
		System .out.println(s1+" + "+s2+" = "+(s1+s2));
		System .out.println(s1+" - "+s2+" = "+(s1-s2));
		System .out.println(s1+" * "+s2+" = "+(s1*s2));
		System .out.println(s1+" / "+s2+" = "+(s1/s2));
	}

}

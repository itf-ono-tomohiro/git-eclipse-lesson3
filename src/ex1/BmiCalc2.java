package ex1;

import java.util.Scanner;

public class BmiCalc2 {

	public static void main(String[] args) {
		/* BMI(体格指数)を計算するプログラム;
		 * BMI = 体重 / (身長 * 身長)
		 * 体重 kg, 身長 cm
		 */
		
		double weight,height,bmi;
		
		weight = 60;
		height = 165;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は(kg)：");
		weight = stdIn.nextDouble(); 
		System.out.println("身長は(cm)：");
		height = stdIn.nextDouble();
		
		height /= 100;
		bmi = weight / (height * height);
		
		System.out.println("BMI：" + bmi +"です。");
		

	}

}

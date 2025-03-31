package Array;

import java.util.Random;

public class Exercico2 {

	public static void main(String[] args) {
		Random rm = new Random();
		int nums[]= new int[10];
		int soma=0;
		for(int i=0;i<10;i++) {
			nums[i] = rm.nextInt(1,100); 
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(soma+"+"+nums[i]+"=");
			soma += nums[i];
			System.out.println(soma);
		}
		System.out.println(soma);
	}

}

package day7;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int a[] = { 100, 200, 100, 300, 100, 400, 100 };
		int num = 100;
		int count = 0;

	/*	for (int value : a) {
			if (value == num) {
				count++;
			}
		} */

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}
}

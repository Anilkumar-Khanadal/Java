package day7;

public class MultipleMissingNumbers {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4};
		int n = 4;

		System.out.println(("missing Numbers......"));

		for (int i = 1; i <= 4; i++) {
			boolean found = false;

			// check if number exists in array
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					found = true;
					break;
				}
			}
			// if not found
			if (!found) {
				System.out.println(i);
			}
		}
	}
}

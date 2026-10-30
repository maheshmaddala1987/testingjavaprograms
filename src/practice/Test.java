package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 2, 3, 5, 5, 4, 4, 6 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == temp) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					temp = arr[i];

				}

			}

			System.out.println(arr[i] + "" + count);

		}

	}

}

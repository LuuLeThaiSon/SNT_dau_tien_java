public class Sort {
	public static void main(String[] args) {
		int[] arr = new int[] {4, 1, 2, 5, 7, 10, 6, 3};
		int temp;
		boolean swapped;

		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}
}

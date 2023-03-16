public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] {4, 1, 2, 5, 7, 10, 6, 3, 7};
		int temp;
		int min;
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}


		for (int a : arr) {
			System.out.println(a);
		}
	}
}

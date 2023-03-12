public class MergeTwoSortedLists {
	public static void main(String[] args) {
		int[] list1 = { 3, 7, 7 };
		int[] list2 = { 4, 7, 8, 11 };
		int listLength = list1.length + list2.length;
		int[] list = new int[listLength];
		int listPosition = 0;
		int list1Position = 0;
		int list2Position = 0;

		while (list1Position < list1.length && list2Position < list2.length) {
			if (list1[list1Position] < list2[list2Position]) {
				list[listPosition++] = list1[list1Position++];
			} else {
				list[listPosition++] = list2[list2Position++];
			}
		}

		while (list1Position < list1.length) {
			list[listPosition++] = list1[list1Position++];
		}

		while (list2Position < list2.length) {
			list[listPosition++] = list2[list2Position++];
		}

		for (int l: list) {
			System.out.println(l);
		}
	}
}

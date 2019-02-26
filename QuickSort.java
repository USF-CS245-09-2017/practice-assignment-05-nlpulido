public class QuickSort implements SortingAlgorithm {
	public void sort(int[] a){
		this.sort(a, 0, a.length - 1);
	}

	public void sort(int[] a, int low, int high){
		if (low < high){
			int pivot = partition(a, low, high);
			sort(a, low, pivot - 1);
			sort(a, pivot + 1, high);
		}
	}

	public int partition(int[] a, int low, int high){
		int pivot = a[high];
		int i = (low - 1);
		for (int j = low; j < high; j++){
			if (a[j] <= pivot){
				i++;

				swap(a, i, j);
			}
		}

		swap(a, i + 1, high);
		return i + 1;
	}

	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
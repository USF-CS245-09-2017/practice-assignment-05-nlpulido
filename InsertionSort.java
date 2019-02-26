public class InsertionSort implements SortingAlgorithm {
	public void sort(int [] a){
		for (int i = 0; i < a.length; ++i){
			int index = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > index){
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = index;
		}
	}
}
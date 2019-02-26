import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
	public void sort(int [] a){
		this.sort(a, 0, a.length - 1);
	}

	public void sort(int a[], int left, int right){
		if (left < right){
			int middle = (left + right) / 2;

			// sort each sub array
			sort(a, left, middle);
			sort(a, middle + 1, right);

			// merge the two sorted subarrays
			merge(a, left, middle, right);
		}
	}

	public void merge(int[] a, int left, int middle, int right){

		// get sizes of each sub array
		int n1 = middle - left + 1;
		int n2 = right - middle;

		// get the left and right subarrays
		int[] leftArr = get_left(a);
		int[] rightArr = get_right(a);


		int i = 0;
		int j = 0;
		int k = left;
		while (i < n1 && j < n2){
			if (leftArr[i] <= rightArr[j]){
				a[k] = leftArr[i];
				i++;
			} else {
				a[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1){
			a[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2){
			a[k] = rightArr[j];
			j++;
			k++;
		}
	}



	public int[] get_left(int[] a){
		int[] left = Arrays.copyOfRange(a, 0, a.length);
		return left;
	}

	public int[] get_right(int[] a){
		int[] right = Arrays.copyOfRange(a, 0, a.length);
		return right;
	}
}
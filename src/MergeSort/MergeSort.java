package MergeSort;

public class MergeSort {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (left[i] >= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }
}

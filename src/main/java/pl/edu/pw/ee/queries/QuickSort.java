package pl.edu.pw.ee.queries;

import org.jetbrains.annotations.NotNull;

public class QuickSort {
    private static int participateMax(int @NotNull [] array, int min, int max){
        var pivot = array[max];
        var i = min - 1;

        for (int j = min; j < max; j++){
            if (array[j] <= pivot){
                var temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i+1];
        array[i+1] = array[max];
        array[max] = temp;

        return i + 1;
    }

    private static int participateMin(int @NotNull [] array, int min, int max){
        var pivot = array[max];
        var i = min - 1;

        for (int j = min; j < max; j++){
            if (array[j] >= pivot){
                var temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i+1];
        array[i+1] = array[max];
        array[max] = temp;

        return i + 1;
    }

    public static void qsortGrowing(int[] array, int min, int max){
        if (min < max){
            int pivot = QuickSort.participateMax(array, min, max);

            QuickSort.qsortGrowing(array, min, pivot - 1);

            QuickSort.qsortGrowing(array, pivot + 1, max);
        }
    }

    public static void qsortDecreasing(int[] array, int min, int max){
        if (min < max){
            int pivot = QuickSort.participateMin(array, min, max);

            QuickSort.qsortDecreasing(array, min, pivot - 1);

            QuickSort.qsortDecreasing(array, pivot + 1, max);
        }
    }
}

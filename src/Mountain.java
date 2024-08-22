public class Mountain {

    public static boolean isIncreasing(int[] array, int stop){
        boolean increasing = true;
        for (int i=0; i<=stop-1; i++){
            if (array[i+1] <= array[i]) increasing = false;
        }
        return increasing;
    }

    public static boolean isDecreasing(int[] array, int start){
        boolean decreasing = true;
        for (int i=start; i< array.length-1; i++){
            if (array[i+1] >= array[i]) decreasing = false;
        }
        return decreasing;
    }

    public static int getPeakIndex(int[] array){
        int peakIndex = 0;
        for (int i=1; i<array.length - 1; i++){
            if (array[i-1] < array[i] && array[i+1] < array[i]){
                peakIndex = i;
                break;
            }
        }
        if (peakIndex!=0) return peakIndex;
        return -1;
    }

    public static boolean isMountain(int[] array){
        int peakIndex = getPeakIndex(array);
        if (peakIndex==-1) return false;
        return isIncreasing(array, peakIndex) && isDecreasing(array, peakIndex+1);
    }




}

//Quick sort T.C. worst case : O(n^2)
// average case : O(nlogn)
// pivot can be : first , last or random element..
// it is preffered over merge sort becoz it doesn't require extra memory.[array]...

class Quick{
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high]; // last element is pivot
        int i = low-1;

        // the below loop and if condition will give all elements less than pivot to left side..and the
        // very next index will be of pivot 
        for(int j = low; j<high; j++){ // 5 will come in place of 9  
            if(arr[j]<pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }
 // 6 3 5 2 9 11 8 pivot = 8
 // 6 3 5 2 8 11 9
    public static void quickSort(int arr[], int low,int high){
        if(low<high){ // pivot index = pidx
            int pidx = partition(arr,low,high);
            
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }

    public static void main(String[] args){
        int arr[] = {6,3,9,11,5,2,8}; // pivot = 8
        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}

// 2 3 5 6 8 9 11

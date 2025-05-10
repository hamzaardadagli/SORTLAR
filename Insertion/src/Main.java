public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.println("sort tan önce");
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Sorttan sonra");
        bubbleSort(arr);
        yazdir(arr);
    }
    public static void yazdir(int[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }

    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){//tur sayısını temsil eder
            for(int j = 0; j < n-i-1; j++){//karşılaştırılan eleman sayısını temsil eder
                if(arr[j] > arr[j+1]){
                    //elemanları değiştirir
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}


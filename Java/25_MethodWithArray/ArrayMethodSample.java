class ArrayMethodSample{
    static int indexOfMax(int[] x){
        int imax = 0;
        for(int i = 1; i < x.length; i++){
            if(x[i] > x[imax])
                imax = i;
        }
        return imax;
    }

    static void descendingSort(int[] x){
        for(int i = 0; i < x.length; i++){
            for(int j = i + 1; j < x.length; j++){
                if(x[j] > x[i]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[] a = {64, 75, 40, 92,58};
        
        for(int i = 0; i < a.length; i++){
            System.out.println("The score for number " + (i + 1) + " is " + a[i]);
        }
        int imax = indexOfMax(a);
        System.out.println("The maximum score is " + a[imax] + " for number " + (imax + 1));
        System.out.println();

        descendingSort(a);

        for(int i = 0; i < a.length; i++){
            System.out.println("The score for number " + (i + 1) + " is " + a[i]);
        }
    }
}

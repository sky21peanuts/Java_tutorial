class RabelContinueSample{
    public static void main(String[] args){
        RowLoop:
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(i * j % 2 == 0){
                    System.out.println();
                    continue RowLoop;
                }
                System.out.printf(" %2d", i * j);
            }
            System.out.println();
        }
    }
}

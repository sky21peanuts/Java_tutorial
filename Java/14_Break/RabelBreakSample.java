class RabelBreakSample{
    public static void main(String[] args){
        int limit = 20;

        RowLoop:
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if(i*j > limit){
                    System.out.println();
                    break RowLoop;
                }
                System.out.printf(" %2d", i*j);
            }
            System.out.println();
        }
    }
}

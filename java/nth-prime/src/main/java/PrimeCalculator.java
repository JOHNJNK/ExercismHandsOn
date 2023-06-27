class PrimeCalculator {

    int nth(int nth) {
        if(nth==0){
            throw new IllegalArgumentException();
        }
        int num=1;
        while(nth>0){
            num++;
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                nth--;
            }
        }
        return num;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}

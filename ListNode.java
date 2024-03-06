class Solution {
    public int kthFactor(int n, int k) {
        int r;
        int i[];
        i = new int[50];
        int size = 0;
        for(int j = 1;j <= n;j++){
            r = n % j;
            if(r == 0){
                i[size] = j;
                size++;
               
               if(i[k-1] == i[size-1]){
                        return i[k-1];
                    }
                else{
                    
                    continue;
                }
                    }
                    }
             
             return -1;
        }
       }
            

        
    
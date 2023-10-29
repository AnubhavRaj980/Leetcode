class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int s1=0;int s0=0,sa1=0,sa0=0,n=students.length,i=0,j=0;;
        for(int p:students){
            if(p==0) s0++;
            else  s1++;
        }    
        for(int p:sandwiches){
            if(p==0)sa0++;
            else sa1++;
        } 
        if(sa1==s1 && sa0==s0){
            return 0;
        }else{
            for(int m:sandwiches){
                if(m==0){
                    if(s0==0)return s1;
                    s0--;
                }else{
                    if(s1==0)return s0; 
                    s1--;
                }
            }
        }  
        return -1;
    }
}
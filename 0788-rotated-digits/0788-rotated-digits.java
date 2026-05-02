class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        boolean valid= true;// take true  so that if digits are only 2 or 5 or 6 or 9 (ie valid digits)then it remain true
        //but if u take it false then it is a bug ..why ? bcz we are not modifying valid as true even when valid digits came.
        //so it will remain false and we will get wrong result. And also once any digit is not valid then it cant be a good number ..so we should not modify again it as true 

        boolean changed=false;//similary here changed cant be true .Bcz we are only modifying changed as true when a valid digit comes 
        //so if take its initiak value as true then it will remain true even when nonvalid digits come

        for(int i=1;i<=n;i++){
            int num=i;
            valid=true;
            
            changed=false;

          while(num>0){
            int digit =num%10;
           
           switch(digit){
             case 3:
             case 4:
             case 7:
                valid=false; break;
            case 2:
            case 5:
            case 6:
            case 9:
                changed = true; break;
           
           }
           if(!valid)break;
           num/=10;
         }  
          if(valid && changed)count++; 
        }
        return count;
    }
    
}
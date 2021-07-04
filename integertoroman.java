class Solution {
    public String intToRoman(int num) {
       
        StringBuilder res=new StringBuilder();
        int[] a = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] b = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        while(num!=0){
            for(int i=a.length-1;i>=0;i--){
                if(num>=a[i]){
                    res.append(b[i]);
                    num=num-a[i];
                  
                    break;
                }
            }
        }
        return res.toString();
    }
}
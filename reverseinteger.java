class Solution {
    public int reverse(int x) {
    long positive=0;
long r;
long a;
a=Math.abs(x);
while(a>0)
{
r=a%10;
positive=positive*10+r;
a=a/10;
    }
    System.out.println(positive);
    if(x>0&&positive<=2147483647)
    {
        return (int)positive;

    }
    else if(x<0&&-positive>=-2147483648)
    {
        return (int)-positive; 
    }
    else
    {
        return 0;
    }
    }
}
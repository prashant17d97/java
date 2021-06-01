public class Palindrome
{public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;
  String a;
  temp=n; 
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    {
        a="palindrome";    }
  else    
  {
   a="not palindrome";}
   System.out.println(temp+" is "+a);
}  
}  
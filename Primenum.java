public class Prime  
{  
public static void main(String[] args)   
    {  
int a=0,num=0,i=1,j=1;  
while(num<25)  
{  
j=1;  
a=0;  
while(j<=i)  
{  
if(i%j==0)  
a++;  
j++;   
}  
if(a==2)  
{  
System.out.printf("%d ",i);  
num++;  
}  
i++;  
}    
}  
}

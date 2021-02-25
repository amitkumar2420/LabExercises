class Exercise5 {
int calculateSum(int n) {
int i=1;
int m=n;
int s=0;
while(i<=n)
{
if(i%3==0 || i%5==0)
{
s=s+i;}
i=i+1;
}
return s;
}
public static void main(String[] arg) {
 Exercise5 ex5= new Exercise5();
 int sum =ex5.calculateSum(20);
System.out.println("Sum:"+sum);
  
  }
}
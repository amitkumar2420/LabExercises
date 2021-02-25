class Exercise6{
  int calculateDifference(int n)
    {
      int s1=0,s2=0,d,i;
      for(i=1;i<=n;i++)
	{
	  s1=s1+(i*i);
		}
	for(i=1;i<=n;i++){
		s2=s2+i;}
	s2=(s2*s2);
	d=s1-s2;
	return d;
    }
public static void main(String[] args)
{
    Exercise6 ex6=new Exercise6();
    int difference=ex6.calculateDifference(10);
     System.out.println("Difference is :"+difference);
}
}
  
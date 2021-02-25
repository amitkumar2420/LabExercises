class Ex4
{ 
 int modifyArray(int arr[],int l)
 {
  int b[]=new int[l];
  int j=0;
  for(int i=0;i<l-1;i++)
  {
   if(arr[i]!=arr[i+1])
   {
    b[j++]=arr[i];
   }
    
  }b[j++]=arr[l-1];
  
  for(int i=0;i<j;i++)
  {
    arr[i]=b[i];
  }
//return j;

  //Sorting
  for(int i=0;i<j;i++)
  {
   for(int m=i+1;m<j;m++)
    {
      int temp=0;
      if(arr[i]<arr[m])
      {
        temp=arr[i];
        arr[i]=arr[m];
        arr[m]=temp;
      }
    }
   }
for(int i=0;i<arr.length-1;i++)
{
  System.out.println(arr[i]);
}  return 0;

 }
 public static void main(String[] args)
 {
   int array[]=new int[]{1,2,3,3,4,5};
   int n=array.length;
   Ex4 e=new Ex4();     
   n=e.modifyArray(array,n);
   for(int i=0;i<n;i++)
   { System.out.println(array[i]);}
 }
}

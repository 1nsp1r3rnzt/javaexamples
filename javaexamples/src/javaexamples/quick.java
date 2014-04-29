package javaexamples;

class quick {
	 public void sort(int [] arrs)
	{
	sort2(arrs,0,arrs.length-1);



	}
	private void sort2(int[] arr,int up,int down){
	 int pivot=up+(down-up)/2;
	int i=up;

	int j=down;

	if (up>down)
	 
	while(i<=j)
	{
	  if(arr[i]<arr[pivot])
	{i++;
	}

	  if(arr[j]>arr[pivot])
	{j--;
	}

	if(i<=j)
	{

	  int temp=arr[i];
	  arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;

	}
	 if (up<j) {
	   sort2(arr,up,pivot-1);}
	   if(down<i){

	    sort2(arr,pivot+1,down);

	   }



	}


	}
	public static void main(String[] args) {
	  int arr2[]={1,11,111,2,334,45454,56,56,45};

	quick n1=new quick();
	n1.sort(arr2);
for(int i=0;i<arr2.length;i++)

{
System.out.println(arr2[i]); 
}
	}
	}
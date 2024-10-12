#include <stdio.h>
void main(){
	int low,high,n,count,div;
	printf("Enter low range num and high range num separeted by white space: ");
	scanf("%d %d",&low,&high);
	
	
	for (n = low; n <= high; n++){

		count = 0;
		for(div = 2; div * div <= n; div++){
			if(n % div == 0){
				count++;
				break;
			}
		}
		if(count==0){
			printf("%d\n",n);//print all prime number between range
		}
	}
}

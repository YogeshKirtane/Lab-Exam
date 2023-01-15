#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <unistd.h>

void main()
{
	pid_t id;
	id = fork();
	
	if(id>0)
	{
		printf("Parent Executing \n");
		printf("Waiting for child to finish \n");
		wait(NULL);
		printf("Parent finished \n");
	}
	else
	{
		printf("Child Executing \n");
		int i;
		int arr[] = {5, 2, 4, 6, 8};
                for (i=0; i < 5; i++)
		{
			sleep(5);
                        printf("%d \n", arr[i]);
                }
		printf("Child finished \n");
		exit(0);
	}
}

#include <stdio.h>
#include <stdlib.h>

int main(){
	int a;
	int b;
	int c;
	char* as = (char*)malloc(101 * sizeof(char));
	char* bs = (char*)malloc(101 * sizeof(char));
	char* cs = (char*)malloc(101 * sizeof(char));
	
	scanf("%d", &a);
	scanf("%d", &b);
	c = b + a;
	printf("%d", c);
	
	return 0;
}
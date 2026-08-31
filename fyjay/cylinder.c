#include<stdio.h>
int main()
{
	float r=7,h=10,pi=3.14,area;
	area=2*pi*r*(r+h);
	printf("radius=%.2f\n",r);
	printf("height=.2f\n",h);
	printf("total surface area of cylinder=%.2f\n",area);
	return 0;
}

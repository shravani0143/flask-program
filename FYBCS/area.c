#include<stdio.h>
int main()
	 {
		 int ch;
		 float side,l,b,base,height,area;
		 printf("area of square\n");
		 printf("area of rectangle\n");
		 printf("area of traingle\n");
		 printf("enter your choice:");
		 scanf("%d",&ch);
		 switch(ch)
		 {
                     case1:
			 printf("enter length of square:");
			 scanf("%f",&side);
			 area = side*side;
			 printf("area of square =%2f",area);
			 break;
                     case2:
			 printf("enter length and breadth:");
			 scanf("%f%f",&l,&b);
			 area=l*b;
		         printf("area of rectangle=%2f",area);
			 break;
                     case3:
			 printf("enter base and height:");
			 scanf("%f%f",&base, &height);
			 area=0.5*base*height;
			 printf("area of triangle=%2f",area);
			 break;
			 default:printf("invalid choice!");
		 }
		 return 0;
	 }




		  

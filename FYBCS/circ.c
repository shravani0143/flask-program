#include<stdio.h>
int main()
        {
		float r,area,circumfrence,volume;
		int choice ;
		printf("enter radius:");
		scanf("%f",&r);
		printf("area of radius \n");
		printf("circumfrence of circle \n");
		printf("volume of sphere \n");
		printf("eneter your choice:\n");
		scanf("%d", &choice);
		switch(choice)
			 {
                case1:
				 area =3.14*r*r;
				 printf("area of circle =%f",area);
				 break;
                case2:
				 circumfrence =2*3.14*r;
				 printf("circumfrence of circle=%f",circumfrence);                                   				break;                                                                           
                 case3:
			 volume =(4.0/3.0)*3.14*r*r*r;
	                 printf("volume of sphere=%f",volume);
		            break;
				 default: printf("invalid choice ");
			 }
                     return 0;
	}		     



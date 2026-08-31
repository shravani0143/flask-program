#include<iostream>
using namespace std;
class player
{
	int runs;
	string name;
	public:
		void get_data(int r , string n)
		{
			runs = r;
			name = n;
		}
		void print(){
		cout<<"name:"<<name<<" runs: "<<runs<<endl;
		}
};
int main()
{
			player p1,p2,p3;
				p1.get_data(10,"Rohit");
				p2.get_data(20,"aniket");
				p3.get_data(30,"harshwardhan");
				p1.print();
				p2.print();
				p3.print();
				return 0;
}


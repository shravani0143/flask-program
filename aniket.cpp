#include<iostream>
using namespace std;
class student
{
	public:
		string name;
		void display()
		{
			cout<<"Student Name:"<<name<<endl;
		}
};
int main()
{
	student studentobj;
	studentobj.name="Aniket";
	studentobj.display();
	return 0;
}


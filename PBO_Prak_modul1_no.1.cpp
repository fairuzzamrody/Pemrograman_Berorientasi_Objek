#include<conio.h>
#include<iostream>
using namespace std;
class posneg;
int main()
{
 char pilih;
 	cout << "          ======================" << endl;
    cout << "             FAIRUZ ZAMRODY   " << endl;
    cout << "               19051397056   " << endl;
    cout << "         ======================" << endl<<endl;
    
do {int bil;
cout << " Masukan Bilangan : ";
cin >> bil;

if (bil == 0) {
cout << " Bilangan 1";
}
else  if ( bil > 0){
if (bil % 2 == 0) {
cout <<  bil <<" Merupakan Genap Positif"<<endl;
}
else{
cout << bil << " Merupakan Bilangan Ganjil Positif"<<endl;
}
}
else{
if (bil % 2 == 0) {
cout << bil  << " Merupakan Bilangan Genap Negatif" <<endl;
}
else{
cout << bil  << " Merupakan Bilangan Ganjil Negatif" <<endl;
}
}
 cout << " Ingin mengulang ? (y/n)" <<endl;
    cin >> pilih;
    cout << endl;
 }while (pilih =='y' , 'Y');


}

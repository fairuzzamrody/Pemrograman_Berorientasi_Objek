#include <iostream>
#include <conio.h>
 
using namespace std;
class deret;
int main(){
    int a=0, b, c, jumlah=0, i, n;
     
    cout << "          ======================" << endl;
    cout << "             FAIRUZ ZAMRODY   " << endl;
    cout << "               19051397056   " << endl;
    cout << "         ======================" << endl<<endl;
    cout<<" Menghitung Jumlah Deret Bilangan "<<endl<<endl;
    cout<<" Masukkan bilangan awal : ";
    cin>>a;
    cout<<" Masukkan beda : ";
    cin>>b;
    cout<<" Masukkan jumlah sampai deret ke-n : ";
    cin>>n;
     
    cout<<" Deret ke-"<<n<<" : ";
    cout<<a<<",";
    jumlah=jumlah+a; 
    for(i=0; i<n-1; i++){
             c=a+b;
             a=c;
             cout<<c<<",";
             jumlah=jumlah+c;                      
    }
     
    cout<<"\n Jumlah deret ke-"<<n<<" : ";
    cout<<jumlah; 
     
    getch();
}

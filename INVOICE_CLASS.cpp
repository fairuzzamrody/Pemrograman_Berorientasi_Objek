#include<iostream>
#include <string>
using namespace std;

class Invoice
{
	public:
		Invoice( string, string, int, int );
	void setPartNumber( string );
		string getPartNumber();
	void setPartDescription(string);
		string getPartDescription();
	void setItemQuantity(int);
	int getItemQuantity();
	void setItemPrice(int);
	int getItemPrice();
	int getInvoiceAmount();

	private:
		string partNumber;
		string partDescription;
	int itemQuantity;
	int itemPrice;
};

Invoice::Invoice( string number, string description, int quantity, int price )
{
	partNumber=number;
	partDescription=description;

	if(quantity>0)
		itemQuantity=quantity;
	else
		{
  		itemQuantity=0;
		cout<<"Initial quantity was invalid."<<endl;
		}

 	if(price>0)
		itemPrice=price;
	else
		{
		itemPrice=0;
		cout<<"Initial price was invalid."<<endl;
		}
}

void Invoice::setPartNumber( string number)
{
	if ( number.length() <= 25 )
		partNumber = number;
	if ( number.length() > 25 )
	{
  		partNumber = number.substr( 0, 25 );
  		cout << "Name \"" << number << endl;
	}
}

void Invoice::setPartDescription(string description )
{
	if ( description.length() <= 25 )
		partDescription = description;
	if ( description.length() > 25 )
	{
		partDescription = description.substr( 0, 25 );
		cout << "Name \"" << description << endl;
	}
}

void Invoice::setItemQuantity(int quantity )
{
	if(quantity>0)
		itemQuantity=quantity;
	else
	{
		itemQuantity=0;
		cout<<"Initial quantity was invalid."<<endl;
	}
}

void Invoice::setItemPrice(int price )
{
	if(price>0)
		itemPrice=price;
	else
		{
		itemPrice=0;
		cout<<"Initial price was invalid."<<endl;
	}
}

string Invoice::getPartNumber() {
	return partNumber;
}
string Invoice::getPartDescription() {
	return partDescription;
}
int Invoice::getItemQuantity() {
	return itemQuantity;
}
int Invoice::getItemPrice() {
	return itemPrice;
}
int Invoice::getInvoiceAmount() {
	return itemQuantity*itemPrice;
}

int main() {
	cout << " Nama	: Fairuz Zamrody" <<endl;
	cout << " NIM	: 19051397056" <<endl;
	cout << " Prodi	: D4 RPL 2019" <<endl<<endl;
	cout << "         -----------------------------------------------------------" <<endl;
	cout << "                     	    	H A R G A" <<endl;
	cout << "         -----------------------------------------------------------" <<endl<<endl;
	Invoice Invoice1("MS-1321","Mouse",8,40000);
	cout << " Code Invoice 1 	: "<< Invoice1.getPartNumber() <<endl;
	cout << " Deskripsi	        : "<< Invoice1.getPartDescription() <<endl;
	cout << " Total Item	     	: "<< Invoice1.getItemQuantity() <<endl;
	cout << " HARGA per Item    	: Rp. "<< Invoice1.getItemPrice()<<",-" <<endl;
	cout << " HARGA TOTAL INVOICE 1 adalah Rp. "<<Invoice1.getInvoiceAmount()<<",-" <<endl<<endl;
	Invoice Invoice2("KB-2191","Keyboard",3,150000);
	cout << " Code Invoice 2 	: "<< Invoice2.getPartNumber() <<endl;
	cout << " Deskripsi 	    	: "<< Invoice2.getPartDescription() <<endl;
	cout << " Total Item	    	: "<< Invoice2.getItemQuantity() <<endl;
	cout << " HARGA per Item 	: Rp. "<< Invoice2.getItemPrice()<<",-" <<endl;
	cout << " HARGA TOTAL INVOICE 1 adalah Rp. "<< Invoice1.getInvoiceAmount()<<",-" <<endl<<endl;
	cout << "----------------------------------------------------------------" <<endl<<endl;


}

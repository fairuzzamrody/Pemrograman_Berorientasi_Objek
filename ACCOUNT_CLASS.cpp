#include<iostream>
#include <string>
using namespace std;

class Account
{
	public:
		Account(int);
	void credit(int);
	void debit(int);
	int getAccountBalance();

 	private:
	int accountBalance;
};

Account::Account( int balance)
{
	if(balance>=0)
		accountBalance=balance;
	else
	{
		accountBalance=0;
		cout<<"Saldo awal tidak valid"<<endl;
	}
}

void Account::credit( int balance) {
	accountBalance = accountBalance + balance;
}
void Account::debit( int balance) {
	if(accountBalance>=balance)
	{
		accountBalance = accountBalance - balance;
	}
	else
	{
		cout<<"Debit amount exceeded account balance."<<endl;
	}
}

int Account::getAccountBalance() {
	return accountBalance;
}

int main()
{
	cout << " Nama	: Fairuz Zamrody"<<endl;
	cout << " NIM	: 19051397056"<<endl;
	cout << " Prodi	: D4 RPL 2019" <<endl<<endl;
	cout << "       --------------------------------------------------------     " <<endl;
	cout << "		               A C C O U N T " <<endl;
	cout << "       --------------------------------------------------------     " <<endl<<endl;

	Account Account1(2000000);
	Account Account2(5000000);
	cout << " SALDO PERTAMA ACCOUNT 1 : Rp. "<< Account1.getAccountBalance() <<",-" <<endl;
	cout << " SALDO PERTAMA ACCOUNT 2 : Rp. "<< Account2.getAccountBalance() <<",-" <<endl;
	cout << "-----------------------------------------------------------------------------------" <<endl;

	cout << endl;
	Account1.credit(50000);
	Account2.credit(25000);
	cout << " CREDIT ACCOUNT 1 : Rp. 50000 ,-" << endl;
	cout << " CREDIT ACCOUNT 2 : Rp. 25000 ,-" << endl;

	cout <<endl << "-> SETELAH PENGAJUAN CREDIT :" << endl <<endl;
	cout << " SALDO ACCOUNT 1 : Rp. "<< Account1.getAccountBalance() <<",-" <<endl;
	cout << " SALDO ACCOUNT 2 : Rp. "<< Account2.getAccountBalance() <<",-" <<endl<<endl;
	cout << "-----------------------------------------------------------------------------------" <<endl;

	cout << endl;
	Account1.debit(1500);
	Account2.debit(500);
	cout << " DEBIT ACCOUNT 1 : Rp. 2500 ,-" << endl;
	cout << " DEBIT ACCOUNT 2 : Rp. 5000 ,-" << endl;

	cout <<endl << "-> SETELAH PENGAJUAN DEBIT :" << endl <<endl;
	cout << " SALDO AKHIR ACCOUNT 1 : Rp. "<< Account1.getAccountBalance() <<",-"<< endl;
	cout << " SALDO AKHIR ACCOUNT 2 : Rp. "<< Account2.getAccountBalance() <<",-"<< endl;
	cout << "-----------------------------------------------------------------------------------" <<endl;
}

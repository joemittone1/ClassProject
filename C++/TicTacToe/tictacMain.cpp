//main program
//Name: Joe Mittone
//Desc: A Nice Game Of Tic Tac Toe

#include <iostream>
#include "tictac.h"

using namespace std;

int main()
{
	char restart = 'Y';
	int hold = 0;
	ticTacToe Name;

	Name.GetName();

	do
	{
		ticTacToe game;

		game.play();

		cout << "Would you like to restart? ('Y' for yes and 'N' for no): ";
		cin >> restart;

	} while (restart == 'Y' || restart == 'y');
	
	cin >> hold;
	return 0;
}

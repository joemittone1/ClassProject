
//tic tac toe implementation file

#include <iostream>
#include <iomanip>
#include "tictac.h"

using namespace std;

void ticTacToe::play()
{
	bool done = false;
	char player = 'X';

	displayBoard();

	while (!done)
	{
		done = getXOMove(player);

		if (player == 'X')
			player = 'O';
		else
			player = 'X';
	}

}

void ticTacToe::GetName()
{
	
	struct Players
	{
		string Name;
		int Stats;
		char XOrO;

	}Player1, Player2;

	cout << "Player 1, Please enter your first name: ";
	cin >> Player1.Name;
	
	cout << Player1.Name << " Please select either 'X' or 'O' (X will always go first): ";
	cin >> Player1.XOrO;

	if (Player1.XOrO == 'X' || Player1.XOrO == 'x')
	{
		Player1.XOrO = 'X';
		Player2.XOrO = 'O';
	}

	if (Player1.XOrO == 'o' || Player1.XOrO == 'O')
	{
		Player1.XOrO = 'O';
		Player2.XOrO = 'X';
	}

	cout << "Player 2, Please enter your first name: ";
	cin >> Player2.Name;
	cout << endl << Player2.Name << " Your symbol has been chosen by " << Player1.Name << ". Your symbol is " << Player2.XOrO << endl;
	
	
}

void ticTacToe::displayBoard() const
{
	cout << "  1	2	3" << endl << endl;

	for (int row = 0; row < 3; row++)
	{
		cout << row + 1;

		for (int col = 0; col < 3; col++)
		{
			cout << setw(3) << board[row][col];

			if (col != 2)
				cout << "|";
		}

		cout << endl;

		if (row != 2)
			cout << " ___|___|___" << endl
			<< "    |   |" << endl;
	}
	cout << endl;
}

bool ticTacToe::isValidMove(int row, int col) const
{
	if (0 <= row && row <= 2 && 0 <= col && col <= 2 && board[row][col] == ' ')
		return true;
	else
		return false;
}

bool ticTacToe::getXOMove(char playerSymbol)
{
	int row, col;

	do
	{
		cout << "Player " << playerSymbol
			<< " enter move ('Row' 'Column'): ";
		cin >> row >> col;
		cout << endl;
		system("CLS");
	} while (!isValidMove(row - 1, col - 1));

	row--;
	col--;

	noOfMoves++;

	board[row][col] = playerSymbol;
	displayBoard();

	status gStatus = gameStatus();

	if (gStatus == Win)
	{
		cout << "Player " << playerSymbol << " wins!" << endl;
		return true;
	}
	else if (gStatus == Draw)
	{
		cout << "This game is a draw!" << endl;
		return true;
	}
	else
		return false;
}

status ticTacToe::gameStatus()
{
	//check rows for a win
	for (int row = 0; row < 3; row++)
		if (board[row][0] != ' ' && (board[row][0] == board[row][1]) && (board[row][1] == board[row][2]))
			return Win;

	//Check columns for a win
	for (int col = 0; col < 3; col++)
		if (board[0][col] != ' ' && (board[0][col] == board[1][col]) && (board[1][col] == board[2][col]))
			return Win;

	//check diagonals for a win
	if (board[0][0] != ' ' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		return Win;

	if (board[2][0] != ' ' && (board[2][0] == board[1][1]) && (board[1][1] == board[0][2]))
		return Win;

	if (noOfMoves < 9)
		return Continue;

	return Draw;
}

void ticTacToe::reStart()
{
	for (int row = 0; row < 3; row++)
		for (int col = 0; col < 3; col++)
			board[row][col] = ' ';

	noOfMoves = 0;
}

ticTacToe::ticTacToe()
{
	for (int row = 0; row < 3; row++)
		for (int col = 0; col < 3; col++)
			board[row][col] = ' ';

	noOfMoves = 0;
}
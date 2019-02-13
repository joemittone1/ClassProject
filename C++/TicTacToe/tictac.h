//tic tac toe header file

#include <string>

using namespace std;

enum status { Win, Draw, Continue};

class ticTacToe
{
	public:
		
		void play();
		//function to start the play

		void displayBoard() const;
		//function to print the board

		bool isValidMove(int x, int y) const;
		// to determine if a move is valid

		bool getXOMove(char moveSymbol);
		//to get a move for a player

		status gameStatus();
		//to determine the current status of the game

		void reStart();
		// to restart the game

		void GetName();
		//allows player to set name.

		ticTacToe();
		//default constructor
		//postcondition: initializes the board to an empty state

	private:
		char board[3][3];
		int noOfMoves;
};
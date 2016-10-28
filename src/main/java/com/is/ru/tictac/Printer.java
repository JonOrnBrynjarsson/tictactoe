package com.is.ru.tictac;

public class Printer {
	
    public static void greet() {
	System.out.println("Welcome to Tic-tac-toe!");
    }
    
    public static void printIntro()
    {
	System.out.println("Hello I want to play a game");
	System.out.println("TIC TAC TOE");
	
    }
    
    public static void getPlayers(int i)
    {
	System.out.println("Player " + i + "!"); 
	System.out.print("Enter zero (0) if you are human and one (1) if you are computer: "); 
    }
    
    public static void printBoard(Board gameBoard)
    {
	System.out.println();
	for(int x = 0; x < gameBoard.getBoardSize(); x++)
	    {
		for(int y = 0; y < gameBoard.getBoardSize(); y++)
		    {
			if(gameBoard.getPlayerAtRowCol(x,y) == 1) // X for player 1
			    {
				System.out.print("  X  ");
			    }
			else if(gameBoard.getPlayerAtRowCol(x,y) == 2) // O for player 2
			    {
				System.out.print("  O  ");
			    }
			else // empty for free spot
			    {
				System.out.print("     ");
			    }
			if(y != 2)
			    {
			       	System.out.print("|");
			    }
			
		    }
		System.out.println();
		if(x != 2)
		    {
			System.out.println("-----" + "+" + "-----" + "+" + "-----");
		    }
	    }
		System.out.println();
    }

    public static void playerMove(int number)
    {
	System.out.println("Player " + number + " move: ");
    }
    
    public static void spotTakenOrIllegal()
    {
	System.out.println("The spot is taken or not legal");
    }
    
    public static void winner(int number)
    {
	System.out.println("Player " + number + " won!");
    }
    
}

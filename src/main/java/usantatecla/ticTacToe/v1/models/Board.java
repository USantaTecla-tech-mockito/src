package usantatecla.ticTacToe.v1.models;

import usantatecla.ticTacToe.v1.utils.Coordinate;

abstract class Board {

	abstract Color getColor(Coordinate coordinate);

	abstract boolean complete();

	abstract boolean existTicTacToe(Color color);

	abstract boolean empty(Coordinate coordinate);

	abstract void put(Coordinate coordinate, Color color);

	abstract void remove(Coordinate coordinate, Color color);

	abstract boolean full(Coordinate coordinate, Color color);

	abstract void clear();

}

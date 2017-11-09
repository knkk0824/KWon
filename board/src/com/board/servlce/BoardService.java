package com.board.servlce;

import java.sql.SQLException;

public interface BoardService {
  
	void addBoard(String board)throws SQLException;
}

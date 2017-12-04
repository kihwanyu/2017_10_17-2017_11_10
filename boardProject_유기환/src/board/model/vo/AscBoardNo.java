package board.model.vo;

import java.util.Comparator;

public class AscBoardNo implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		if(o1.getBoardNo() == o2.getBoardNo()){
			return 0;
		}
		if(o1.getBoardNo() > o2.getBoardNo()){
			return 1;
		}
		if(o1.getBoardNo() < o2.getBoardNo()){
			return -1;
		}
		return 0;
	}

}

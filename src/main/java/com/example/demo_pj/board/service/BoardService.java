package com.example.demo_pj.board.service;

import com.example.demo_pj.board.dto.BoardRequest;
import com.example.demo_pj.board.entity.Board;

import java.util.List;

public interface BoardService {
    void save(BoardRequest request);
    Board getBoardbyId(Long id);
    List<Board> getAllBoards();
}

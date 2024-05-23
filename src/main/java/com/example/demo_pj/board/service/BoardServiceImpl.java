package com.example.demo_pj.board.service;

import com.example.demo_pj.board.dto.BoardRequest;
import com.example.demo_pj.board.entity.Board;
import com.example.demo_pj.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;
    @Override
    public void save(BoardRequest request) {
        boardRepository.save(request.toEntity());
    }

    @Override
    public Board getBoardbyId(Long  id) {

        return boardRepository.findById(id).get();
    }

    @Override
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }
}

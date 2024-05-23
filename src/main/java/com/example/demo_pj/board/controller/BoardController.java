package com.example.demo_pj.board.controller;

import com.example.demo_pj.board.dto.BoardRequest;
import com.example.demo_pj.board.entity.Board;
import com.example.demo_pj.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173"
        ,methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.DELETE,
        RequestMethod.PUT,
        RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/v1/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public List<Board> getAllBoard() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public Board getBoard(@PathVariable Long id) {
        return boardService.getBoardbyId(id);

    }

    @PostMapping
    public void  addBoard(@RequestBody BoardRequest request) {
        boardService.save(request);
    }
}


package com.example.demo_pj.board.dto;

import com.example.demo_pj.board.entity.Board;

public record BoardRequest(
         String author,String content
) {
    public Board toEntity(){
        return Board.builder()
                .author(author).
                content(content)
                .build();
    }
}

package com.example.demo_pj.board.repository;

import com.example.demo_pj.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}

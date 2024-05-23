//package com.example.demo_pj.board.service;
//
//import com.example.demo_pj.board.dto.BoardRequest;
//import com.example.demo_pj.board.entity.Board;
//import com.example.demo_pj.board.repository.BoardRepository;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
////
//@ExtendWith(SpringExtension.class)
//class BoardServiceImplTest {
//    @InjectMocks
//    private  BoardServiceImpl boardService;
//    @Mock
//    private BoardRepository boardRepository;
//
//    @Test
//    void save() {
//        BoardRequest request = new BoardRequest("소성민","나도이제32살");
//        Board entity = request.toEntity();
//        BDDMockito.given(boardRepository.save(entity)).willReturn(entity);
//
//        boardService.save(request);
//
//        Mockito.verify(boardRepository, Mockito.times(1)).save(entity);
//
//
//    }
//
//    @Test
//    void getBoardbyId() {
//        BoardRequest request = new BoardRequest("소성민","나도이제32살");
//        Board post = boardRepository.save(request.toEntity());
//
//        Long id = post.getId();
//
//        Board byId = boardService.getBoardbyId(id);
//
////
//
//
////
//
//
//
//    }
//
//    @Test
//    void getAllBoards() {
//        BoardRequest request = new BoardRequest("소성민","나도이제32살");
//        Board post = boardRepository.save(request.toEntity());
//
//        List<Board> allBoards = boardService.getAllBoards();
//
//    }
//}
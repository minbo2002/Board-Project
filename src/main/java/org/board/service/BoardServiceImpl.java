package org.board.service;

import lombok.RequiredArgsConstructor;
import org.board.domain.Board;
import org.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper mapper;

    @Override
    public void register(Board board) throws Exception {
        mapper.create(board);
    }
}

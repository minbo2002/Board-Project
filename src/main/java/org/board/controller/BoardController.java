package org.board.controller;

import lombok.RequiredArgsConstructor;
import org.board.domain.Board;
import org.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    @GetMapping("/register")
    public void registerForm(Board board, Model model) throws Exception {

    }

    @PostMapping("/register")
    public String register(Board board, Model model) throws Exception {
        service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다");

        return "board/success";
    }
}

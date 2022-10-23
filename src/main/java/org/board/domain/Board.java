package org.board.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter
@EqualsAndHashCode(of = "boardNo")
@ToString
public class Board {

    private Long boardNo;

    private String title;
    private String writer;
    private String content;
    private LocalDateTime regDate;
}

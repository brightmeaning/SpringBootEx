package com.packjjo;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.packjjo.domain.WebBoard;
import com.packjjo.persistence.WebBoardRepository;

import lombok.extern.java.Log;
@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class BoardTests {
	
	@Autowired
	WebBoardRepository repo;
	
	@Test
	public void readBoard() {
		log.info(repo.findById(10L).toString());
	}
	
	@Test
    public void insertBoardDummies() {
		IntStream.range(0, 1000).forEach(i -> {
		WebBoard board = new WebBoard();
		board.setTitle("title" + i);
		board.setContent("content" + i);
		board.setWriter("Writer" + i);
		
		repo.save(board);
		});
	}
}

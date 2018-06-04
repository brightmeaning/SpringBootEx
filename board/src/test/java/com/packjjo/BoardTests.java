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
		log.info("list="+ repo.findById(10L).toString());
	}
	@Test
	public void insertBoardDummies() {

		IntStream.range(0, 300).forEach(i -> {

			WebBoard board = new WebBoard();

			board.setTitle("Sample Board Title " + i);
			board.setContent("Content Sample ..." + i + " of Board ");
			board.setWriter("user0" + (i % 10));

			repo.save(board);
		});

	}

}
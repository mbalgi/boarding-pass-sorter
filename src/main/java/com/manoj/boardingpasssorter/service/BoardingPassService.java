package com.manoj.boardingpasssorter.service;

import com.manoj.boardingpasssorter.domain.BoardingPass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardingPassService {

    List<BoardingPass> sortBoardingPasses(List<BoardingPass> boardingPasses);

}

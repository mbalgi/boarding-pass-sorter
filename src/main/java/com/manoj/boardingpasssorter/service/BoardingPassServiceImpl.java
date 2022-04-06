package com.manoj.boardingpasssorter.service;

import com.manoj.boardingpasssorter.domain.BoardingPass;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.manoj.boardingpasssorter.utils.BoardingPassSorterUtils.sortBoardingPassesUtil;

@Service
public class BoardingPassServiceImpl implements BoardingPassService {

    @Override
    public List<BoardingPass> sortBoardingPasses(List<BoardingPass> boardingPasses) {

        return sortBoardingPassesUtil(boardingPasses);

    }
}

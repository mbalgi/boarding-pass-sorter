package com.manoj.boardingpasssorter.utils;

import com.manoj.boardingpasssorter.domain.BoardingPass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardingPassSorterUtils {

    public static List<BoardingPass> sortBoardingPassesUtil(List<BoardingPass> unsortedBoardingPasses) {

        List<BoardingPass> sortedBoardingPasses = new ArrayList<>();

        Map<String, BoardingPass> unsortedBoardingPassesMap = new HashMap();

        Map<String, String> legs = new HashMap<>();
        for (BoardingPass boardingPass : unsortedBoardingPasses) {
            legs.put(boardingPass.getFrom(), boardingPass.getTo());
            unsortedBoardingPassesMap.put(boardingPass.getFrom(), boardingPass);
        }

        HashMap<String, String> reverseMap = new HashMap<>();

        //populate the  reverse map
        for (Map.Entry<String, String> inputMapEntry : legs.entrySet()) {
            reverseMap.put(inputMapEntry.getValue(), inputMapEntry.getKey());
        }

        //find the starting point of the trip
        String start = null;

        for (Map.Entry<String, String> inputMapEntry : legs.entrySet()) {
            if (!legs.containsValue(inputMapEntry.getKey())) {
                start = inputMapEntry.getKey();
            }
        }

        //Now since we know the start location lets construct the Sorted boarding passes list
        String to = legs.get(start);
        while (to != null) {
            sortedBoardingPasses.add(unsortedBoardingPassesMap.get(start));
            start = to;
            to = legs.get(start);
        }

        return sortedBoardingPasses;
    }
}

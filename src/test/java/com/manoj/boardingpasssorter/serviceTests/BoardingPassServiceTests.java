package com.manoj.boardingpasssorter.serviceTests;
import com.manoj.boardingpasssorter.BoardingPassSorterApplication;
import com.manoj.boardingpasssorter.domain.BoardingPass;
import com.manoj.boardingpasssorter.service.BoardingPassService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BoardingPassSorterApplication.class})
public class BoardingPassServiceTests extends TestCase {

    @Autowired
    private BoardingPassService boardingPassService;

    @Test
    public void TestBoardingPassesSorting() {

        //Given - List of unordered Boarding Passes
        List<BoardingPass> unsortedBoardingPasses = new ArrayList<>();
        unsortedBoardingPasses.add(new BoardingPass("Gerona Airport","Stockholm","flight","SK455","3A","45B", "344"));
        unsortedBoardingPasses.add(new BoardingPass("Madrid","Barcelona","train","78A","3A","45B", null));
        unsortedBoardingPasses.add(new BoardingPass("Stockholm","New York JFK","flight","SK22","7B","22", null));
        unsortedBoardingPasses.add(new BoardingPass("Barcelona","Gerona Airport","bus",null,null,null, null));

        //When - Sort service is called
        List<BoardingPass> actualSortedBoardingPasses = boardingPassService.sortBoardingPasses(unsortedBoardingPasses);

        //Then the response should be sorted boarding passes
        List<BoardingPass> expectedSortedBoardingPasses = new ArrayList<>();
        expectedSortedBoardingPasses.add(new BoardingPass("Madrid","Barcelona","train","78A","3A","45B", null));
        expectedSortedBoardingPasses.add(new BoardingPass("Barcelona","Gerona Airport","bus",null,null,null, null));
        expectedSortedBoardingPasses.add(new BoardingPass("Gerona Airport","Stockholm","flight","SK455","3A","45B", "344"));
        expectedSortedBoardingPasses.add(new BoardingPass("Stockholm","New York JFK","flight","SK22","7B","22", null));

        assert(expectedSortedBoardingPasses.equals(actualSortedBoardingPasses));

    }
}

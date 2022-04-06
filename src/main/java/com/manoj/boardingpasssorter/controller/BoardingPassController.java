package com.manoj.boardingpasssorter.controller;

import com.manoj.boardingpasssorter.DTO.BoardingPassDTO;
import com.manoj.boardingpasssorter.domain.BoardingPass;
import com.manoj.boardingpasssorter.service.BoardingPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BoardingPassController {

    @Autowired
    private BoardingPassService boardingPassService;

    @RequestMapping(method = RequestMethod.POST, value = "/boardingPass/sort")
    public List<BoardingPassDTO> sortBoardingPass(@RequestBody List<BoardingPassDTO> inputBoardingPassesDTOList) {
        //Convert Input DTO to Domain Object
        List<BoardingPass> inputBoardingPasses = convertBoardingPassDTOToDomain(inputBoardingPassesDTOList);

        //Convert back the domain object returned from service to DTO before responding
        return convertBoardingPassDomainToDTO(boardingPassService.sortBoardingPasses(inputBoardingPasses));
    }

    private List<BoardingPass> convertBoardingPassDTOToDomain(List<BoardingPassDTO> inputBoardingPassesDTOList) {
        List<BoardingPass> inputBoardingPasses = new ArrayList<>();
        for(BoardingPassDTO boardingPassInputDTO: inputBoardingPassesDTOList) {
            BoardingPass boardingPass = new BoardingPass();
            if (boardingPassInputDTO.getFrom() != null ){
                boardingPass.setFrom(boardingPassInputDTO.getFrom());
            }
            if (boardingPassInputDTO.getTo() != null ){
                boardingPass.setTo(boardingPassInputDTO.getTo());
            }
            if (boardingPassInputDTO.getTransportationType() != null ){
                boardingPass.setTransportationType(boardingPassInputDTO.getTransportationType());
            }
            if (boardingPassInputDTO.getTransportationNumber() != null ){
                boardingPass.setTransportationNumber(boardingPassInputDTO.getTransportationNumber());
            }
            if (boardingPassInputDTO.getSeat() != null ){
                boardingPass.setSeat(boardingPassInputDTO.getSeat());
            }
            if (boardingPassInputDTO.getGate() != null ){
                boardingPass.setGate(boardingPassInputDTO.getGate());
            }

            if (boardingPassInputDTO.getBaggage() != null ){
                boardingPass.setBaggage(boardingPassInputDTO.getBaggage());
            }

            inputBoardingPasses.add(boardingPass);
        }
        return inputBoardingPasses;
    }

    private List<BoardingPassDTO> convertBoardingPassDomainToDTO(List<BoardingPass> boardingPasses) {
        List<BoardingPassDTO> boardingPassesDTOList = new ArrayList<>();
        for(BoardingPass boardingPass: boardingPasses) {
            BoardingPassDTO boardingPassDTO = new BoardingPassDTO();
            if (boardingPass.getFrom() != null ){
                boardingPassDTO.setFrom(boardingPass.getFrom());
            }
            if (boardingPass.getTo() != null ){
                boardingPassDTO.setTo(boardingPass.getTo());
            }
            if (boardingPass.getTransportationType() != null ){
                boardingPassDTO.setTransportationType(boardingPass.getTransportationType());
            }
            if (boardingPass.getTransportationNumber() != null ){
                boardingPassDTO.setTransportationNumber(boardingPass.getTransportationNumber());
            }
            if (boardingPass.getSeat() != null ){
                boardingPassDTO.setSeat(boardingPass.getSeat());
            }
            if (boardingPass.getGate() != null ){
                boardingPass.setGate(boardingPass.getGate());
            }

            if (boardingPass.getBaggage() != null ){
                boardingPassDTO.setBaggage(boardingPass.getBaggage());
            }

            boardingPassesDTOList.add(boardingPassDTO);
        }
        return boardingPassesDTOList;
    }
}

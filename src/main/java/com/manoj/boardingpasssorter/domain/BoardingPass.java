package com.manoj.boardingpasssorter.domain;

import java.util.Objects;

public class BoardingPass {

    private String from;
    private String to;
    private String transportationType;
    private String transportationNumber;
    private String seat;
    private String gate;
    private String baggage;

    public BoardingPass() {
    }

    public BoardingPass(String from, String to, String transportationType, String transportationNumber, String seat, String gate, String baggage) {
        this.from = from;
        this.to = to;
        this.transportationType = transportationType;
        this.transportationNumber = transportationNumber;
        this.seat = seat;
        this.gate = gate;
        this.baggage = baggage;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public String getTransportationNumber() {
        return transportationNumber;
    }

    public void setTransportationNumber(String transportationNumber) {
        this.transportationNumber = transportationNumber;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", transportationType='" + transportationType + '\'' +
                ", transportationNumber='" + transportationNumber + '\'' +
                ", seat='" + seat + '\'' +
                ", gate='" + gate + '\'' +
                ", baggage='" + baggage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingPass that = (BoardingPass) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(transportationType, that.transportationType) &&
                Objects.equals(transportationNumber, that.transportationNumber) &&
                Objects.equals(seat, that.seat) &&
                Objects.equals(gate, that.gate) &&
                Objects.equals(baggage, that.baggage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, transportationType, transportationNumber, seat, gate, baggage);
    }
}

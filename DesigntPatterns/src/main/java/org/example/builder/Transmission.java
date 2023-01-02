package org.example.builder;

public class Transmission {
    private int gearsNumber;
    private TransmissionType type;

    public Transmission(int gearsNumber, TransmissionType type) {
        this.gearsNumber = gearsNumber;
        this.type = type;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    public TransmissionType getType() {
        return type;
    }

    public void setType(TransmissionType type) {
        this.type = type;
    }
}

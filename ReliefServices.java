package edu.ucalgary.oop;

import java.time.LocalDatel
import java.time.format.DateTimeFormatter;

public class ReliefService {
    private Inquirer[] inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private String lastKnownLocation;
    
    // Constructor
    public ReliefService(Inquirer[] inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, String lastKnownLocation) throws IllegalArgumentException {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = null;
        boolean isValid = true;
        try {
            parsedDate = LocalDate.parse(dateOfInquiry, formatter);
        } catch (Exception e) {
            isValid = false;
        }
        if (!isValid || parsedDate == null) {
            throw new IllegalArgumentException("Date must be in yyyy-MM-dd format");
        }
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }
    
    // Getters
    public Inquirer[] getInquirers() { return inquirer; }
    public DisasterVictim getMissingPerson() { return missingPerson; }
    public String getDateOfInquiry() { return dateOfInquiry; }
    public String getInfoProvided() { return infoProvided; }
    public String getLastKnownLocation() { return lastKnownLocation; }
    
    // Setters
    public void setInquirers(Inquirer[] inquirer) throws IllegalArgumentException { this.inquirer = inquirer; }
    public void setMissingPerson(DisasterVictim missingPerson) throws IllegalArgumentException { this.missingPerson = missingPerson; }
    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException { this.dateOfInquiry = dateOfInquiry; }
    public void setInfoProvided(String infoProvided) throws IllegalArgumentException { this.infoProvided = infoProvided; }
    public void setLastKnownLocation(String lastKnownLocation) throws IllegalArgumentException { this.lastKnownLocation = lastKnownLocation; }
}

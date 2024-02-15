package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter;

    //Constructor
    DisasterVictim(String firstName, String ENTRY_DATE){
        this.firstName = firstName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean isValid;
        try {
            LocalDate.parse(ENTRY_DATE, formatter);
            isValid = true;
        } catch (DateTimeParseException e) {
            isValid = false;
        }
        if (!isValid){
            throw new IllegalArgumentException("Date must be in yyyy-MM-dd format");
        }
        this.ENTRY_DATE = ENTRY_DATE;
        ASSIGNED_SOCIAL_ID = counter++;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getComments(){
        return comments;
    }

    public MedicalRecord[] getMedicalRecords(){
        return medicalRecords;
    }

    public String getEntryDate(){
        return ENTRY_DATE;
    }

    public int getAssignedSocialID(){
        return ASSIGNED_SOCIAL_ID;
    }

    public Supply[] getPersonalBelongings(){
        return personalBelongings;
    }

    public FamilyRelation[] getFamilyConnections(){
        return familyConnections;
    }

    public String getGender(){
        return gender;
    }

    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName; 
    }

    public void setDateOfBirth(String dateOfBirth){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean isValid;
        try {
            LocalDate.parse(dateOfBirth, formatter);
            isValid = true;
        } catch (DateTimeParseException e) {
            isValid = false;
        }
        if (!isValid){
            throw new IllegalArgumentException("Date must be in yyyy-MM-dd format");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public void setComments(String comments){
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords){
        this.medicalRecords = medicalRecords;
    }

    public void setPersonalBelongings(Supply[] supplies){
        this.personalBelongings = supplies;
    }

    public void setFamilyConnections(FamilyRelation[] relation){
        this.familyConnections = relation;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    //Methods
    public void addPersonalBelonging(Supply supply){
        if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        } else {
            Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
            System.arraycopy(personalBelongings, 0, newPersonalBelongings, 0, personalBelongings.length);
            newPersonalBelongings[personalBelongings.length] = supply;
            personalBelongings = newPersonalBelongings;
        }
    } 
    
    public void removePersonalBelonging(Supply supply){
        if (personalBelongings != null) {
            int index = -1;
            for (int i = 0; i < personalBelongings.length; i++) {
                if (personalBelongings[i].equals(supply)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                Supply[] newPersonalBelonging = new Supply[personalBelongings.length - 1];
                System.arraycopy(personalBelongings, 0, newPersonalBelonging, 0, index);
                if (index < personalBelongings.length - 1) {
                    System.arraycopy(personalBelongings, index + 1, newPersonalBelonging, index, personalBelongings.length - index - 1);
                }
                personalBelongings = newPersonalBelonging;
            }
        }
    }

    public void addFamilyConnection(FamilyRelation familyConnection){
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        } else {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
            System.arraycopy(familyConnections, 0, newFamilyConnections, 0, familyConnections.length);
            newFamilyConnections[familyConnections.length] = familyConnection;
            familyConnections = newFamilyConnections;
        }
    }

    public void removeFamilyConnection(FamilyRelation familyConnection){
        if (familyConnections != null) {
            int index = -1;
            for (int i = 0; i < familyConnections.length; i++) {
                if (familyConnections[i].equals(familyConnection)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length - 1];
                System.arraycopy(familyConnections, 0, newFamilyConnections, 0, index);
                if (index < familyConnections.length - 1) {
                    System.arraycopy(familyConnections, index + 1, newFamilyConnections, index, familyConnections.length - index - 1);
                }
                familyConnections = newFamilyConnections;
            }
        }
    }

    public void addMedicalRecord(MedicalRecord medicalRecord){
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
            System.arraycopy(medicalRecords, 0, newMedicalRecords, 0, medicalRecords.length);
            newMedicalRecords[medicalRecords.length] = medicalRecord;
            medicalRecords = newMedicalRecords;
        }
    }


}

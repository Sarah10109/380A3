package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationTo;

    /*Constructors*/

    public FamilyRelation(DisasterVictim personOne, String relationTo, DisasterVictim personTwo) throws IllegalArgumentException{
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationsTo = relationsTo;
    }

    /* Setters */

    public void setpersonOne(DisasterVictim personOne) throws IllegalArgumentException {
        this.personOne = personOne;
    }

    public void setpersonTwo(DisasterVictim personTwo) throws IllegalArgumentException {
        this.personTwo = personTwo;
    }

    public void setrelationTo(String relationTo) throws IllegalArgumentException {
        this.relationTo = relationTo;
    }

    /* Getters */

    public DisasterVictim getpersonOne() { return this.personOne; }
    public DisasterVictim getpersonTwo() { return this.personTwo; }
    public String getrelationTo() { return this.relationsTo; }

}
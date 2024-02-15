package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    //Constructor
    Location(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public DisasterVictim[] getOccupants(){
        return occupants;
    }

    public Supply[] getSupplies(){
        return supplies;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setOccupants(DisasterVictim[] occupants){
        this.occupants = occupants;
    }

    public void setSupplies(Supply[] supplies){
        this.supplies = supplies;
    }

    //Methods
    public void addOccupant(DisasterVictim occupant){
        if (occupants == null){
            occupants = new DisasterVictim[1];
            occupants[0] = occupant;
        } else{
            DisasterVictim[] newOccupants = new DisasterVictim[occupants.length + 1];
            System.arraycopy(occupants, 0, newOccupants, 0, occupants.length);
            newOccupants[occupants.length] = occupant;
            occupants = newOccupants;
        }
    }

    public void removeOccupant(DisasterVictim occupant){
        if (occupants != null) {
            int index = -1;
            for (int i = 0; i < occupants.length; i++) {
                if (occupants[i].equals(occupant)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
                System.arraycopy(occupants, 0, newOccupants, 0, index);
                if (index < occupants.length - 1) {
                    System.arraycopy(occupants, index + 1, newOccupants, index, occupants.length - index - 1);
                }
                occupants = newOccupants;
            }
        }
    }
    
    public void addSupply(Supply supply) {
        if (supplies == null) {
            supplies = new Supply[1];
            supplies[0] = supply;
        } else {
            Supply[] newSupplies = new Supply[supplies.length + 1];
            System.arraycopy(supplies, 0, newSupplies, 0, supplies.length);
            newSupplies[supplies.length] = supply;
            supplies = newSupplies;
        }
    }

    public void removeSupply(Supply supply) {
        if (supplies != null) {
            int index = -1;
            for (int i = 0; i < supplies.length; i++) {
                if (supplies[i].equals(supply)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                Supply[] newSupplies = new Supply[supplies.length - 1];
                System.arraycopy(supplies, 0, newSupplies, 0, index);
                if (index < supplies.length - 1) {
                    System.arraycopy(supplies, index + 1, newSupplies, index, supplies.length - index - 1);
                }
                supplies = newSupplies;
            }
        }
    } 
}

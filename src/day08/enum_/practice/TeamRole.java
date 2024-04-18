package day08.enum_.practice;

enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");


    private final String mission;

    TeamRole(String mission){
        this.mission= mission;
    }
    public String getMission() {
        return mission;
    }

}

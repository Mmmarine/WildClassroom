class Wilder {
    // attributs
    private String firstName; 
    private boolean aware;

    // constructeurs
    public Wilder (String name, boolean awareValue){
        this.firstName = name;
        this.aware = awareValue;
    }

    // getters
    public String getFirstName(){
        return this.firstName;
    }
    public boolean isAware() {
        return this.aware;
    }


    //méthode whoAmI

    public String whoAmI() {
            if (aware == true) {
                return "Je m'appelle " + this.firstName + " et je suis aware";
            }
            else{
                return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
            }   
    }

}
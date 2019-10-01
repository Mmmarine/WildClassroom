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
    
    //setters
    public void setAwre(int aware) {
        this.aware = aware;
    }
    
    public void setFirstName(int firstName) {
        this.firstName = firstName;
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

/**
 * WildlifeSimulator - Manages population dynamics for multiple species
 * Uses an array of Species objects to store and simulate species data
 */
public class WildlifeSimulator {
    private Species[] species;
    private int speciesCount;
    
    public WildlifeSimulator(int maxSpecies) {
        //TODO
        species = new Species[maxSpecies];
    }
    
    /**
     * Add a species to the simulator
     */
    public void addSpecies(Species s) {
        //TODO
        species[speciesCount] = s;
        speciesCount++;
    }
    
    /**
     * Simulate one year of population changes for all species
     */
    public void simulateYear() {
        //TODO
        for(int i = 0; i < speciesCount; i++){
            species[i].simulateYear();
        }
    }
    
    /**
     * Simulate multiple years
     */
    public void simulate(int years) {
        //TODO
        for(int i = 0; i < years; i++){
            simulateYear();
        }
    }
    
    /**
     * Get species at given index
     */
    public Species getSpecies(int index) {
        //TODO
        return species[index];
    }
    
    /**
     * Get species info as formatted string
     */
    public String getSpeciesInfo(int index) {
        return species[index].toString();
    }

    public String toString(){
        String m = "";
        for(Species s : species){
            if(s != null)
            m+=s.toString() +"/n";
        }
        return m;
    }
    
    public String toString(){
        String m = "";
        for(Species s: species){
            if(s != null);
                m += s.toString() + "/n";
        }
        return m;
    }
    /**
     * Get total wildlife count across all species
     */
    public double getTotalPopulation() {
        //TODO
        int x = 0;
        for(int i = 0; i < speciesCount; i++){
            x+=species[i].getPopulation();
        }
        return x;
    }
    
    /**
     * Find the species with largest population
     */
    public int getMostPopulousIndex() {
        //TODO
        int maxPopIndex = 0;
        for(int i = 1; i <this.speciesCount; i++){
            if(this.species[maxPopIndex])
        }
        return -1;
    }
    
    /**
     * Find the species with smallest population (most endangered)
     */
    public int getMostEndangeredIndex() {
        //TODO
        return -1;
    }
    
    public int getSpeciesCount() {
        return speciesCount;
    }
    
    /**
     * Get array of all species
     */
    public Species[] getSpeciesArray() {
        return species;
    }
}

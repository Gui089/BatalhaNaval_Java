public class DotCom {

    private int[] locationsCelss;
    private int numOfHits;
    
    public DotCom() {
    }

    public DotCom(int[] locationsCelss, int numOfHits) {
        this.locationsCelss = locationsCelss;
        this.numOfHits = numOfHits;
    }

    public int[] getLocationsCelss() {
        return locationsCelss;
    }

    public void setLocationsCelss(int[] locationsCelss) {
        this.locationsCelss = locationsCelss;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for(int cell : getLocationsCelss()){
            if(guess == cell) {
                result = "hit";

                numOfHits++;

                break;
            }
        }
        if(numOfHits == getLocationsCelss().length){
            result = "kill";
        }

        System.out.println(result);
        
        return result;

    }
    
    

}
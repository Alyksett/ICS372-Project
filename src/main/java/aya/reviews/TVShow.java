package aya.reviews;

public class TVShow extends Media {

    private int numSeasons;

    public TVShow(String name, String description, int numSeasons){
        super(name, description);
        setNumSeasons(numSeasons);
    }
    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }
}

public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public void print(int copies){
        if (this.paper >= copies && this.toner >= copies){
            this.paper -= copies;
            this.toner -= copies;
        }
    }

    public void addPaper(int paper){
        this.paper += paper;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }
}

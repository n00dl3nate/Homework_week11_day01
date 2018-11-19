public class Container {
    private int volume;

    public Container(){
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink() {
        if (this.volume >= 10) {
            this.volume -= 10;
        }
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }


}


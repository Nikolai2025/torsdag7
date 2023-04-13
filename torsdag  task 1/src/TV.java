public class TV {
    private boolean turnOn;
    private int setVolume;
    private int Channel;

    public TV() {
        this.turnOn = false;
        this.setVolume = 0;
        this.Channel = 0;
    }

    public void turnOn() {
        this.turnOn = true;
    }

    public void turnOff() {
        this.turnOn = false;
    }

    public void setVolume(int volume) {
        if (this.turnOn) {
            this.setVolume = volume;
        }
    }

    public void setChannel(int setChannel) {
        if (this.turnOn) {
            this.Channel = setChannel;
        }
    }

    public boolean getTurnOn() {
        return this.turnOn;
    }


    public int getVolume() {
        return this.setVolume;
    }
    public int getChannel(){
        return this.Channel;
    }


    public int channelUp() {
        if (this.turnOn){
        this.Channel++;}
        return this.Channel;
    }

}


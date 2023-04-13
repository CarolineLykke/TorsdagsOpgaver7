package Opgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    TV tv1 = new TV();
    TV tv2 = new TV();

    @Test
    void turnOn() {
        tv1.turnOn();
        tv2.turnOn();
    }

    @Test
    void turnOff() {
    }

    @Test
    void setChannel() {
        tv1.setChannel(30);
    }

    @Test
    void channelUp() {
        tv2.channelUp();
        tv2.channelUp();
    }

    @Test
    void channelDown() {
    }

    @Test
    void setVolume() {
        tv1.setVolume(3);
    }

    @Test
    void volumeUp() {
        tv2.volumeUp();
    }

    @Test
    void volumeDown() {
    }
}
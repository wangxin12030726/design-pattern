package abstractfactory.demo1;


public class AMDCpu implements CPUApi {
    private int pins  = 0;

    public AMDCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("AMD cpu ,this pins is " + pins);
    }
}

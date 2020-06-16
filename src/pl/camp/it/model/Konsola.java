package pl.camp.it.model;

public enum Konsola {
    PS(4000,
            "GU100",
            "Sony PlayStation",
            "4"),
    XBOX(3800,
            "GU100",
            "Microsoft XBox",
            "One"),
    NINTENDO(2000,
            "GU100",
            "Nintendo",
            "Swich");

    private int processorClock;
    private String gpuName;
    private String brand;
    private String model;

    Konsola(int processorClock, String gpuName, String brand, String model) {
        this.processorClock = processorClock;
        this.gpuName = gpuName;
        this.brand = brand;
        this.model = model;
    }

    public int getProcessorClock() {
        return processorClock;
    }

    public void setProcessorClock(int processorClock) {
        this.processorClock = processorClock;
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

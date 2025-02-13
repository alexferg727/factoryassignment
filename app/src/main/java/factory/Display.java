package factory;

public class Display implements DisplayInterface{
    
    private int verticalResolution;
    private int refreshRate;
    private int bitsPerPixel;
    private int horizontalResolution;
    private String brand;
    private String model;
    private String displayTechnology;
    private String[] connectors;

    public Display(int verticalResolution,int refreshRate, int bitsPerPixel, int horizontalResolution,String brand,String model,String displayTechnology, String[] connectors){

        this.verticalResolution = verticalResolution;
        this.refreshRate = refreshRate;
        this.bitsPerPixel = bitsPerPixel;
        this.horizontalResolution = horizontalResolution;
        this.brand = brand;
        this.model = model;
        this.displayTechnology = displayTechnology;
        this.connectors = connectors;
    }

    @Override
    public int getConnectorsAmount(String typeOfConnection){
        int amount = 0;
        for (String connector:  connectors){
            if (connector.equals(typeOfConnection)){
                amount++;
            }
        }
        return amount;
    }

    @Override
    public int getHorizontalResolution(){
        return this.horizontalResolution;
    }

    
    @Override
    public int getVerticalResolution(){
        return this.verticalResolution;
    }

    
    @Override
    public int getRefreshRate(){
        return this.refreshRate;
    }

    
    @Override
    public int getBitsPerPixel(){
        return this.bitsPerPixel;
    }

    
    @Override
    public String getBrand(){
        return this.brand;
    }
    
    @Override
    public String getModel(){
        return this.model;
    }
    
    @Override
    public String getDisplay(){
        return this.displayTechnology;
    }

}

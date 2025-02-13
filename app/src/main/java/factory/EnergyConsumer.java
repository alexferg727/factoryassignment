package factory;

public interface EnergyConsumer {
    
    double getVoltage();
    double getCurrent();
    default double yearlyPowerConsumptionInKilowattHour(){
        return (getVoltage() * getVoltage() * 24 * 365)/1000;
    }
}

package POO.polimorfismoAndHeranca.aulas;

public non-sealed class Salesman extends Employee {
    private double PercentPerSold;

    public double getPercentPerSold() {
        return PercentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        PercentPerSold = percentPerSold;
    }
    @Override
    public String getCode(){
        return "SL" + super.getCode();
    }
}

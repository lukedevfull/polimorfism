package employees;

public non-sealed class Saleman extends EmployeeModel {
    private final float percentForSale = 0.10f;
    private float saleAmount;

    public Saleman (String name,
                    String address,
                    String code,
                    String age,
                    double salary,
                    float saleAmount){
        super(name, address, code, age, salary);
        this.saleAmount = saleAmount;
    }
    public Saleman(){} //Empty constructor



    //Getters
    public float getPercentForSale() {
        return percentForSale;
    }

    @Override
    public String getCode() {
        return "SALE" + super.getCode();
    }

    public float getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(float saleAmount) {
        this.saleAmount = saleAmount;
    }

    @Override
    public void getFullSalary() {
        System.out.printf("Full Salary of Saleman = %.2f\n", (getSalary() + (getSaleAmount() * getPercentForSale())));
    }

}

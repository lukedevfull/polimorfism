package employees;

public non-sealed class Manager extends EmployeeModel {
    private String login;
    private String password;
    private float commission;
    private int yearsOfExperience;


    public Manager (String name,
                    String address,
                    String code,
                    String age,
                    double salary,
                    String login,
                    String password,
                    int yearsOfExperience){
        super(name, address, code, age, salary);
        
        this.login = login;
        this.password = password;
        this.yearsOfExperience = yearsOfExperience;
    }
    public Manager() {} //Empty constructor

    //Getters and Setters
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public float getCommission() {
        return commission;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String getCode() {
        return "MANG" + super.getCode();
    }

    public void setAutoCommission() {
        switch (getYearsOfExperience()) {
            case 0 -> commission = 0.10f;
            case 1 -> commission = 0.15f;
            case 2 -> commission = 0.20f;
            case 3 -> commission = 0.25f;
            case 4 -> commission = 0.30f;
            case 5 -> commission = 0.35f;
            default -> commission = 0.40f;
        }
    }

    @Override
    public void getFullSalary() {
        System.out.printf("Full salary = %.2f\n", (getSalary() + (getSalary() * getCommission())));
    }
    
}

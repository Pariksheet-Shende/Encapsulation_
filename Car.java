public class Car {

    private String company ;
    private String model ;
    private String color ;
    private int doors ;
    private boolean convertible ;

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setCompany(String company) {

        if (company == null) company = "Unknown";
        String lowercaseMake = company.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.company = company;
            default -> {
                this.company = "Unsupported ";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(getDoors()+ "-Door " +
                getCompany() + " " +
                getColor() + " " +
                getModel() + " " +
                (convertible ? "Convertible" : ""));
    }
}

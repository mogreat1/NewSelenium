package sdet;

public class CustomerDetails {

    private String courseName;
    private String purchasedDeta;
    private int Amount;
    private String Location;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPurchasedDeta() {
        return purchasedDeta;
    }

    public void setPurchasedDeta(String purchasedDeta) {
        this.purchasedDeta = purchasedDeta;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}

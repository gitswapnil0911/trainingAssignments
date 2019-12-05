public class ContactDetails {
    String mobile;
    String landl;

    public ContactDetails(){}

    public ContactDetails(String mobile, String landl) {
        this.mobile = mobile;
        this.landl = landl;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandl() {
        return landl;
    }

    public void setLandl(String landl) {
        this.landl = landl;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "mobile='" + mobile + '\'' +
                ", landl='" + landl + '\'' +
                '}';
    }
}

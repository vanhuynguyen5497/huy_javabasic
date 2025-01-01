package JavaBasic.ham;

public class Dulieu {

    public static String company_name = "Công ty tin học cổ phần Lạc Việt";
    public static String adress = "6 Lê Lợi, Vĩnh Ninh, tp Huế";
    public static String phone = "0899346777";
    public static String email = "lacviet@yopmail.com";

    public static void getInfoCompany() {
        System.out.println("Company Name: " + company_name);
        System.out.println("Adress: " + adress);
        System.out.println("Phone: " + phone);
        System.out.println("email " + email);
    }

    public static String getCompany_name() {
        return company_name;
    }

    public static String getEmail() {
        return email;
    }
}

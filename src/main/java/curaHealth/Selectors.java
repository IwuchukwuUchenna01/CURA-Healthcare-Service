package curaHealth;

public interface Selectors {
    public String siteurl = "https://katalon-demo-cura.herokuapp.com/";

    public String makeAppointmentButton = "btn-make-appointment";
    public String username = "txt-username";

    public String password = "txt-password";
    public String loginButton = "btn-login";

    public  String selectFacility = "combo_facility";
    public String centerChoice = "[value='Hongkong CURA Healthcare Center']";
    public String checkHospitalReadMission = "chk_hospotal_readmission";
    public String programMedicaid = "radio_program_medicaid";
    public String visitDate = "txt_visit_date";
    public String textAreaComment = "txt_comment";
    public String bookAppointment = "btn-book-appointment";
    public String homePage = "[href='https://katalon-demo-cura.herokuapp.com/']";
    public String hamburgerMenu = "menu-toggle";
    public String sidebar = "sidebar-wrapper";
    public String logoutButton = "[href='authenticate.php?logout']";

}

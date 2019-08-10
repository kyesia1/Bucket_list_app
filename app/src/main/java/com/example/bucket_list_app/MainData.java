package com.example.bucket_list_app;

public class MainData {

    private int CV_image;
    private String Cv_TextView_title;
    private String Cv_TextView_content;
    private String Cv_TextView_importation;
    private String Cv_TextView_Dday;

    public MainData(int CV_image, String cv_TextView_title, String cv_TextView_content, String cv_TextView_importation, String cv_TextView_Dday) {
        this.CV_image = CV_image;
        Cv_TextView_title = cv_TextView_title;
        Cv_TextView_content = cv_TextView_content;
        Cv_TextView_importation = cv_TextView_importation;
        Cv_TextView_Dday = cv_TextView_Dday;
    }


    public int getCV_image() {
        return CV_image;
    }

    public void setCV_image(int CV_image) {
        this.CV_image = CV_image;
    }

    public String getCv_TextView_title() {
        return Cv_TextView_title;
    }

    public void setCv_TextView_title(String cv_TextView_title) {
        Cv_TextView_title = cv_TextView_title;
    }

    public String getCv_TextView_content() {
        return Cv_TextView_content;
    }

    public void setCv_TextView_content(String cv_TextView_content) {
        Cv_TextView_content = cv_TextView_content;
    }

    public String getCv_TextView_importation() {
        return Cv_TextView_importation;
    }

    public void setCv_TextView_importation(String cv_TextView_importation) {
        Cv_TextView_importation = cv_TextView_importation;
    }

    public String getCv_TextView_Dday() {
        return Cv_TextView_Dday;
    }

    public void setCv_TextView_Dday(String cv_TextView_Dday) {
        Cv_TextView_Dday = cv_TextView_Dday;
    }
}

package vn.ptt.designpattern.DependencyInjection;

public class Weather {
    private String description;

    public Weather() {
        this.description = "Rain";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

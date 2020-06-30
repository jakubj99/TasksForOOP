package pl.wsb.devices;

import java.util.List;

public class InstallAnApp {

    public String name;
    public String version;
    public String http;
    public Double priceOfApp;
    private final static String defaultHttpAddress = "wsb.pl";
    private final Double defaultPrice = 0.0;
    private final static String defaultVersionName = "1.0";

    public InstallAnApp(String name) {
        this.name = name;
        this.http = defaultHttpAddress;
        this.priceOfApp = defaultPrice;
        this.version = defaultVersionName;

    }

    public InstallAnApp(String name, String version) {
        this.name = name;
        this.version = version;
        this.http = defaultHttpAddress;
        this.priceOfApp = defaultPrice;
    }

    public InstallAnApp(String name, String version, String http, Double priceOfApp) {
        this.name = name;
        this.version = version;
        this.http = http;
        this.priceOfApp = priceOfApp;
    }

    public InstallAnApp(List<String> listOfApps) {}

}

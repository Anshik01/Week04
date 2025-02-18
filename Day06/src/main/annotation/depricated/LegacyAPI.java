package annotation.depricated;

public class LegacyAPI {
    @Deprecated
    public String oldFeature(){
        return "This is an old feature do not use it.";
    }

    public String newFeature(){
        return "This is a new feature you can use this.";
    }
}

package depricated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();
        System.out.println(legacyAPI.oldFeature());     // this method will show warning because of @deprecated
        System.out.println(legacyAPI.newFeature());
    }
}

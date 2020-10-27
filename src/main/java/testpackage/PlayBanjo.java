package testpackage;

public class PlayBanjo {

    public static String banjo(String name){
        char firstChar = name.charAt(0);
        if(name.charAt(0) == 'r'){
            return name + " plays banjo";
        }
        else if(name.charAt(0) == 'R'){
            return name + " plays banjo";
        }
        else {
            return name + " does not play banjo";
        }

    }

}

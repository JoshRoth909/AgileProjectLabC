package testpackage;

public class Agile {

    public static String banjo(String name){

        if(name == ""){
            return name + " does not play banjo";
        }
        else if(name.charAt(0) == 'R' || name.charAt(0) == 'r'){
            return name + " plays banjo";
        }
        else {
            return name + " does not play banjo";
        }

    }
}

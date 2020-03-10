
public class GoLessiego {
    public static class Main {

    public static void main(String[] args) {
        double gewicht =20;
        double letzesMal = 24;
        boolean verträgtSich = true;
        double spaziergang = wieweitistLessiegegangen(gewicht, letzesMal,verträgtSich);

        //Hund Lessie - 20 kg - spielfreudig, löst kriminalfälle

        wieweitistLessiegegangen(12, 24, true);


        System.out.println(" Mit anderem Lessie wird " + spaziergang + " km gegangen ");
    }

}

    public static double wieweitistLessiegegangen(double gewicht, double letztesMal, boolean verträgtSich) {

        double spaziergang =0;

        if (gewicht < 1 && verträgtSich == false) {
            spaziergang = 2;
        } else if (gewicht < 1 && verträgtSich == true) {
            spaziergang = 4;
        } else if (gewicht > 15 || letztesMal > 24 && verträgtSich == true) {
            spaziergang = 8;
        } else {
            spaziergang = 5;
        }
        return spaziergang;




    }
}




import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Fifi");
//        arrayList.add("Luiza");
//        arrayList.add("Patryk");
//        arrayList.add("Oskar");
//        arrayList.add("Adrian");
//        arrayList.add("Janek");
//        arrayList.add("Maciek");
//        arrayList.add("Stasiu");
//        arrayList.add("Kuba");
//        arrayList.add("Dymitry");
//
//
//        arrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//        System.out.println(arrayList);
//
//        arrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(arrayList);
//
//        arrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()==o2.length()){
//                    return o1.compareTo(o2);
//                }
//                else {
//                    return o1.length()-o2.length();
//                }
//            }
//        });
//        System.out.println(arrayList);
        Druzyna Śląsk = new Druzyna("DrużynaA");
        Druzyna Zagłębie = new Druzyna("DrużynaB");
        Druzyna Lech = new Druzyna("DrużynaC");

        Mecz meczŚZ = new Mecz(Śląsk,Zagłębie,1);
        Mecz meczZŚ = new Mecz(Śląsk,Zagłębie,-1);

        Mecz meczZL = new Mecz(Zagłębie,Lech,1);
        Mecz meczLZ = new Mecz(Zagłębie,Lech,-1);

        Mecz meczŚL = new Mecz(Śląsk,Lech,0);
        Mecz meczLŚ = new Mecz(Śląsk,Lech,0);

        ArrayList<Mecz> meczeŚląska = new ArrayList<>();
        meczeŚląska.add(meczŚZ);
        meczeŚląska.add(meczŚL);

        ArrayList<Mecz> meczeZagłebia = new ArrayList<>();
        meczeZagłebia.add(meczZŚ);
        meczeZagłebia.add(meczZL);

        ArrayList<Mecz> meczeLecha = new ArrayList<>();
        meczeLecha.add(meczLZ);
        meczeLecha.add(meczLŚ);

        System.out.println(meczeLecha);


        ArrayList<Druzyna> druzyny = new ArrayList<>();
        druzyny.add(Śląsk);
        druzyny.add(Zagłębie);
        druzyny.add(Lech);

        System.out.println(meczeŚląska.get(1));

//        druzyny.sort(new Comparator<Druzyna>() {
//            @Override
//            public int compare(Druzyna o1, Druzyna o2) {
//                druzynaA =
//            }
//        });


    }
}
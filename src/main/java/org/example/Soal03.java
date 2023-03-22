package org.example;

public class Soal03 {

    public static String kalimat1 = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
    public static String kalimat2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";
    public static String kalimat3 = "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";
    public static String Tag = ":T2:";
    public static String T1One = ":T1:202112SOAL3";
    public static String T1Two = ":T1:202111SOAL3";
    public static String T1Three = ":T1:202110SOAL3";

    public static void main(String[] args) {
        callString(T1One);
        callString(T1Two);
        callString(T1Three);
    }

    public static void potongKata(String subjectKalimat, String t2) {
        int panjang = subjectKalimat.length();
        int jmlBaris = (int) Math.ceil((double) panjang / 18);
        String[] hasil = new String[jmlBaris];
        for (int i = 0; i < jmlBaris; i++) {
            int awal = i * 18;
            int akhir = (i + 1) * 18;
            if (akhir > panjang) {
                akhir = panjang;
            }
            hasil[i] = subjectKalimat.substring(awal, akhir);
        }
        System.out.print(t2+ hasil[2] + hasil[3] + hasil[4] + hasil[0] + hasil[1]);
    }
    public static void callString(String tSatu){
        if(tSatu.equals(T1One)){
            System.out.println(T1One);
            potongKata(kalimat1, Tag);
            System.out.println("\n");
        }else if(tSatu.equals(T1Two)){
            System.out.println(T1Two);
            potongKata(kalimat2, Tag);
            System.out.println("\n");
        }else{
            System.out.println(T1Three);
            potongKata(kalimat3, Tag);
        }
    }


}

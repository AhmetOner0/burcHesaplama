package patikadev;
import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int gun,ay;
        String burc ="";
        boolean isError = false;

        System.out.print("doğduğunuz ayı giriniz:");
        ay = inp.nextInt();
        System.out.print("doğduğunuz günü giriniz:");
        gun = inp.nextInt();

        switch (ay){
            case 1:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc = "oğlak";
                    }else {
                        burc = "kova";
                    }
                }else isError = true;
                break;

            case 2:
                if (gun >=1 && gun <=28){
                    if (gun < 20){
                        burc = "kova";
                    }else {
                        burc = "balık";
                    }
                }else isError = true;
                break;

            case 3:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc = "balık";
                    }else {
                        burc = "koç";
                    }
                }else isError = true;
                break;

            case 4:
                if (gun >=1 && gun <=30){
                    if (gun < 22){
                        burc = "koç";
                    }else {
                        burc = "boğa";
                    }
                }else isError = true;
                break;

            case 5:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc = "boğa";
                    }else {
                        burc = "ikizler";
                    }
                }else isError = true;
                break;

            case 6:
                if (gun >=1 && gun <=30){
                    if (gun < 22){
                        burc = "ikizler";
                    }else {
                        burc = "yengeç";
                    }
                }else isError = true;
                break;

            case 7:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc= "yengeç";
                    }else {
                        burc = "aslan";
                    }
                }else isError = true;
                break;

            case 8:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc = "aslan";
                    }else {
                        burc = "başak";
                    }
                }else isError = true;
                break;

            case 9:
                if (gun >=1 && gun <=30){
                    if (gun < 22){
                        burc = "başak";
                    }else {
                        burc = "terazi";
                    }
                }else isError = true;
                break;

            case 10:
                if (gun >=1 && gun <=31){
                    if (gun < 22){
                        burc = "terazi";
                    }else {
                        burc = "akrep";
                    }
                }else isError = true;
                break;

            case 11:
                if (gun >=1 && gun <=30){
                    if (gun < 22){
                        burc = "akrep";
                    }else {
                        burc = "yay";
                    }
                }else isError = true;
                break;

            case 12:
                if (gun >= 1 && gun <= 31){
                    if (gun < 22){
                        burc = "yay";
                    }else {
                        burc = "oğlak";
                    }
                }else isError = true;
                break;
                
            default:
                isError = true;

        }
        if (isError){
            System.out.println("hatalı giriş yaptınız!!");;
        }else {
            System.out.println("burcunuz:"+burc);
        }
    }
}

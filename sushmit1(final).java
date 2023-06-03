import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;

class watch {
    static Scanner sc = new Scanner(System.in);
    String name;
    String display;
    double display_size;
    String battery;
    int price;
    static watch object;

     @Override
     public String toString() {
     System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("|                        OVERVIEW                        |");
        System.out.println("----------------------------------------------------------");
        System.out.println("Name : " + watch.object.name);
        System.out.println("Display : " + watch.object.display);
        System.out.println("Dislpay Size : " + watch.object.display_size);
        System.out.println("Battery : " + watch.object.battery);
        System.out.println("price : " + watch.object.price);
        System.out.println();

        System.out.println(
                "If you want to buy then enter 1 or If you want to change the product then enter 2 or exit for 3");
               
                qwerty.bu();
     return " ";

     }

    // watch(String name,String display,double display_size,String battery)
    // {
    // this.name=name;
    // this.display=display;
    // this.display_size=display_size;
    // this.battery=battery;

    // }

    

    public static void type() {
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "|                                              WELLCOME TO SPWATCH                                           |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(" Choose the type of watch");
        System.out.println();
        System.out.println("1:Smart watch");
        System.out.println("2:Analog watch");
        System.out.println("3:Digital watch");
        System.out.println("4:Sport watch");

        int type = sc.nextInt();
        switch (type) {
            case 1:
                Smartwatch.smartwatch();
                break;
            case 2:
                Analog.analog();
                break;
            case 3:
                Digital.digital();
                break;
            case 4:
                Sport.sport();
                break;
        }
        if (type != 1 && type != 2 && type != 3 && type != 4) {
            System.out.println("   please give right input as mentioned above");
            type(); // method recursion
        }

    }
}

class Smartwatch extends watch {
    public static void smartwatch() {
        System.out.println();
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "|                                             WHICH COMPANY DO YOU WANT                                          |");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose the comapny ");
        System.out.println();
        System.out.println("1:Noise");
        System.out.println("2:Boat");
        System.out.println("3:Firebolt");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int smartwatch = sc.nextInt();
        switch (smartwatch) {
            case 1:
                Noise.noise();
                break;
            case 2:
                Boat.boat();
                break;
            case 3:
                Firebolt.firebolt();
                break;
            case 0:
                watch.type();
                break;
            case 4:
                System.exit(0);

        }
        if (smartwatch != 1 && smartwatch != 2 && smartwatch != 3 && smartwatch != 0 && smartwatch != 4) {
            System.out.println("   please give right input as mentioned above");
            smartwatch(); // method recursion
        }

    }
}

class Noise extends Smartwatch {
    public static void noise() {

        System.out.println();
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "|                                                      RANGE                                                |");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int noise = sc.nextInt();
        switch (noise) {
            case 1:
                N1000_2000.n1000_2000();
                break;
            case 2:
                N2000_3000.n2000_3000();
                break;
            case 3:
                N3000_4000.n3000_4000();
                break;
            case 0:
                Smartwatch.smartwatch();
                break;
            case 4:
                System.exit(0);

        }
        if (noise != 1 && noise != 2 && noise != 3 && noise != 0 && noise != 4) {
            System.out.println("   please give right input as mentioned above");
            noise(); // method recursion
        }

    }
}

class N1000_2000 extends Noise {
    public static void n1000_2000() {
        System.out.println();
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        System.out.println(
                "|                                                 SMARTWATCH                                         |");
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                                     Price");
        System.out.println("1: ColorFit Pulse 2 Max(LCD)                    Rs-2000");
        System.out.println("2: ColorFit Icon 2 (LCD)                        Rs-1800");
        System.out.println("3: ColorFit Icon Buzz(LCD)                      Rs-1600");
        System.out.println("4: ColorFit Qube O2 (LCD)                       Rs-1299");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int n1000_2000 = sc.nextInt();
        switch (n1000_2000) {
            case 1:
                watch.object = new ColorFit_pulse_2_max();
                System.out.println(watch.object);
                break;
            case 2:
                watch.object = new ColorFit_Icon();
                System.out.println(watch.object);
                break;
            case 3:
                watch.object = new ColorFit_Icon_Buzz();
                System.out.println(watch.object);
                break;
            case 4:
                watch.object = new ColorFit_Icon_Buzz();
                System.out.println(watch.object);
                break;

            case 0:
                Noise.noise();
                break;
            case 5:
                System.exit(0);

        }
        if (n1000_2000 != 1 && n1000_2000 != 2 && n1000_2000 != 3 && n1000_2000 != 0 && n1000_2000 != 4 && n1000_2000 != 5) {
            System.out.println("   please give right input as mentioned above");
            n1000_2000(); // method recursion
        }

    }
}

class ColorFit_pulse_2_max extends N1000_2000 {
    ColorFit_pulse_2_max() {
        name = "colorfit pulse 2 max ";
        display = "LCD";
        display_size = 1.85;
        battery = "300 mah";
        price = 2000;

    }
}

class ColorFit_Icon extends N1000_2000 {
    ColorFit_Icon() {
        name = "ColorFit Icon";
        display = "LCD";
        display_size = 1.85;
        battery = "260 mah";
        price = 1800;

    }
}

class ColorFit_Icon_Buzz extends N1000_2000 {
    ColorFit_Icon_Buzz() {
        name = "ColorFit Icon Buzz";
        display = "LCD";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}
class  ColorFit_Qube_O2 extends N1000_2000{
    ColorFit_Qube_O2(){
        name = "ColorFit Qube O2";
        display = "LCD";
        display_size = 1.69;
        battery = "230 mah";
        price = 1299;
    }
}

class N2000_3000 extends Noise {
    public static void n2000_3000() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("|                                          SMARTWATCH                                  |");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                                       Price");
        System.out.println("1: Noise HRX Bounce Smartwatch(TFT)                Rs-2500");
        System.out.println("2: NoiseFit Force Smartwatch (IPS)                 Rs-2999");
        System.out.println("3: Noise Ultra 2 Buzz    (IPS)                     Rs-2999");
        System.out.println("4: ColorFit Icon 2 Vista (Amoled)                  Rs-2499");

        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int n2000_3000 = sc.nextInt();
        switch (n2000_3000) {
            case 1:
                watch.object = new Noise_HRX_Bounce();
                System.out.println(watch.object);
                break;
            case 2:
                watch.object = new NoiseFit_Force();
                System.out.println(watch.object);
                break;
            case 3:
                watch.object = new Noise_Ultra_2_Buzz();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new ColorFitIcon2_Vista();
                 System.out.println(watch.object);
                 break;   
            case 0:
                Noise.noise();
                break;
            case 5:
                System.exit(0);

        }
        if (n2000_3000 != 1 && n2000_3000 != 2 && n2000_3000 != 3 && n2000_3000 != 0 && n2000_3000 != 4 && n2000_3000 != 5) {
            System.out.println("   please give right input as mentioned above");
            n2000_3000(); // method recursion
        }

    }
}

class Noise_HRX_Bounce extends N2000_3000 {
    Noise_HRX_Bounce() {
        name = "Noise HRX Bounce";
        display = "TFT";
        display_size = 1.39;
        battery = "230 mah";
        price = 2500;

    }
}

class NoiseFit_Force extends N2000_3000 {
    NoiseFit_Force() {
        name = "ColorFit Forece";
        display = "IPS";
        display_size = 1.32;
        battery = "300 mah";
        price = 2999;

    }
}

class Noise_Ultra_2_Buzz extends N2000_3000 {
    Noise_Ultra_2_Buzz() {

        name = "Noise Ultra 2 Buzz";
        display = "IPS";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}
class ColorFitIcon2_Vista extends N2000_3000{
    ColorFitIcon2_Vista(){
        name = " ColorFitIcon2_Vista";
        display = "Amoled";
        display_size = 1.78;
        battery = "290 mah";
        price = 2499;
    }
}


class N3000_4000 extends Noise {
    public static void n3000_4000() {
        System.out.println();
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out
                .println("|                                          SMARTWATCH                                    |");
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                                      Price");
        System.out.println("1: ColorFit Ultra 2(Amoled)                      Rs-3999");
        System.out.println("2: ColorFit Ultra(IPS)                           Rs-3300");
        System.out.println("3: Noise Pro 3 Assist(Amoled)                    Rs-3499");
        System.err.println("4: NoiseFit Evolve 3 (Amoled)                    Rs-3999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int n3000_4000 = sc.nextInt();
        switch (n3000_4000) {
            case 1:
                watch.object = new ColorFit_Ultra_2();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new ColorFit_Ultra();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Noise_Pro_3_Assist();
                 System.out.println(watch.object);
                 break;
            case 0:
                Noise.noise();
                 System.out.println(watch.object);
                 break;
            case 5:
                System.exit(0);

        }
        if (n3000_4000 != 1 && n3000_4000 != 2 && n3000_4000 != 3 && n3000_4000 != 0 && n3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            n3000_4000(); // method recursion
        }

    }
}

class ColorFit_Ultra_2 extends N3000_4000 {
    ColorFit_Ultra_2() {
        name = "ColorFit Ultra 2";
        display = "Amoled";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class ColorFit_Ultra extends N3000_4000 {
    ColorFit_Ultra() {
        name = "ColorFit Ultra";
        display = "IPS";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class Noise_Pro_3_Assist extends N3000_4000 {
    Noise_Pro_3_Assist() {
        name = "Noise Pro 3 Assist";
        display = "Amoled";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}
class NoiseFitEvolve_3 extends N3000_4000{
    NoiseFitEvolve_3(){
        name = "NoiseFit Evolve 3";
        display = "Amoled";
        display_size = 1.55;
        battery = "290 mah";
        price = 3999;
    }
}
class Boat extends Smartwatch {
    public static void boat() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("|                                         RANGE                                        |");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int boat = sc.nextInt();
        switch (boat) {
            case 1:
                B1000_2000.b1000_2000();
                break;
            case 2:
                B2000_3000.b2000_3000();
                break;
            case 3:
                B3000_4000.b3000_4000();
                break;
            case 0:
                Smartwatch.smartwatch();
                break;
            case 4:
                System.exit(0);

        }
        if (boat != 1 && boat != 2 && boat != 3 && boat != 0 && boat != 4) {
            System.out.println("   please give right input as mentioned above");
            boat(); // method recursion
        }

    }
}

class B1000_2000 extends Boat {
    public static void b1000_2000() {

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                                     SMARTWATCH                              |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                     Price");
        System.out.println("1: Boat watch flash (IPS)       Rs-1999");
        System.out.println("2: Boat Storm   (IPS)           Rs-1399");
        System.out.println("3: Boat Blaze (TFT)             Rs-1600");
        System.err.println("4: Boat Wave Lite (HD)          Rs-1499");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int b1000_2000 = sc.nextInt();
        switch (b1000_2000) {
            case 1:
                watch.object = new Boat_watch_flash();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Boat_Storm();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Boat_Blaze();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new BoatWaveLite();
                 System.out.println(watch.object);
                 break;
            case 0:
                Boat.boat();
                break;
            case 5:
                System.exit(0);

        }
        if (b1000_2000 != 1 && b1000_2000 != 2 && b1000_2000 != 3 && b1000_2000 != 0 && b1000_2000 != 4 && b1000_2000 !=5) {
            System.out.println("   please give right input as mentioned above");
            b1000_2000(); // method recursion
        }

    }
}

class Boat_watch_flash extends B1000_2000 {
    Boat_watch_flash() {
        name = "Boat watch flash";
        display = "IPS";
        display_size = 1.89;
        battery = "230 mah";
        price = 1999;

    }
}

class Boat_Storm extends B1000_2000 {
    Boat_Storm() {
        name = "Boat Storm";
        display = "IPS";
        display_size = 1.75;
        battery = "330 mah";
        price = 1399;

    }
}

class Boat_Blaze extends B1000_2000 {
    Boat_Blaze() {
        name = "Boat Blaze";
        display = "TFT";
        display_size = 1.55;
        battery = "290 mah";
        price = 1600;

    }
}

class BoatWaveLite extends B1000_2000{
    BoatWaveLite(){
        name = "BoatWaveLite";
        display = "HD";
        display_size = 1.55;
        battery = "290 mah";
        price = 1499;
    }
}

class B2000_3000 extends Boat {
    public static void b2000_3000() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|                                         SMARTWATCH                             |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                                    Price");
        System.out.println("1: Boat wave prime (Amoled)                    Rs-2899");
        System.out.println("2: Boat xtend sport  (IPS)                     Rs-2499");
        System.out.println("3: Boat wave connect  (Amoled)                 Rs-2999");
        System.out.println("4: Boat xtend  (ISP )                          Rs-2599");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int b2000_3000 = sc.nextInt();
        switch (b2000_3000) {
            case 1:
                watch.object = new Boat_wave_prime();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Boat_xtend_sport();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Boat_wave_connect();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new  Boatxtend  ();
                 System.out.println(watch.object);
                 break;
            case 0:
                Boat.boat();
                break;
            case 5:
                System.exit(0);

        }
        if (b2000_3000 != 1 && b2000_3000 != 2 && b2000_3000 != 3 && b2000_3000 != 0 && b2000_3000 != 4 && b2000_3000 != 5) {
            System.out.println("   please give right input as mentioned above");
            b2000_3000(); // method recursion
        }

    }
}

class Boat_wave_prime extends B2000_3000 {
    Boat_wave_prime() {
        name = "Boat wave prime";
        display = "Amoled";
        display_size = 1.69;
        battery = "230 mah";
        price = 2899;

    }
}

class Boat_xtend_sport extends B2000_3000 {
    Boat_xtend_sport() {
        name = "Boat xtend sport";
        display = "IPS";
        display_size = 1.79;
        battery = "300 mah";
        price = 2499;

    }
}

class Boat_wave_connect extends B2000_3000 {
    Boat_wave_connect() {
        name = "Boat wave connect";
        display = "Amoled";
        display_size = 1.55;
        battery = "290 mah";
        price = 2999;

    }
}
class  Boatxtend extends B2000_3000{
    Boatxtend(){
        name = "Boatxtend";
        display = "IPS";
        display_size = 1.55;
        battery = "290 mah";
        price = 2599;
    }
}

class B3000_4000 extends Boat {
    public static void b3000_4000() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|                                    SMARTWATCH                                   |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                        Price");
        System.out.println("1: Boat Trebel Blaze (Amoled)      Rs-3999");
        System.out.println("2: Boat Xplorer O2 (Amoled)        Rs-3999");
        System.out.println("3: Boat primia  (Amoled)           Rs-3799");
        System.err.println("4: Boat primia Q2 (Amoled)         Rs-3899");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int b3000_4000 = sc.nextInt();
        switch (b3000_4000) {
            case 1:
                watch.object = new Boat_Trebel_Blaze();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Boat_Xplorer_O2();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Boat_primia();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new Boat_primiaQ2();
                System.out.println(watch.object);
                 break;
            case 0:
                Boat.boat();
                break;
            case 5:
                System.exit(0);

        }
        if (b3000_4000 != 1 && b3000_4000 != 2 && b3000_4000 != 3 && b3000_4000 != 0 && b3000_4000 != 4 && b3000_4000 != 5) {
            System.out.println("   please give right input as mentioned above");
            b3000_4000(); // method recursion
        }
    }
}

class Boat_Trebel_Blaze extends B3000_4000 {
    Boat_Trebel_Blaze() {
        name = "Boat Trebel Blaze";
        display = "Anoled";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class Boat_Xplorer_O2 extends B3000_4000 {
    Boat_Xplorer_O2() {
        name = "Boat Xplorer O2";
        display = "IPS";
        display_size = 1.79;
        battery = "300 mah";
        price = 3999;

    }
}

class Boat_primia extends B3000_4000 {
    Boat_primia() {
        name = "Boat Primia";
        display = "IPS";
        display_size = 1.55;
        battery = "290 mah";
        price = 3799;

    }
}
class Boat_primiaQ2 extends B3000_4000{
    Boat_primiaQ2(){
        name = "Boat_primiaQ2";
        display = "Amoled";
        display_size = 1.55;
        battery = "290 mah";
        price = 3899;
    }
}

class Firebolt extends Smartwatch {
    public static void firebolt() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                                     RANGE                                   |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int firebolt = sc.nextInt();
        switch (firebolt) {
            case 1:
                F1000_2000.f1000_2000();
                break;
            case 2:
                F2000_3000.f2000_3000();
                break;
            case 3:
                F3000_4000.f3000_4000();
                break;
            case 0:
                Smartwatch.smartwatch();
                break;
            case 4:
                System.exit(0);

        }
        if (firebolt != 1 && firebolt != 2 && firebolt != 3 && firebolt != 0 && firebolt != 4) {
            System.out.println("   please give right input as mentioned above");
            firebolt(); // method recursion
        }

    }
}

class F1000_2000 extends Firebolt {
    public static void f1000_2000() {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                                   SMARTWATCH                                |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                     Price");
        System.out.println("1: Firebolt Epic Plus(LCD)      Rs-1399");
        System.out.println("2: Firebolt Rebel  (LCD)        Rs-1599");
        System.out.println("3: Firebolt range  (LCD)        Rs-1600");
        System.err.println("4: Firebolt rangle plus (LCD)   RS-1399");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int f1000_2000 = sc.nextInt();
        switch (f1000_2000) {
            case 1:
                watch.object = new firebolt_Epic_Plus();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new firebolt_Rebel();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new firebolt_range();
                 System.out.println(watch.object);
                 break;
             case 4:
                watch.object = new firebolt_rangeplus();
                 System.out.println(watch.object);
                 break;
            case 0:
                Firebolt.firebolt();
                break;
            case 5:
                System.exit(0);

        }
        if (f1000_2000 != 1 && f1000_2000 != 2 && f1000_2000 != 3 && f1000_2000 != 0 && f1000_2000 != 4 && f1000_2000 !=5) {
            System.out.println("   please give right input as mentioned above");
            f1000_2000(); // method recursion
        }

    }
}

class firebolt_Epic_Plus extends F1000_2000 {
    firebolt_Epic_Plus() {
        name = "Firebolt epic plus";
        display = "LCD";
        display_size = 1.79;
        battery = "230 mah";
        price = 1399;

    }
}

class firebolt_Rebel extends F1000_2000 {
    firebolt_Rebel() {
        name = "Firebolt Rebel";
        display = "LCD";
        display_size = 1.79;
        battery = "300 mah";
        price = 1599;

    }
}

class firebolt_range extends F1000_2000 {
    firebolt_range() {
        name = "Firebolt range ";
        display = "LCD";
        display_size = 1.59;
        battery = "230 mah";
        price = 1600;

    }
}
class firebolt_rangeplus extends F1000_2000{
    firebolt_rangeplus(){
        name = "Firebolt range plus";
        display = "LCD";
        display_size = 1.59;
        battery = "230 mah";
        price = 1399;
    }
}

class F2000_3000 extends Firebolt {
    public static void f2000_3000() {
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                 SMARTWATCH                              |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                                  Price");
        System.out.println("1: Firebolt Rocket   (LCD)                    Rs-2499");
        System.out.println("2: Firebolt Ring 2   (LCD)                    Rs-2499");
        System.out.println("3: Firebolt Ninja Calling (Amoled)            Rs-2499");
        System.err.println("4: Firebolt ninja 2 (IPS)                     Rs-2899");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int f2000_3000 = sc.nextInt();
        switch (f2000_3000) {
            case 1:
                watch.object = new firebolt_rocket();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2: 
                watch.object = new firebolt_Ring_2();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new firebolt_ninja_calling();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new firebolt_ninja_2();
                 System.out.println(watch.object);
                 break;
            case 0:
                Firebolt.firebolt();
                break;
            case 5:
                System.exit(0);

        }
        if (f2000_3000 != 1 && f2000_3000 != 2 && f2000_3000 != 3 && f2000_3000 != 0 && f2000_3000 != 4 && f2000_3000 != 5) {
            System.out.println("   please give right input as mentioned above");
            f2000_3000(); // method recursion
        }

    }
}

class firebolt_rocket extends F2000_3000 {
    firebolt_rocket() {
        name = "Firebolt rocket";
        display = "LCD";
        display_size = 1.79;
        battery = "230 mah";
        price = 2499;

    }
}

class firebolt_Ring_2 extends F2000_3000 {
    firebolt_Ring_2() {
        name = "Firebolt Ring 2";
        display = "LCD";
        display_size = 1.69;
        battery = "300 mah";
        price = 2499;

    }
}

class firebolt_ninja_calling extends F2000_3000 {
    firebolt_ninja_calling() {
        name = "Firebolt ninja calling";
        display = "Amoled";
        display_size = 1.59;
        battery = "230 mah";
        price = 2499;

    }
}
class firebolt_ninja_2 extends F2000_3000{
    firebolt_ninja_2(){
        name = "Firebolt ninja 2";
        display = "IPS";
        display_size = 1.59;
        battery = "230 mah";
        price = 2899;
    }
}
class F3000_4000 extends Firebolt {
    public static void f3000_4000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                                     SMARTWATCH                                |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your smart watch");
        System.out.println();
        System.out.println("         Name                   Price");
        System.out.println("1: Firebolt Visionary (LCD)   Rs-3799");
        System.out.println("2: Firebolt Ultron (IPS)       Rs-4000");
        System.out.println("3: Firebolt Max     (LCD)      Rs-3000");
        System.out.println("4: Firebolt max 2    (Amoled)  Rs-3899");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int f3000_4000 = sc.nextInt();
        switch (f3000_4000) {
            case 1:
                watch.object = new firebolt_visionary();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new firebolt_ultron();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new firebolt_max();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new firebolt_max2();
                 System.out.println(watch.object);
                 break;
            case 0:
                Firebolt.firebolt();
                break;
            case 5:
                System.exit(0);

        }
        if (f3000_4000 != 1 && f3000_4000 != 2 && f3000_4000 != 3 && f3000_4000 != 4 && f3000_4000 != 0 && f3000_4000 != 5) {
            System.out.println("   please give right input as mentioned above");
            f3000_4000(); // method recursion
        }

    }
}

class firebolt_visionary extends F3000_4000 {
    firebolt_visionary() {
        name = "Firebolt visionary";
        display = "LCD";
        display_size = 1.69;
        battery = "230 mah";
        price = 3799;

    }
}

class firebolt_ultron extends F3000_4000 {
    firebolt_ultron() {
        name = "Firebolt ultron";
        display = "IPS";
        display_size = 1.69;
        battery = "300 mah";
        price = 4000;

    }
}

class firebolt_max extends F3000_4000 {
    firebolt_max() {
        name = "Firebolt Max";
        display = "LCD";
        display_size = 1.69;
        battery = "230 mah";
        price = 3000;

    }
}
class firebolt_max2 extends F3000_4000{
    firebolt_max2(){
        name = "Firebolt Max 2";
        display = "Amoled";
        display_size = 1.69;
        battery = "230 mah";
        price = 3899;
    }
}

class Analog extends watch {
    public static void analog() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|                           WHICH COMPANY DO YOU WANT                            |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose the comapny ");
        System.out.println();
        System.out.println("1:Titan");
        System.out.println("2:Fastrack");
        System.out.println("3:Sonata");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int analog = sc.nextInt();
        switch (analog) {
            case 1:
                Titan.titan();
                break;
            case 2:
                Fastrack.fastrack();
                break;
            case 3:
                Sonata.sonata();
                break;
            case 0:
                watch.type();
                break;
            case 4:
                System.exit(0);

        }
        if (analog != 1 && analog != 2 && analog != 3 && analog != 0 && analog != 4) {
            System.out.println("   please give right input as mentioned above");
            analog(); // method recursion
        }

    }
}

class Titan extends Analog {
    public static void titan() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                     RANGE                                 |");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your Titan range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int titan = sc.nextInt();
        switch (titan) {
            case 1:
                T1000_2000.t1000_2000();
                break;
            case 2:
                T2000_3000.t2000_3000();
                break;
            case 3:
                T3000_4000.t3000_4000();
                break;
            case 0:
                Analog.analog();
                break;
            case 4:
                System.exit(0);

        }
        if (titan != 1 && titan != 2 && titan != 3 && titan != 0 && titan != 4) {
            System.out.println("   please give right input as mentioned above");
            titan(); // method recursion
        }
    }
}

class T1000_2000 extends Titan {
    public static void t1000_2000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                                     ANALOG WATCH                              |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                           Price");
        System.out.println("1: Titan Analog watch (Round)         Rs-1836");
        System.out.println("2: Titan Karishma Analog (Square)     Rs-1995");
        System.out.println("3: Titan Analog   (Rectangle)         Rs-1600");   
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int t1000_2000 = sc.nextInt();
        switch (t1000_2000) {
            case 1:
                watch.object = new titanAnalogwatch();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new titanKarishmaAnalog();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new titanAnalog();
                 System.out.println(watch.object);
                 break;
            case 0:
                Titan.titan();
                break;
            case 4:
                System.exit(0);

        }
        if (t1000_2000 != 1 && t1000_2000 != 2 && t1000_2000 != 3 && t1000_2000 != 0 && t1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            t1000_2000(); // method recursion
        }

    }
}

class titanAnalogwatch extends T1000_2000 {
    titanAnalogwatch() {
        name = "Titan Analog watch ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1836;

    }
}

class titanKarishmaAnalog extends T1000_2000 {
    titanKarishmaAnalog() {
        name = "Titan Karishma Analog";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1995;

    }
}

class titanAnalog extends T1000_2000 {
    titanAnalog() {
        name = "Titan Analog";
        display = "rectangle ";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}

class T2000_3000 extends Titan {
    public static void t2000_3000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|                                       ANALOG WATCH                       |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                               Price");
        System.out.println("1: Titan Analog Silver Dial(Square)        Rs-2156");
        System.out.println("2: Titan Neo    (Rectangle)                Rs-2076");
        System.out.println("3: Titan Analog Blue Dial  (Round)          Rs-2999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int t2000_3000 = sc.nextInt();
        switch (t2000_3000) {
            case 1:
                watch.object = new Titan_Analog_Silver_Dial();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new titanKarishmaAnalog();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new titanAnalog();
                 System.out.println(watch.object);
                 break;
            case 0:
                Titan.titan();
                break;
            case 4:
                System.exit(0);

        }
        if (t2000_3000 != 1 && t2000_3000 != 2 && t2000_3000 != 3 && t2000_3000 != 0 && t2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            t2000_3000(); // method recursion
        }

    }
}

class Titan_Analog_Silver_Dial extends T2000_3000 {
    Titan_Analog_Silver_Dial() {
        name = "Titan Analog Silver Dial";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class Titan_Neo extends T2000_3000 {
    Titan_Neo() {
        name = "Titan_Neo";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class Titan_Analog_Blue_Dial extends T2000_3000 {
    Titan_Analog_Blue_Dial() {
        name = "Titan Analog Blue Dial";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class T3000_4000 extends Titan {
    public static void t3000_4000() {

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                                  ANALOG WATCH                             |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                                             Price");
        System.out.println("1: Titan Analog Blue Dial (Round)                         Rs-3999");
        System.out.println("2: Titan Men's Round    (Rectangle)                       Rs-3300");
        System.out.println("3: Titan Autumn-Winter 20  (Square)                        Rs-3499");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int t3000_4000 = sc.nextInt();
        switch (t3000_4000) {
            case 1:
                watch.object = new Titan_AnalogBlue_Dial();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Titan_Mens_Round();
                System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Titan_Autumn_Winter_20();
                 System.out.println(watch.object);
                 break;
            case 0:
                Titan.titan();
                break;
            case 4:
                System.exit(0);

        }
        if (t3000_4000 != 1 && t3000_4000 != 2 && t3000_4000 != 3 && t3000_4000 != 0 && t3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            t3000_4000(); // method recursion
        }

    }
}

class Titan_AnalogBlue_Dial extends T3000_4000 {
    Titan_AnalogBlue_Dial() {
        name = "Titan Analog Blue Dial";
        display = "Round";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class Titan_Mens_Round extends T3000_4000 {
    Titan_Mens_Round() {
        name = "Titan Men's Round";
        display = "rectangle";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class Titan_Autumn_Winter_20 extends T3000_4000 {
    Titan_Autumn_Winter_20() {
        name = "Titan Autumn-Winter 20 ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}

class Fastrack extends Analog {
    public static void fastrack() {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                                    RANGE                                     |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your fastrack range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int fastrack = sc.nextInt();
        switch (fastrack) {
            case 1:
                FTT1000_2000.ftt1000_2000();
                break;
            case 2:
                FTT2000_3000.ftt2000_3000();
                break;
            case 3:
                FTT3000_4000.ftt3000_4000();
                break;
            case 0:
                Analog.analog();
                break;
            case 4:
                System.exit(0);

        }
        if (fastrack != 1 && fastrack != 2 && fastrack != 3 && fastrack != 0 && fastrack != 4) {
            System.out.println("   please give right input as mentioned above");
            fastrack(); // method recursion
        }
    }
}

class FTT1000_2000 extends Fastrack {
    public static void ftt1000_2000() {

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                                 ANALOG WATCH                                 |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                            Price");
        System.out.println("1: Fastrack Stunners   (Round)           Rs-1995");
        System.out.println("2: Fastrack Analog      (Square)         Rs-1105");
        System.out.println("3: Fastrack Stunners4.0 (Rectangle)      Rs-1600");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ftt1000_2000 = sc.nextInt();
        switch (ftt1000_2000) {
            case 1:
                watch.object = new fastrackStunners();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new fastrackAnalog();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new fastrackStunners4();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack.fastrack();
                break;
            case 4:
                System.exit(0);

        }
        if (ftt1000_2000 != 1 && ftt1000_2000 != 2 && ftt1000_2000 != 3 && ftt1000_2000 != 0 && ftt1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            ftt1000_2000(); // method recursion
        }

    }
}

class fastrackStunners extends FTT1000_2000 {
    fastrackStunners() {
        name = "Fastrack Stunners ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1665;

    }
}

class fastrackAnalog extends FTT1000_2000 {
    fastrackAnalog() {
        name = "Fastrack Analog";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1105;

    }
}

class fastrackStunners4 extends FTT1000_2000 {
    fastrackStunners4() {
        name = "Fastrack Stunner 4.0";
        display = "rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}

class FTT2000_3000 extends Fastrack {
    public static void ftt2000_3000() {

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                                ANALOG WATCH                           |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                                Price");
        System.out.println("1: Fastrack Analog Grey (Square)             Rs-2156");
        System.out.println("2: Fastrack Analog Black   (Rectangle)       Rs-2076");
        System.out.println("3: Fastrack Road Trip     (Roud)             Rs-2999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ftt2000_3000 = sc.nextInt();
        switch (ftt2000_3000) {
            case 1:
                watch.object = new fastrack_AnalogGrey();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new fastrackAnalog_Black();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new fastrack_Road_Trip();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack.fastrack();
                break;
            case 4:
                System.exit(0);

        }
        if (ftt2000_3000 != 1 && ftt2000_3000 != 2 && ftt2000_3000 != 3 && ftt2000_3000 != 0 && ftt2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            ftt2000_3000(); // method recursion
        }

    }
}

class fastrack_Analog_Grey extends FTT2000_3000 {
    fastrack_Analog_Grey() {
        name = "Fastrack Analog Grey  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class fastrack_Analog_Black extends FTT2000_3000 {
    fastrack_Analog_Black() {
        name = "Titan_Neo";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class fastrack_Road_Trip extends FTT2000_3000 {
    fastrack_Road_Trip() {
        name = "Titan Analog Blue Dial";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class FTT3000_4000 extends Fastrack {
    public static void ftt3000_4000() {

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("|                                   ANALOG WATCH                                    |");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                             Price");
        System.out.println("1: Fastrack Analog Blue (Rectangle)     Rs-3999");
        System.out.println("2: Fastrack Analog Black (Round)        Rs-3300");
        System.out.println("3: Fastrack Analog Grey (Square)        Rs-3499");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ftt3000_4000 = sc.nextInt();
        switch (ftt3000_4000) {
            case 1:
                watch.object = new fastrack_Analog_Black();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new fastrack_Analog_Black();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new fastrack_AnalogGrey();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack.fastrack();
                break;
            case 4:
                System.exit(0);

        }
        if (ftt3000_4000 != 1 && ftt3000_4000 != 2 && ftt3000_4000 != 3 && ftt3000_4000 != 0 && ftt3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            ftt3000_4000(); // method recursion
        }

    }
}

class fastrack_Analog_Blue extends FTT3000_4000 {
    fastrack_Analog_Blue() {
        name = "Fastrack Analog Blue";
        display = "rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class fastrackAnalog_Black extends FTT3000_4000 {
    fastrackAnalog_Black() {
        name = "Fastrack Analog Black";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class fastrack_AnalogGrey extends FTT3000_4000 {
    fastrack_AnalogGrey() {
        name = "Fastrack Analog Grey ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}

class Sonata extends Analog {
    public static void sonata() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                     RANGE                                 |");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your sonata range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sonata = sc.nextInt();
        switch (sonata) {
            case 1:
                S1000_2000.s1000_2000();
                break;
            case 2:
                S2000_3000.s2000_3000();
                break;
            case 3:
                S3000_4000.s3000_4000();
                break;
            case 0:
                Analog.analog();
                break;
            case 4:
                System.exit(0);

        }
        if (sonata != 1 && sonata != 2 && sonata != 3 && sonata != 0 && sonata != 4) {
            System.out.println("   please give right input as mentioned above");
            sonata(); // method recursion
        }
    }
}

class S1000_2000 extends Sonata {
    public static void s1000_2000() {

        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                                   ANALOG WATCH                             |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                           Price");
        System.out.println("1: Sonata Beyond Gold    (Round)       Rs-1695");
        System.out.println("2: Sonata Formal Analog  (Square)      Rs-1200");
        System.out.println("3: Sonata Reloaded Analog (Rectangle)  Rs-1690");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int s1000_2000 = sc.nextInt();
        switch (s1000_2000) {
            case 1:
                watch.object = new Sonata_Beyond_Gold();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Sonata_Formal_Analog();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new sonata_Reloaded_Analog();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata.sonata();
                break;
            case 4:
                System.exit(0);

        }
        if (s1000_2000 != 1 && s1000_2000 != 2 && s1000_2000 != 3 && s1000_2000 != 0 && s1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            s1000_2000(); // method recursion
        }

    }
}

class Sonata_Beyond_Gold extends S1000_2000 {
    Sonata_Beyond_Gold() {
        name = "Sonata Beyond Gold ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1695;

    }
}

class Sonata_Formal_Analog extends S1000_2000 {
    Sonata_Formal_Analog() {
        name = "Sonata Formal Analog";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1200;

    }
}

class sonata_Reloaded_Analog extends S1000_2000 {
    sonata_Reloaded_Analog() {
        name = "Sonata Reloaded Analog";
        display = "rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1690;

    }
}

class S2000_3000 extends Sonata {
    public static void s2000_3000() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                   ANALOG WATCH                            |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                                Price");
        System.out.println("1: Sonata Analog Blue Dial (Square)          Rs-2106");
        System.out.println("2: Sonata Analog Silver Dial  (Rectangle)    Rs-2276");
        System.out.println("3: Sonata Nxt Analog White (Round)           Rs-2500");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int s2000_3000 = sc.nextInt();
        switch (s2000_3000) {
            case 1:
                watch.object = new sonata_Analog_Blue_Dial();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new sonata_Analog_Silver_Dial();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Sonata_Nxt_Analog_White();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata.sonata();
                break;
            case 4:
                System.exit(0);

        }
        if (s2000_3000 != 1 && s2000_3000 != 2 && s2000_3000 != 3 && s2000_3000 != 0 && s2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            s2000_3000(); // method recursion
        }

    }
}

class sonata_Analog_Blue_Dial extends S2000_3000 {
    sonata_Analog_Blue_Dial() {
        name = "Sonata Analog Blue Dial  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2106;

    }
}

class sonata_Analog_Silver_Dial extends S2000_3000 {
    sonata_Analog_Silver_Dial() {
        name = "Sonata Analog Silver Dial ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2276;

    }
}

class Sonata_Nxt_Analog_White extends S2000_3000 {
    Sonata_Nxt_Analog_White() {
        name = "Sonata Nxt Analog White";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2500;

    }
}

class S3000_4000 extends Sonata {
    public static void s3000_4000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                ANALOG WATCH                             |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your analog watch");
        System.out.println();
        System.out.println("         Name                         Price");
        System.out.println("1: Sonata Analog Black (Rectangle)    Rs-3999");
        System.out.println("2: Sonata Stride Pro  (Square)        Rs-3300");
        System.out.println("3: Sonata Pairs Analog (Round)        Rs-3999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int s3000_4000 = sc.nextInt();
        switch (s3000_4000) {
            case 1:
                watch.object = new sonata_Analog_Black();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new sonata_Stride_Pro();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new sonata_Pairs_Analog();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata.sonata();
                break;
            case 4:
                System.exit(0);

        }
        if (s3000_4000 != 1 && s3000_4000 != 2 && s3000_4000 != 3 && s3000_4000 != 0 && s3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            s3000_4000(); // method recursion
        }

    }
}

class sonata_Analog_Black extends S3000_4000 {
    sonata_Analog_Black() {
        name = "Sonata Analog Black ";
        display = "Rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class sonata_Stride_Pro extends S3000_4000 {
    sonata_Stride_Pro() {
        name = "Sonata Stride Pro";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class sonata_Pairs_Analog extends S3000_4000 {
    sonata_Pairs_Analog() {
        name = "Sonata Pairs Analog ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3999;

    }

}

class Digital extends watch {
    public static void digital() {
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                       Which company digitalwatch do you want           |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose the comapny ");
        System.out.println();
        System.out.println("1:Casio");
        System.out.println("2:Fastrack");
        System.out.println("3:Sonata");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int digital = sc.nextInt();
        switch (digital) {
            case 1:
                Casio.casio();
                break;
            case 2:
                Fastrack1.fastrack1();
                break;
            case 3:
                Sonata1.sonata1();
                break;
            case 0:
                watch.type();
                break;
            case 4:
                System.exit(0);

        }
        if (digital != 1 && digital != 2 && digital != 3 && digital != 0 && digital != 4) {
            System.out.println("   please give right input as mentioned above");
            digital(); // method recursion
        }

    }
}

class Casio extends Digital {
    public static void casio() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|                                   RANGE                                 |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your Casio  range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int casio = sc.nextInt();
        switch (casio) {
            case 1:
                C1000_2000.c1000_2000();
                break;
            case 2:
                C2000_3000.c2000_3000();
                break;
            case 3:
                C3000_4000.c3000_4000();
                break;
            case 0:
                Digital.digital();
                break;
            case 4:
                System.exit(0);

        }
        if (casio != 1 && casio != 2 && casio != 3 && casio != 0 && casio != 4) {
            System.out.println("   please give right input as mentioned above");
            casio(); // method recursion
        }

    }
}

class C1000_2000 extends Casio {
    public static void c1000_2000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|                                DIGITAL-WATCH                            |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                         Price");
        System.out.println("1: Casio Vintage Seri  (Round)        Rs-1836");
        System.out.println("2: Casio Youth Series  (Square)       Rs-1995");
        System.out.println("3: Casio Digital Gray  (Recangle)     Rs-1600");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int c1000_2000 = sc.nextInt();
        switch (c1000_2000) {
            case 1:
                watch.object = new Casio_Vintage_Seri();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Casio_YouthSeries();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Casio_DigitalGray();
                 System.out.println(watch.object);
                 break;
            case 0:
                Casio.casio();
                break;
            case 4:
                System.exit(0);

        }
        if (c1000_2000 != 1 && c1000_2000 != 2 && c1000_2000 != 3 && c1000_2000 != 0 && c1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            c1000_2000(); // method recursion
        }

    }
}

class Casio_Vintage_Seri extends C1000_2000 {
    Casio_Vintage_Seri() {
        name = "Casio Vintage Seri ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1836;

    }
}

class Casio_YouthSeries extends C1000_2000 {
    Casio_YouthSeries() {
        name = "Casio Youth Series";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1995;

    }
}

class Casio_DigitalGray extends C1000_2000 {
    Casio_DigitalGray() {
        name = "Casio Digital Gray";
        display = "Rectangle ";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}

class C2000_3000 extends Digital {
    public static void c2000_3000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                 DIGITAL_WATCH                           |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                                 Price");
        System.out.println("1: Casio Vintage Series (Square)              Rs-2156");
        System.out.println("2: Casio Youth-Digital  (Rectangle)           Rs-2076");
        System.out.println("3: Casio YouDigital     (Round)                Rs-2999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int c2000_3000 = sc.nextInt();
        switch (c2000_3000) {
            case 1:
                watch.object = new Casio_Vintage_Series();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Casio_Youth_Digital();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Casio_YouDigital();
                 System.out.println(watch.object);
                 break;
            case 0:
                Digital.digital();
                break;
            case 4:
                System.exit(0);

        }
        if (c2000_3000 != 1 && c2000_3000 != 2 && c2000_3000 != 3 && c2000_3000 != 0 && c2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            c2000_3000(); // method recursion
        }

    }
}

class Casio_Vintage_Series extends C2000_3000 {
    Casio_Vintage_Series() {
        name = "Casio Vintage Series  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class Casio_Youth_Digital extends C2000_3000 {
    Casio_Youth_Digital() {
        name = "Casio Youth-Digital  ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class Casio_YouDigital extends C2000_3000 {
    Casio_YouDigital() {
        name = "Casio YouDigital";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class C3000_4000 extends Digital {
    public static void c3000_4000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                DIGITAL_WATCH                           |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                            Price");
        System.out.println("1: Casio Youth Combination (Round)      Rs-3999");
        System.out.println("2: Casio Youth         (Rectangle)      Rs-3300");
        System.out.println("3: Casio Vin            (Square)         Rs-3499");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int c3000_4000 = sc.nextInt();
        switch (c3000_4000) {
            case 1:
                watch.object = new Casio_YouthCombination();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Casio_Youth();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Casio_Vin();
                 System.out.println(watch.object);
                 break;
            case 0:
                Digital.digital();
                break;
            case 4:
                System.exit(0);

        }
        if (c3000_4000 != 1 && c3000_4000 != 2 && c3000_4000 != 3 && c3000_4000 != 0 && c3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            c3000_4000(); // method recursion
        }

    }
}

class Casio_YouthCombination extends C3000_4000 {
    Casio_YouthCombination() {
        name = "Casio Youth Combination";
        display = "Round";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class Casio_Youth extends C3000_4000 {
    Casio_Youth() {
        name = " Casio Youth  ";
        display = "Rectangle";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class Casio_Vin extends C3000_4000 {
    Casio_Vin() {
        name = "Casio Vin  ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}

class Fastrack1 extends Digital {
    public static void fastrack1() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                  RANGE                                 |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select fastrack range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int fastrack1 = sc.nextInt();
        switch (fastrack1) {
            case 1:
                ft1000_2000.f1000_2000();
                break;
            case 2:
                ft2000_3000.f2000_3000();
                break;
            case 3:
                ft3000_4000.f3000_4000();
                break;
            case 0:
                Digital.digital();
                break;
            case 4:
                System.exit(0);

        }
        if (fastrack1 != 1 && fastrack1 != 2 && fastrack1 != 3 && fastrack1 != 0 && fastrack1 != 4) {
            System.out.println("   please give right input as mentioned above");
            fastrack1(); // method recursion
        }

    }
}

class ft1000_2000 extends Fastrack1 {
    public static void f1000_2000() {

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                               DIGITAL WATCH                         |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                       Price");
        System.out.println("1: Fastrack FT Digital (Round)      Rs-1995");
        System.out.println("2: Fastrack Streetwear  (Square)    Rs-1105");
        System.out.println("3: Fastrack FT Digita   (Square)    Rs-1600");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ft1000_2000 = sc.nextInt();
        switch (ft1000_2000) {
            case 1:
                watch.object = new Fastrack_FTDigital();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Fastrack_Streetwear();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Fastrack_FTDigita();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack1.fastrack1();
                System.out.println(watch.object);
                 break;
            case 4:
                System.exit(0);

        }
        if (ft1000_2000 != 1 && ft1000_2000 != 2 && ft1000_2000 != 3 && ft1000_2000 != 0 && ft1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            f1000_2000(); // method recursion
        }

    }
}

class Fastrack_FTDigital extends ft1000_2000 {
    Fastrack_FTDigital() {
        name = "Fastrack FT Digital  ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1995;

    }
}

class Fastrack_Streetwear extends ft1000_2000 {
    Fastrack_Streetwear() {
        name = "Fastrack Streetwear";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1105;

    }
}

class Fastrack_FTDigita extends ft1000_2000 {
    Fastrack_FTDigita() {
        name = "Fastrack FT Digital ";
        display = "Rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}

class ft2000_3000 extends Fastrack1 {
    public static void f2000_3000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                                DIGITAL WATCH                      |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                               Price");
        System.out.println("1: Fastrack Analog-Digital   (Square)       Rs-2156");
        System.out.println("2: Fastrack Streetline      (Rectangle)     Rs-2076");
        System.out.println("3: Fastrack Analog-Digi      (Round)         Rs-2999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ft2000_3000 = sc.nextInt();
        switch (ft2000_3000) {
            case 1:
                watch.object = new Fastrack_AnalogDigital();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Fastrack_Streetline();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Fastrack_AnalogDigi();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack1.fastrack1();
                 System.out.println(watch.object);
                 break;
            case 4:
                System.exit(0);

        }
        if (ft2000_3000 != 1 && ft2000_3000 != 2 && ft2000_3000 != 3 && ft2000_3000 != 0 && ft2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            f2000_3000(); // method recursion
        }

    }
}

class Fastrack_AnalogDigital extends ft2000_3000 {
    Fastrack_AnalogDigital() {
        name = "Fastrack Analog-Digital ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class Fastrack_Streetline extends ft2000_3000 {
    Fastrack_Streetline() {
        name = "Fastrack Streetline";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class Fastrack_AnalogDigi extends ft2000_3000 {
    Fastrack_AnalogDigi() {
        name = "Fastrack Analog-Digi  ";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class ft3000_4000 extends Fastrack1 {
    public static void f3000_4000() {

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                               DIGITAL WATCH                           |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                            Price");
        System.out.println("1: Fastrack FT         (Rectangle)      Rs-3999");
        System.out.println("2: Fastrack Mean Machines (Round)       Rs-3300");
        System.out.println("3: Fastrack Denim        (Square)        Rs-3499");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int ft3000_4000 = sc.nextInt();
        switch (ft3000_4000) {
            case 1:
                watch.object = new FastrackFT();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new FastrackMeanMachines();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new FastrackDenim();
                 System.out.println(watch.object);
                 break;
            case 0:
                Fastrack1.fastrack1();
                break;
            case 4:
                System.exit(0);

        }
        if (ft3000_4000 != 1 && ft3000_4000 != 2 && ft3000_4000 != 3 && ft3000_4000 != 0 && ft3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            f3000_4000(); // method recursion
        }

    }
}

class FastrackFT extends ft3000_4000 {
    FastrackFT() {
        name = "Fastrack FT ";
        display = "Rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class FastrackMeanMachines extends ft3000_4000 {
    FastrackMeanMachines() {
        name = "Fastrack Mean Machines";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class FastrackDenim extends ft3000_4000 {
    FastrackDenim() {
        name = "Fastrack Denim  ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}

class Sonata1 extends Digital {
    public static void sonata1() {

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                                  RANGE                       |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println("Select sonata range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sonata1 = sc.nextInt();
        switch (sonata1) {
            case 1:
                son1000_2000.st1000_2000();
                break;
            case 2:
                son2000_3000.st2000_3000();
                break;
            case 3:
                son3000_4000.st3000_4000();
                break;
            case 0:
                Digital.digital();
                break;
            case 4:
                System.exit(0);

        }
        if (sonata1 != 1 && sonata1 != 2 && sonata1 != 3 && sonata1 != 0 && sonata1 != 4) {
            System.out.println("   please give right input as mentioned above");
            sonata1(); // method recursion
        }

    }
}

class son1000_2000 extends Sonata1 {
    public static void st1000_2000() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|                             DIGITAL WATCH                     |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                           Price");
        System.out.println("1: Sonata Digital        (Round)       Rs-1695");
        System.out.println("2: Sonata Analog-Digital  (Square)     Rs-1200");
        System.out.println("3: Sonata Digital Black   (Rectangle)  Rs-1690");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int st1000_2000 = sc.nextInt();
        switch (st1000_2000) {
            case 1:
                watch.object = new SonataDigital();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Sonata_AnalogDigital();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Sonata_DigitalBlack();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata1.sonata1();
                break;
            case 4:
                System.exit(0);

        }
        if (st1000_2000 != 1 && st1000_2000 != 2 && st1000_2000 != 3 && st1000_2000 != 0 && st1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            st1000_2000(); // method recursion
        }

    }
}

class SonataDigital extends son1000_2000 {
    SonataDigital() {
        name = "Sonata Digital ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1695;

    }
}

class Sonata_AnalogDigital extends son1000_2000 {
    Sonata_AnalogDigital() {
        name = "Sonata Analog-Digital ";
        display = "Square";

        display_size = 1.85;
        battery = "260 mah";
        price = 1200;

    }
}

class Sonata_DigitalBlack extends son1000_2000 {
    Sonata_DigitalBlack() {
        name = "Sonata Digital Black  ";
        display = "Rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1690;

    }
}

class son2000_3000 extends Sonata1 {
    public static void st2000_3000() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|                               DIGITAL WATCH                         |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                                Price");
        System.out.println("1: Sonata Digital      (Square)              Rs-2106");
        System.out.println("2: Sonata Digital Men's  (Rectangle)         Rs-2276");
        System.out.println("3: Sonata Analog-Digital (Round)             Rs-2500");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int st2000_3000 = sc.nextInt();
        switch (st2000_3000) {
            case 1:
                watch.object = new SonataqDigital();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new Sonataa_AnalogDigital();
                System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new Sonata_DigitalMens();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata1.sonata1();
                break;
            case 4:
                System.exit(0);

        }
        if (st2000_3000 != 1 && st2000_3000 != 2 && st2000_3000 != 3 && st2000_3000 != 0 && st2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            st2000_3000(); // method recursion
        }

    }
}

class SonataqDigital extends son2000_3000 {
    SonataqDigital() {
        name = " Sonata Digital  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2106;

    }
}

class Sonataa_AnalogDigital extends son2000_3000 {
    Sonataa_AnalogDigital() {
        name = "Sonata Analog-Digital  ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2276;

    }
}

class Sonata_DigitalMens extends son2000_3000 {
    Sonata_DigitalMens() {
        name = "Sonata Digital Men's  ";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2500;

    }
}

class son3000_4000 extends Sonata1 {
    public static void st3000_4000() {

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                               DIGITAL WATCH                           |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your digital watch");
        System.out.println();
        System.out.println("         Name                          Price");
        System.out.println("1: Sonata Digital Black  (Rectangle)   Rs-3999");
        System.out.println("2: Sonata Stride Digital  (Round)      Rs-3300");
        System.out.println("3: Sonata Pairs Digital (Square)        Rs-3999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int st3000_4000 = sc.nextInt();
        switch (st3000_4000) {
            case 1:
                watch.object = new sonata_digital_Black();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new sonata_Stride_digital();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new sonata_Pairs_digital();
                 System.out.println(watch.object);
                 break;
            case 0:
                Sonata1.sonata1();
                break;
            case 4:
                System.exit(0);

        }
        if (st3000_4000 != 1 && st3000_4000 != 2 && st3000_4000 != 3 && st3000_4000 != 0 && st3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            st3000_4000(); // method recursion
        }

    }
}

class sonata_digital_Black extends son3000_4000 {
    sonata_digital_Black() {
        name = "Sonata Digital Black ";
        display = "Rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class sonata_Stride_digital extends son3000_4000 {
    sonata_Stride_digital() {
        name = "Sonata Stride digital";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class sonata_Pairs_digital extends son3000_4000 {
    sonata_Pairs_digital() {
        name = "Sonata Pairs digital ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3999;

    }
}

class Sport extends watch {
    public static void sport() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                  Which company sportwatch do you want                 |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose the comapny ");
        System.out.println();
        System.out.println("1:V2A");
        System.out.println("2:SF");
        System.out.println("3:lavaredo");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sport = sc.nextInt();
        switch (sport) {
            case 1:
                V2A.v2a();
                break;
            case 2:
                SF.sf();
                break;
            case 3:
                Lavaredo.lavaredo();
                break;
            case 0:
                watch.type();
                break;
            case 4:
                System.exit(0);

        }
        if (sport != 1 && sport != 2 && sport != 3 && sport != 0 && sport != 4) {
            System.out.println("   please give right input as mentioned above");
            sport(); // method recursion
        }

    }
}

class V2A extends Sport {
    public static void v2a() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|                                   RANGE                             |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select your Casio  range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int v2a = sc.nextInt();
        switch (v2a) {
            case 1:
                V2A1000_2000.v2a1000_2000();
                break;
            case 2:
                ft2000_3000.f2000_3000();
                break;
            case 3:
                ft3000_4000.f3000_4000();
                break;
            case 0:
                Sport.sport();
                break;
            case 4:
                System.exit(0);

        }
        if (v2a != 1 && v2a != 2 && v2a != 3 && v2a != 0 && v2a != 4) {
            System.out.println("   please give right input as mentioned above");
            v2a(); // method recursion
        }

    }
}

class V2A1000_2000 extends V2A {
    public static void v2a1000_2000() {

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                                SPORT-WATCH                               |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                              Price");
        System.out.println("1: V2A Analogsport (Round)                 Rs-1836");
        System.out.println("2: V2A Military     (Square)                Rs-1995");
        System.out.println("3: V2A Analogsport   (Rectangle)            Rs-1600");
        System.err.println("4: V2A AnalogDigital (Round)                Rs-1000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int v2a1000_2000 = sc.nextInt();
        switch (v2a1000_2000) {
            case 1:
                watch.object = new V2Asport();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new V2AMilitary();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new V2AAnalogsport();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new  V2AAnalogDigital();
                 System.out.println(watch.object);
                 break;
            case 0:
                V2A.v2a();
                break;
            case 5:
                System.exit(0);

        }
        if (v2a1000_2000 != 1 && v2a1000_2000 != 2 && v2a1000_2000 != 3 && v2a1000_2000 != 0 && v2a1000_2000 != 4 && v2a1000_2000 != 5) {
            System.out.println("   please give right input as mentioned above");
            v2a1000_2000(); // method recursion
        }

    }
}

class V2Asport extends V2A1000_2000 {
    V2Asport() {
        name = "V2A sport  ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1836;

    }
}

class V2AMilitary extends V2A1000_2000 {
    V2AMilitary() {
        name = " V2A Military  ";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1995;

    }
}

class V2AAnalogsport extends V2A1000_2000 {
    V2AAnalogsport() {
        name = "V2A Analogsport";
        display = "Rectangle ";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}
class V2AAnalogDigital extends V2A1000_2000{
    V2AAnalogDigital(){
        name = "V2A Analog Digital";
        display = "Round ";
        display_size = 1.69;
        battery = "230 mah";
        price = 1000;
    }
}


class V2A2000_3000 extends V2A {
    public void v2a2000_3000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                       SPORT-WATCH                      |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                               Price");
        System.out.println("1: V2A VintageSport   (Square)              Rs-2156");
        System.out.println("2: V2A Youth-Sport    (Rectangle)           Rs-2076");
        System.out.println("3: V2A YouSport        (Round)              Rs-2999");
        System.out.println("4:V2A Digital          (Round)              Rs-2599");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 5 to  exit ");

        int v2a2000_3000 = sc.nextInt();
        switch (v2a2000_3000) {
            case 1:
                watch.object = new V2Asport();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new V2AMilitary();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new V2AAnalogsport();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new V2Adigital();
                 System.out.println(watch.object);
                 break;
            case 0:
                V2A.v2a();
                break;
            case 5:
                System.exit(0);

        }
        if (v2a2000_3000 != 1 && v2a2000_3000 != 2 && v2a2000_3000 != 3 && v2a2000_3000 != 0 && v2a2000_3000 != 4 && v2a2000_3000 != 5) {
            System.out.println("   please give right input as mentioned above");
            v2a2000_3000(); // method recursion
        }

    }
}

class V2A_Vintagesport extends V2A2000_3000 {
    V2A_Vintagesport() {
        name = "V2A Vintage sport  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class V2A_Youth_sport extends V2A2000_3000 {
    V2A_Youth_sport() {
        name = "V2A Youth sport  ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class V2A_Yousport extends V2A2000_3000 {
    V2A_Yousport() {
        name = "V2A Yousport";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class V2Adigital extends V2A2000_3000{
    V2Adigital(){
        name = "V2A Digital";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2599;
    }
}
class V2A3000_4000 extends V2A {
    public void v2a3000_4000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                                      SPORT_WATCH                             |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                                  Price");
        System.out.println("1: V2A Youth Combination (Round)               Rs-3999");
        System.out.println("2: V2A Youth             (Rrectangle)          Rs-3300");
        System.out.println("3: V2A Vin               (Square)              Rs-3499");
        System.err.println("4: V2A 2               (Round)                 Rs-3899");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int v2a3000_4000 = sc.nextInt();
        switch (v2a3000_4000) {
            case 1:
                watch.object = new V2Asport();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new V2AMilitary();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new V2AAnalogsport();
                 System.out.println(watch.object);
                 break;
            case 4:
                watch.object = new V2A2();
                 System.out.println(watch.object);
                 break;
            case 0:
                V2A.v2a();
                break;
            case 5:
                System.exit(0);

        }
        if (v2a3000_4000 != 1 && v2a3000_4000 != 2 && v2a3000_4000 != 3 && v2a3000_4000 != 0 && v2a3000_4000 != 4 && v2a3000_4000 != 5) {
            System.out.println("   please give right input as mentioned above");
            v2a3000_4000(); // method recursion
        }

    }
}

class V2A_YouthCombination extends V2A3000_4000 {
    V2A_YouthCombination() {
        name = "V2A Youth Combination";
        display = "Round";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class V2A_Youth extends V2A3000_4000 {
    V2A_Youth() {
        name = " V2A Youth  ";
        display = "Rectangle";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class V2A_Vin extends V2A3000_4000 {
    V2A_Vin() {
        name = "V2A Vin  ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}
class V2A2 extends V2A3000_4000{
    V2A2(){
        name = "V2A 2 ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3899;
    }
}

// // V2A end

// fastrack start
class SF extends Sport {
    public static void sf() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|                                  RANGE                               |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select fastrack range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sf = sc.nextInt();
        switch (sf) {
            case 1:
                SF1000_2000.sf1000_2000();
                break;
            case 2:
                SF2000_3000.sf2000_3000();
                break;
            case 3:
                SF3000_4000.sf3000_4000();
                break;
            case 0:
                Sport.sport();
                break;
            case 4:
                System.exit(0);

        }
        if (sf != 1 && sf != 2 && sf != 3 && sf != 0 && sf != 4) {
            System.out.println("   please give right input as mentioned above");
            sf(); // method recursion
        }

    }
}

class SF1000_2000 extends SF {
    public static void sf1000_2000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                             SPORT WATCH                           |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                       Price");
        System.out.println("1: SF Economy (Round)              Rs-1995");
        System.out.println("2: SF Ocean   (Square)             Rs-1105");
        System.out.println("3: SF Sporty   (Rectangle)         Rs-1600");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sf1000_2000 = sc.nextInt();
        switch (sf1000_2000) {
            case 1:
                watch.object = new SFEconomy();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new SFOcean();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new SFSporty();
                 System.out.println(watch.object);
                 break;
            case 0:
                SF.sf();
                break;
            case 4:
                System.exit(0);

        }
        if (sf1000_2000 != 1 && sf1000_2000 != 2 && sf1000_2000 != 3 && sf1000_2000 != 0 && sf1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            sf1000_2000(); // method recursion
        }

    }
}

class SFEconomy extends SF1000_2000 {
    SFEconomy() {
        name = " SF Economy ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1995;

    }
}

class SFOcean extends SF1000_2000 {
    SFOcean() {
        name = " SF Ocean";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1105;

    }
}

class SFSporty extends SF1000_2000 {
    SFSporty() {
        name = "SF Sporty  ";
        display = "Rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1600;

    }
}

class SF2000_3000 extends SF {
    public static void sf2000_3000() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                           SPORT WATCH                            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                                Price");
        System.out.println("1: SF Xtreme  (square)                       Rs-2156");
        System.out.println("2: SF Carbon   (Rectangle)                   Rs-2076");
        System.out.println("3: SF Camo      (Round)                      Rs-2999");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sf2000_3000 = sc.nextInt();
        switch (sf2000_3000) {
            case 1:
                watch.object = new SFXtreme();// upcasting
                break;
            case 2:
                watch.object = new SFCarbon();
                break;
            case 3:
                watch.object = new SFCamo();
                break;
            case 0:
                SF.sf();
                break;
            case 4:
                System.exit(0);

        }
        if (sf2000_3000 != 1 && sf2000_3000 != 2 && sf2000_3000 != 3 && sf2000_3000 != 0 && sf2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            sf2000_3000(); // method recursion
        }

    }
}

class SFXtreme extends SF2000_3000 {
    SFXtreme() {
        name = "SF Xtreme ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2156;

    }
}

class SFCarbon extends SF2000_3000 {
    SFCarbon() {
        name = "SF Carbon ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2076;

    }
}

class SFCamo extends SF2000_3000 {
    SFCamo() {
        name = "SF Camo   ";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2999;

    }
}

class SF3000_4000 extends SF {
    public static void sf3000_4000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                               SPORT WATCH                          |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                            Price");
        System.out.println("1: SF watch     (Rectangle)              Rs-3999");
        System.out.println("2: SF Mean Machines  (Round)             Rs-3300");
        System.out.println("3: SF Denim        (Square)               Rs-3499");
        System.out.println("----------------------------------------------------------");

        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int sf3000_4000 = sc.nextInt();
        switch (sf3000_4000) {
            case 1:
                watch.object = new SFwatch();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new SFMeanMachines();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new SFDenim();
                 System.out.println(watch.object);
                 break;
            case 0:
                SF.sf();
                break;
            case 4:
                System.exit(0);

        }
        if (sf3000_4000 != 1 && sf3000_4000 != 2 && sf3000_4000 != 3 && sf3000_4000 != 0 && sf3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            sf3000_4000(); // method recursion
        }

    }
}

class SFwatch extends SF3000_4000 {
    SFwatch() {
        name = "SF watch ";
        display = "Rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }
}

class SFMeanMachines extends SF3000_4000 {
    SFMeanMachines() {
        name = "SF Mean Machines ";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class SFDenim extends SF3000_4000 {
    SFDenim() {
        name = "SF Denim   ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3499;

    }
}

// sf end

// lavaredo start
class Lavaredo extends Sport {
    public static void lavaredo() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                                 RANGE                              |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select lavaredol range ");
        System.out.println();
        System.out.println("1:1000-2000");
        System.out.println("2:2100-3000");
        System.out.println("3:3100-4000");
        System.out.println("----------------------------------------------------------");

        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int lavaredo = sc.nextInt();
        switch (lavaredo) {
            case 1:
                L1000_2000.l1000_2000();
                break;
            case 2:
                L2000_3000.l2000_3000();
                break;
            case 3:
                L3000_4000.l3000_4000();
                break;
            case 0:
                Sport.sport();
                break;
            case 4:
                System.exit(0);

        }
        if (lavaredo != 1 && lavaredo != 2 && lavaredo != 3 && lavaredo != 0 && lavaredo != 4) {
            System.out.println("   please give right input as mentioned above");
            lavaredo(); // method recursion
        }

    }
}

class L1000_2000 extends Lavaredo {
    public static void l1000_2000() {

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                              SPORT WATCH                        |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                             Price");
        System.out.println("1: lavaredosport        (Round)          Rs-1695");
        System.out.println("2: lavaredo Analogsport (Square)         Rs-1200");
        System.out.println("3: lavaredo Digital sport (Rectangle)    Rs-1690");
        System.out.println("----------------------------------------------------------");

        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int l1000_2000 = sc.nextInt();
        switch (l1000_2000) {
            case 1:
                watch.object = new lavaredosport();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new lavaredoAnalogsport();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new lavaredoDigitalsport();
                 System.out.println(watch.object);
                 break;
            case 0:
                Lavaredo.lavaredo();
                break;
            case 4:
                System.exit(0);

        }
        if (l1000_2000 != 1 && l1000_2000 != 2 && l1000_2000 != 3 && l1000_2000 != 0 && l1000_2000 != 4) {
            System.out.println("   please give right input as mentioned above");
            l1000_2000(); // method recursion
        }

    }
}

class lavaredosport extends L1000_2000 {
    lavaredosport() {
        name = "lavaredosport  ";
        display = "Round";
        display_size = 1.85;
        battery = "300 mah";
        price = 1695;

    }
}

class lavaredoAnalogsport extends L1000_2000 {
    lavaredoAnalogsport() {
        name = "lavaredo Analogsport ";
        display = "Square";
        display_size = 1.85;
        battery = "260 mah";
        price = 1200;

    }
}

class lavaredoDigitalsport extends L1000_2000 {
    lavaredoDigitalsport() {
        name = "lavaredo Digital sport  ";
        display = "Rectangle";
        display_size = 1.69;
        battery = "230 mah";
        price = 1690;

    }
}

class L2000_3000 extends Lavaredo {
    public static void l2000_3000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                                SPORT WATCH                         |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                                Price");
        System.out.println("1: lavaredo c sport      (Square)            Rs-2106");
        System.out.println("2:  lavaredo demin sport (Rectangle)         Rs-2276");
        System.out.println("3:  lavaredo ss sport     (Round)             Rs-2500");
        System.out.println("----------------------------------------------------------");

        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int l2000_3000 = sc.nextInt();
        switch (l2000_3000) {
            case 1:
                watch.object = new lavaredocsport();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new lavaredodeminsport();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new lavaredossport();
                 System.out.println(watch.object);
                 break;
            case 0:
                Lavaredo.lavaredo();
                break;
            case 4:
                System.exit(0);

        }
        if (l2000_3000 != 1 && l2000_3000 != 2 && l2000_3000 != 3 && l2000_3000 != 0 && l2000_3000 != 4) {
            System.out.println("   please give right input as mentioned above");
            l2000_3000(); // method recursion
        }

    }
}

class lavaredocsport extends L2000_3000 {
    lavaredocsport() {
        name = " lavaredo c sport  ";
        display = "Square";
        display_size = 1.39;
        battery = "230 mah";
        price = 2106;

    }
}

class lavaredodeminsport extends L2000_3000 {
    lavaredodeminsport() {
        name = "lavaredo demin sport   ";
        display = "Rectangle";
        display_size = 1.32;
        battery = "300 mah";
        price = 2276;

    }
}

class lavaredossport extends L2000_3000 {
    lavaredossport() {
        name = "lavaredo ss sport  ";
        display = "Round";
        display_size = 1.78;
        battery = "290 mah";
        price = 2500;

    }
}

class L3000_4000 extends Lavaredo {
    public static void l3000_4000() {

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("|                             SPORT WATCH                      |");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your sport watch");
        System.out.println();
        System.out.println("         Name                           Price");
        System.out.println("1: Lavaredo sport       (Rectangle)     Rs-3999");
        System.out.println("2: Lavaredo Stridesport (Round)         Rs-3300");
        System.out.println("3: Lavaredo Pairs sport  (Square)       Rs-3999");
        System.out.println("----------------------------------------------------------");

        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int l3000_4000 = sc.nextInt();
        switch (l3000_4000) {
            case 1:
                watch.object = new Lavaredosport2();// upcasting
                 System.out.println(watch.object);
                 break;
            case 2:
                watch.object = new LavaredoStridesport();
                 System.out.println(watch.object);
                 break;
            case 3:
                watch.object = new LavaredoPairsport();
                 System.out.println(watch.object);
                 break;
            case 0:
                Lavaredo.lavaredo();
                break;
            case 4:
                System.exit(0);

        }
        if (l3000_4000 != 1 && l3000_4000 != 2 && l3000_4000 != 3 && l3000_4000 != 0 && l3000_4000 != 4) {
            System.out.println("   please give right input as mentioned above");
            l3000_4000(); // method recursion
        }

    }
}

class Lavaredosport2 extends L3000_4000 {
    Lavaredosport2() {
        name = "Lavaredo sport ";
        display = "Rectangle ";
        display_size = 1.79;
        battery = "230 mah";
        price = 3999;

    }

}

class LavaredoStridesport extends L3000_4000 {
    LavaredoStridesport() {
        name = "Lavaredo Stridesport";
        display = "Round";
        display_size = 1.75;
        battery = "300 mah";
        price = 3300;

    }
}

class LavaredoPairsport extends L3000_4000 {
    LavaredoPairsport() {
        name = " Lavaredo Pairs sport  ";
        display = "Square";
        display_size = 1.55;
        battery = "290 mah";
        price = 3999;

    }

}

class users {
    static String name;
    static long mobile_no;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    users(String name, long mobile_no, String username, String password) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.username = username;
        this.password = password;

    }

}

class Payment extends watch {
    public static void payment() {

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("|                             PAYMENT                         |");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose your Payment process");
        System.out.println();
        System.out.println("1: UPI");
        System.out.println("2: Net Banking");
        System.out.println("3: Card");
        System.out.println("----------------------------------------------------------");
        System.out.println("press 0 to go back ");
        System.out.println("press 4 to  exit ");

        int pay = sc.nextInt();
        switch (pay) {
            case 1:
                Upi Upi = new Upi();
                Upi.upi();
                break;
            case 2:
                Upi Upi2 = new Upi();
                Upi2.upi();
                break;
            case 3:
                Upi Upi3 = new Upi();
                Upi3.upi();
                break;
            case 0:
                Payment.payment();
                break;
            case 4:
                System.exit(0);

        }
        if (pay != 1 && pay != 2 && pay != 3 && pay != 0 && pay != 4) {
            System.out.println("   please give right input as mentioned above");
            payment(); // method recursion
        }
    }

}

class details {
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

class Upi {

    public void upi() {

        Scanner upi = new Scanner(System.in);
        System.out.println("Enter upi id: ");
        String id = upi.nextLine();

        System.out.println("Enter password: ");
        String password = upi.nextLine();

        System.out.println("Payment successfull");

        System.out.println();

        System.out.println("For recipt GO to the next page enter 000");

        int rr = upi.nextInt();
        switch (rr) {
            case 000:
                recipt r = new recipt();
                r.recipt1();
        }

    }
}

// buy

// class buy {
// private String Name;
// private int MobileNo;

// public String getName() {
// return Name;
// }

// public int getMobileNo() {
// return MobileNo;
// }

// }

// recipt
class p1 extends recipt {
}

class recipt {

    public void recipt1() {
        LocalDate date = LocalDate.now();
        p1 ref = new p1();

        Scanner ss = new Scanner(System.in);

        // System.out.println();
        // System.out.println("Enter Name: ");
        // String Name = ss.nextLine();

        // System.out.println("Enter Mobile No");
        // int MobileNo = ss.nextInt();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("                                     SP WATCH                                         ");
        System.out.println("                                      Recipt                                          ");
        System.out.println("                                                    Recipt No: " + ref.hashCode() + "");
        System.out.println("                                                    Date: " + date + "");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out
                .println("Name :" + users.name + "                                   Mobile No:" + users.mobile_no
                        + "           ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(
                "Product name : " + watch.object.name + " " + watch.object.display + "                         ");
        System.out.println("Price name : " + watch.object.price + "                               ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out
                .println("Total price : " + watch.object.price + "                                                   ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("1 year warranty");
        System.out.println();
        System.out.println("=========================THANKYOU FOR VISITING=========================================");

    }

}

// main class
class qwerty {

    static Scanner s = new Scanner(System.in);

    public static  void bu() {

        // Scanner s = new Scanner(System.in);
        int bn = s.nextInt();
        switch (bn) {
            case 1:
                s.nextLine();
                login();
               
                //Payment.payment();
                
                break;
            case 2:
                watch.type();
                break;
            case 3:
                System.exit(0);
        }
        if (bn != 1 && bn != 2) {
            System.out.println("   please give right input as mentioned above");
            bu(); // method recursion
        }
    }

    // main method
    public static void main(String[] args) {
        register();
        watch a = new watch();
        a.type();

        //  System.out.println();
        //  System.out.println("----------------------------------------------------------");
        // System.out.println("|                        OVERVIEW                        |");
        //  System.out.println("----------------------------------------------------------");
        //  System.out.println("Name : " + watch.object.name);
        //  System.out.println("Display : " + watch.object.display);
        //  System.out.println("Dislpay Size : " + watch.object.display_size);
        //  System.out.println("Battery : " + watch.object.battery);
        //  System.out.println("price : " + watch.object.price);
        //  System.out.println();

        // System.out.println(
        //         "If you want to buy then enter 1 or If you want to change the product then enter 2 or exit for 3");
        // System.out.println();
        // System.out.println("Please Login to buy");

         //login();

        qwerty b = new qwerty();
        //login();
        b.bu();

    }

    public static void register() {
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("|                        REGISTER                         |");
        System.out.println("----------------------------------------------------------");
        System.out.println("Enter full name");
        String name = s.nextLine();

        System.out.println("Enter mobile no");
        long mobile_no = s.nextLong();

        System.out.println("Create user name");
        s.nextLine();
        String username = s.nextLine();

        System.out.println("Create password");
        String password = s.nextLine();

        u = new users(name, mobile_no, username, password);

    }

    static users u;

    public static void login() {
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("|                        LOGIN                           |");
        System.out.println("----------------------------------------------------------");
        System.out.println("Enter user name");
        
        String username = s.nextLine();
       

        System.out.println("Enter password");
        String password = s.nextLine();

        if (username.equals(u.getUsername()) && password.equals(u.getPassword())) 
        {
            System.out.println("Login sccessuful");
            Payment.payment();

        } else {
            //System.out.println(u.getUsername());
           //System.out.println(u.getPassword());
            System.out.println("Invalid data");
            login();
        }

    }

}

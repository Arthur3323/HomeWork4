public class Main {
    public static void main(String[] args) {


        // Задача №1
        System.out.println("Решение по задаче №1");

        int age = 19;
        int adultAge = 18;

        boolean isAgeAdult = age >= adultAge;
        String beginningText = "Если возраст человека равен ";
        String adultText = ", то он совершеннолетний";
        String notAdultText = ", он не достиг совершеннолетия, нужно немного подождать";

        if (isAgeAdult) {
            System.out.println(beginningText + age + adultText);
        } else {
            System.out.println(beginningText + age + notAdultText);
        }


        // Задача №2
        System.out.println("\nРешение по задаче №2");
        int temperature = 3;

        int boundaryTemperature = 5;
        boolean isTemperatureCold = temperature <= boundaryTemperature;
        String beginningText2 = "На улице ";
        String coldText = " градусов, нужно надеть шапку";
        String warmText = " градусов, можно идти без шапки";

        if (isTemperatureCold) {
            System.out.println(beginningText2 + temperature + coldText);
        } else {
            System.out.println(beginningText2 + temperature + warmText);
        }


        // Задача №3
        System.out.println("\nРешение по задаче №3");

        int speed = 70;

        int boundarySpeed = 60;
        boolean isSpeeding = speed >= boundarySpeed;
        String beginningText3 = "Если скорость ";
        String speeding = " , то придется заплатить штраф ";
        String notSpeeding = " , то можно ездить спокойно";

        if (isSpeeding) {
            System.out.println(beginningText3 + speed + speeding);
        } else {
            System.out.println(beginningText3 + speed + notSpeeding);
        }

        // Задача №4
        System.out.println("\nРешение по задаче №4");

        int personAge = 10;

        boolean isKindergartenAge = personAge >= 2 && personAge <= 6;
        boolean isSchoolAge = personAge >= 7 && personAge <= 17;
        boolean isUniversityAge = personAge >= 18 && personAge <= 24;
        boolean isJobAge = personAge > 24;

        String beginningText4 = "Если возраст человека равен ";
        String middleText = ", то ему нужно ходить ";
        String kindergartText = "в детский сад";
        String schoolText = "в школу";
        String universityText = "в университет";
        String jobText = "на работу";

        if (isKindergartenAge) {
            System.out.println(beginningText4 + personAge + middleText + kindergartText);
        } else if (isSchoolAge) {
            System.out.println(beginningText4 + personAge + middleText + schoolText);
        } else if (isUniversityAge) {
            System.out.println(beginningText4 + personAge + middleText + universityText);
        } else if (isJobAge) {
            System.out.println(beginningText4 + personAge + middleText + jobText);
        } else System.out.println("Ему нужно учиться ходить");


        // Задача №5
        System.out.println("\nРешение по задаче №5");

        int childAge = 15;

        boolean noRide = childAge < 5;
        boolean rideWithAdult = childAge >= 5 && childAge < 14;
        boolean canRide = childAge >= 14;

        String beginningText5 = "Если возраст ребенка равен ";
        String middleText5 = ", то ему ";
        String noRideText = "нельзя кататься на аттракционе";
        String rideWithAdultText = "можно кататься на аттракционе в сопровождении взрослого";
        String canRideText = "можно кататься на аттракционе без сопровождения взрослого";


        if (noRide) {
            System.out.println(beginningText5 + childAge + middleText5 + noRideText);
        } else if (rideWithAdult) {
            System.out.println(beginningText5 + childAge + middleText5 + rideWithAdultText);
        } else if (canRide) {
            System.out.println(beginningText5 + childAge + middleText5 + canRideText);
        }


        // Задача №6
        System.out.println("\nРешение по задаче №6");

        int numberOfPassengers = 60;

        int seatingCapacity = 60;
        int carriageCapacity = 102;

        boolean isSeatingCapacity = numberOfPassengers < seatingCapacity;
        boolean isStandCapacity = numberOfPassengers <= carriageCapacity;
        String beginningText6 = "Пассажиров в вагоне ";
        String seatingText = " еще есть сидячих мест в вагоне: ";
        String standingText = " еще есть стоячих мест в вагоне: ";
        String packedText = " вагон полностью забит";

        int freeSeat = seatingCapacity - numberOfPassengers;
        int freeStand = carriageCapacity - numberOfPassengers;

        if (isSeatingCapacity) {
            System.out.println(beginningText6 + numberOfPassengers + seatingText + freeSeat);
        } else if (isStandCapacity) {
            System.out.println(beginningText6 + numberOfPassengers + standingText + freeStand);
        } else {
            System.out.println(beginningText6 + numberOfPassengers + packedText);
        }

        // Задача №7
        System.out.println("\nРешение по задаче №7");

        int one = 5;
        int two = 11;
        int three = 11;

        String textOfNumber = "Большее число : ";
        boolean moreOne = one >= two && one >= three;
        boolean moreTwo = two >= one && two >= three;
        boolean moreThree = three >= one && three >= two;

        if (moreOne) {
            System.out.println(textOfNumber + one);
        } else if (moreTwo) {
            System.out.println(textOfNumber + two);
        } else if (moreThree) {
            System.out.println(textOfNumber + three);
        }
    }
}

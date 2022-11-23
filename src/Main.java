import transport.Car;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", -1998, "", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 1992, "Калиниград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "");
        Human vladimir = new Human("Владимир", 21, "Казань", "");

        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println();

        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России", "механика", "седан", "а201аа123", 5, "летняя");
        Car audiA8 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, "черного", 2020, "Германии", "автомат", "седан", "а201аа123", 5, "зимняя");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черного", 2021, "Германии", "автомат", "купе", "а201аа123", 2, "зимняя");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красного", 2018, "Южной Корее", "автомат", "SUV", "a201ff555", 5, "летняя");
        Car hyundaiAvante = new Car("Hyandai", "", -1.6, null, -2016, "Южной Корее", "механика", "седан", "a201aa123", 5, "зимняя");

        Car.Key keyLadaGranta = ladaGranta.new Key("нет", "нет");
        Car.Key keyAudiA8 = audiA8.new Key("да", "да");
        Car.Key keyBmwZ8 = bmwZ8.new Key("да", "да");
        Car.Key keyKiaSportage = kiaSportage.new Key("нет", "да");
        Car.Key keyHyundaiAvante = hyundaiAvante.new Key("да", "нет");

        ladaGranta.setKey(keyLadaGranta);
        audiA8.setKey(keyAudiA8);
        bmwZ8.setKey(keyBmwZ8);
        kiaSportage.setKey(keyKiaSportage);
        hyundaiAvante.setKey(keyHyundaiAvante);

        Calendar ladaGrantaInsuranceCalendar = new GregorianCalendar(2022, Calendar.NOVEMBER, 30);
        Calendar audiA8InsuranceCalendar = new GregorianCalendar(2022, Calendar.DECEMBER, 24);
        Calendar bmwZ8InsuranceCalendar = new GregorianCalendar(2023, Calendar.FEBRUARY, 1);
        Calendar kiaSportageInsuranceCalendar = new GregorianCalendar(2023, Calendar.AUGUST, 15);
        Calendar hyundaiAvanteInsuranceCalendar = new GregorianCalendar(2022, Calendar.OCTOBER, 20);

        Car.Insurance insuranceLadaGranta = ladaGranta.new Insurance(ladaGrantaInsuranceCalendar, 2000, "000000001");
        Car.Insurance insuranceAudiA8 = audiA8.new Insurance(audiA8InsuranceCalendar, 30000, "000000002");
        Car.Insurance insuranceBmwZ8 = bmwZ8.new Insurance(bmwZ8InsuranceCalendar, 35000, "000000001");
        Car.Insurance insuranceKiaSportage = kiaSportage.new Insurance(kiaSportageInsuranceCalendar, 9000, "300000001");
        Car.Insurance insuranceHyundaiAvante = hyundaiAvante.new Insurance(hyundaiAvanteInsuranceCalendar, 10000, "0000000011");

        ladaGranta.setInsurance(insuranceLadaGranta);
        audiA8.setInsurance(insuranceAudiA8);
        bmwZ8.setInsurance(insuranceBmwZ8);
        kiaSportage.setInsurance(insuranceKiaSportage);
        hyundaiAvante.setInsurance(insuranceHyundaiAvante);

        System.out.println();

        System.out.println(ladaGranta);
        ladaGranta.examValidDate();
        ladaGranta.wheelsExam();
        ladaGranta.examNumberOfInsurance();
        System.out.println();

        System.out.println();

        System.out.println(audiA8);
        audiA8.examValidDate();
        audiA8.wheelsExam();
        audiA8.examNumberOfInsurance();

        System.out.println();

        System.out.println(bmwZ8);
        bmwZ8.examValidDate();
        bmwZ8.wheelsExam();
        bmwZ8.examNumberOfInsurance();

        System.out.println();

        System.out.println(kiaSportage);
        kiaSportage.examValidDate();
        kiaSportage.wheelsExam();
        kiaSportage.examNumberOfInsurance();

        System.out.println();

        System.out.println(hyundaiAvante);
        hyundaiAvante.examValidDate();
        hyundaiAvante.wheelsExam();
        hyundaiAvante.examNumberOfInsurance();

        System.out.println();

        Flower roza = new Flower("Роза обыкновенная", "белый", "Голландия", 35.59f, 0, 3);
        Flower chrysanthenum = new Flower("Хризантема", "фиолетовый", "ЮАР", 15.00f, 5, 5);
        Flower peony = new Flower("Пион", "розовый", "Англия", 69.90f, 1, 1);
        Flower gypsophila = new Flower("Гипсофила обыкновенная", "оранжевый", "Турция", 19.50f, 10, 1);

        Flower [] flowers = new Flower[] {roza, chrysanthenum,  gypsophila};
        System.out.println("Состав букета - " + Arrays.toString(flowers));
        System.out.println();

        System.out.println(roza);
        System.out.println(chrysanthenum);
        System.out.println(peony);
        System.out.println(gypsophila);

        System.out.println("Количество цветов в букете " + Flower.getTotalQuantityInBouqeut(flowers));
        System.out.println("Стоимость букета " + Flower.getCostOfBouqeut(flowers) + " рублей.");
        System.out.println("Срок стояния букета " + Flower.getMinLifeSpan(flowers) + " дней.");


    }
}
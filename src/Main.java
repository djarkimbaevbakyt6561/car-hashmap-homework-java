import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, CarData> carDataMap = new HashMap<>(Map.of(
                new Car(1, "09KG479AAB"), new CarData((short) 1997, "Audi A4 Седан Quattro", 250000, "white"), new Car(2, "09KG479AAB"), new CarData((short) 1997, "BMW 5-series", 200000, "black"),
                new Car(3, "09KG579ACB"), new CarData((short) 2007, "Nissan Altima Hybrid", 700000, "white"),
                new Car(4, "09KG999ADB"), new CarData((short) 2017, "Ferrari Portofino", 20000000, "red"),
                new Car(5, "09KG555ABB"), new CarData((short) 2019, "BMW 3-й серии (G20)", 2500000, "white"),
                new Car(6, "09KG111ALB"), new CarData((short) 2023, "Cadillac GT4", 15000000, "gray")));
        for (Map.Entry<Car, CarData> carData : carDataMap.entrySet()){
            System.out.println(carData.getKey() + " " + carData.getValue());
        }
    }
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Java\\Serialization\\car.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car car = (Car) ois.readObject();

        System.out.println("Car" + car.getName() + "\n" +
                "Year" + car.getYear() + "\n" +
                "Power" + car.getEngine().getHp());

        fis.close();
        ois.close();
    }

}

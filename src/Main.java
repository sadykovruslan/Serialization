import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Engine turboEngine = new Engine();
        turboEngine.setHp(121);

        Car vwJetta = new Car("Volkswgen Jetta", 2014, turboEngine);

        FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\Serialization\\car.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(vwJetta);
        oos.close();
        fos.close();
    }
}
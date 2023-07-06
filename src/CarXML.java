import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class CarXML {
    public static void main(String[] args) throws JAXBException {
        Engine engine = new Engine();
        engine.setHp(150);

        Car skoda = new Car("Octavia", 2019, engine);


        File file = new File("D:\\Java\\Serialization\\CarXml.txt");
        JAXBContext jxb = JAXBContext.newInstance(Car.class);
        Marshaller marshMello = jxb.createMarshaller();
        marshMello.marshal(skoda, file);

    }
}

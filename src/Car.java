import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int year;
    private Engine engine;
    private String owner;

        private int price;


    public Car(String name, int year, Engine engine) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.owner = owner;
        this.price = price;

    }

    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public int getYear() {
        return year;
    }
    @XmlElement
    public Engine getEngine() {
        return engine;
    }
    @XmlElement
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    @XmlElement
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

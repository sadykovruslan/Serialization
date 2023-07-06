import java.io.*;

public class UserStorage implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User("Rusya", "123");
        FileOutputStream save = new FileOutputStream(new File("D:\\Java\\Serialization\\user.txt"));
        ObjectOutputStream saveObj = new ObjectOutputStream(save);
        saveObj.writeObject(user);

        //////////////////

        FileInputStream readUser = new FileInputStream("D:\\Java\\Serialization\\user.txt");
        ObjectInputStream objectUser = new ObjectInputStream(readUser);
        User savedUser = (User) objectUser.readObject();
        System.out.println("Login: " + savedUser.getUserName() + "\n" +
                            "Password: " + savedUser.getPassword());

        save.close();
        saveObj.close();
        readUser.close();
        objectUser.close();
    }





}

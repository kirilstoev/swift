package FileManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File {

    String name;
    String location;
    String creationDate;
    boolean isDeleted;

    public File(String name, String location) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.name = name;
        this.location = location;
        this.creationDate = dateFormat.format(date);
        this.isDeleted = false;
    }

    public void Move(String newLocation) {
        this.location = newLocation;
    }

    public void Delete() {
        this.isDeleted = true;
    }

    public void Execute() {
        System.out.println("Executing " + this.location + "/" + this.name+"\n");
    }

    public void Info() {
    }

}

package FileManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContentFile extends File {

    String content;
    String lastModifiedDate;

    public ContentFile(String content, String name, String location) {
        super(name, location);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.content = content;
        this.lastModifiedDate =dateFormat.format(date);
    }

    public void Modify(String data) {
        this.content = data;
    }

    @Override
    public void Info() {
        System.out.printf("Name: %s/%s %s \n"
                + "Creation date: %s\n"
                + "Last modification date: %s\n", this.location, this.name, this.isDeleted == true ? "DELETED" : "", this.creationDate, this.lastModifiedDate);
    }
}

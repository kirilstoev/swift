package FileManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExecutableFile extends File {

    String lastExecutionDate;
    String[] requiredResources = new String[500];
    int count = 0;

    public ExecutableFile(String[] requiredResources, String name, String location, int count) {
        super(name, location);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.lastExecutionDate = dateFormat.format(date);
        this.requiredResources = requiredResources;
        this.count = count;
    }

    public File Copy(String newLocation) {
        return new ExecutableFile(this.requiredResources, this.name, newLocation, count);
    }

    @Override
    public void Info() {
        String resources = "";
        for (int i = 0; i < count; i++) {
            resources += requiredResources[i] + "\n";
        }
        System.out.printf("Name: %s/%s %s \n"
                + "Creation date: %s\n"
                + "Last execution date: %s\n"
                + "Required resources: \n %s\n", this.location, this.name, this.isDeleted == true ? "DELETED" : "", this.creationDate, this.lastExecutionDate, resources);
    }
}

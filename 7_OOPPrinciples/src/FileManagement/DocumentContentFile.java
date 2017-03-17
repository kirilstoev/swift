package FileManagement;

public class DocumentContentFile extends ContentFile {

    public DocumentContentFile(String content, String name, String location) {
        super(content, name, location);
    }

    public File Copy(String newLocation) {
        return new DocumentContentFile(this.content, this.name, newLocation);
    }

    @Override
    public void Execute() {
        if (this.isDeleted == false) {
            String hex = "2713";
            int intValue = Integer.parseInt(hex, 16);
            System.out.println((char) intValue + "" + (char) intValue + "" + (char) intValue + " " + this.location + "/" + this.name + "\n" + this.content + "\n");
        }
    }

}

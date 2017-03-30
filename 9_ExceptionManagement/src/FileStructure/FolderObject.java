package FileStructure;

public class FolderObject extends FileSystemObject {

    FileObject[] children = new FileObject[100];
    int childrenCount=0;

    public FolderObject(String child, String parent, String name) {
        super(parent, name);
        children[0] = new FileObject(name, child);
        childrenCount++;
    }
    
    public void addChild(String child, String parent){
        children[childrenCount] = new FileObject(parent, child);
        childrenCount++;
    }

    public FileObject[] getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }
    
}

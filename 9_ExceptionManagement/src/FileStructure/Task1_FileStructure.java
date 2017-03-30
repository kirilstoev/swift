package FileStructure;

import java.util.Scanner;

public class Task1_FileStructure {

    private static void checkDirectoryStructure(FileSystemObject[] fileFolder, String parent, String name) {
        for (int i = 0; i < fileFolder.length; i++) {
            if (fileFolder[i] instanceof FolderObject) {
                FolderObject folder = (FolderObject) fileFolder[i];
                if (parent.isEmpty() || parent.equals("")) {
                    folder.getName().equals(name);
                } else {
                    folder.getParent().equals(parent);
                    folder.getName().equals(name);
                }
            }
        }
    }

    private static void checkDirectoryExists(FileSystemObject[] fileFolder, String parent, String name) throws MyException {
        for (FileSystemObject fileFolder1 : fileFolder) {
            if (fileFolder1 instanceof FolderObject) {
                FolderObject folder = (FolderObject) fileFolder1;
                if (!folder.getName().equals(name) && !folder.getParent().equals(parent)) {
                    throw new MyException("Directory does not exist.");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String readRow = "";
        FileSystemObject[] fileFolder = new FileSystemObject[100];
        int fileFolderCount = 0;
        while (!readRow.equals("END")) {
            readRow = sc.nextLine();
            if (!readRow.equals("END")) {
                String[] splitReadRow = readRow.split(" ");
                if (splitReadRow[0].equals("mkdir")) {
                    String[] splitRow = splitReadRow[1].split("/");
                    for (int i = 0; i < splitRow.length; i++) {
                        // It is directory
                        switch (splitRow.length) {
                            case 1:
                                // There is only one folder
                                fileFolder[fileFolderCount] = new FolderObject("", "", splitRow[i]);
                                fileFolderCount++;
                                break;
                            case 2:
                                // There is one parent and given folder
                                if (i == 0) {
                                    try {
                                        checkDirectoryExists(fileFolder, "", splitRow[0]);
                                    } catch (MyException e) {
                                        e.printStackTrace();
                                    }
                                    fileFolder[fileFolderCount] = new FolderObject(splitRow[i + 1], "", splitRow[i]);
                                    fileFolderCount++;
                                } else {
                                    try {
                                        checkDirectoryExists(fileFolder, splitRow[i - 1], splitRow[i]);
                                    } catch (MyException e) {
                                        e.printStackTrace();
                                    }
                                    fileFolder[fileFolderCount] = new FolderObject("", splitRow[i - 1], splitRow[i]);
                                    fileFolderCount++;
                                }
                                break;
                            default:
                                if (i == 0) {
                                    try {
                                        checkDirectoryExists(fileFolder, "", splitRow[i]);
                                    } catch (MyException e) {
                                        e.printStackTrace();
                                    }
                                    fileFolder[fileFolderCount] = new FolderObject(splitRow[i + 1], "", splitRow[i]);
                                    fileFolderCount++;
                                } else if (i == splitRow.length - 1) {
                                    try {
                                        checkDirectoryExists(fileFolder, splitRow[i - 1], splitRow[i]);
                                    } catch (MyException e) {
                                        e.printStackTrace();
                                    }
                                    fileFolder[fileFolderCount] = new FolderObject("", splitRow[i - 1], splitRow[i]);
                                    fileFolderCount++;
                                } else {
                                    try {
                                        checkDirectoryExists(fileFolder, splitRow[i - 1], splitRow[i]);
                                    } catch (MyException e) {
                                        e.printStackTrace();
                                    }
                                    fileFolder[fileFolderCount] = new FolderObject(splitRow[i + 1], splitRow[i - 1], splitRow[i]);
                                    fileFolderCount++;
                                }
                                break;
                        }
                    }
                } else if (splitReadRow[0].equals("touch")) {
                    String[] splitRow = splitReadRow[1].split("/");
                    for (int i = 0; i < splitRow.length; i++) {
                        if (splitRow[i].contains(".")) {
                            // It is file
                            if (i > 0) {
                                fileFolder[i] = new FileObject(splitRow[i - 1], splitRow[i]);
                            } else {
                                fileFolder[i] = new FileObject("", splitRow[i]);
                            }
                        } else {
                            // Check directory structure
                            if (splitRow.length == 2) {
                                // There is at least one parent and given file
                                try {
                                    checkDirectoryStructure(fileFolder, "", splitRow[i]);
                                } catch (Exception ex) {
                                    System.out.println("Not a number.");
                                }
                            } else if (splitRow.length > 2) {
                                // There is at least one parent and given file
                                try {
                                    checkDirectoryStructure(fileFolder, splitRow[i - 1], splitRow[i]);
                                } catch (Exception ex) {
                                    System.out.println("Not a number.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

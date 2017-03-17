package FileManagement;

import java.util.Scanner;

public class Task3_FileManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        File[] files = new File[500];
        int makeCount = 0;
        do {
            String row = sc.nextLine();
            String[] splitRow = row.split(" ");
            doWhile = splitRow[0];
            switch (splitRow[0]) {
                case "MAKE":
                    if (splitRow[3].substring(0, 7).equals("CONTENT")) {
                        String[] newSplit = splitRow[3].split("=");
                        if (splitRow[1].substring(splitRow[1].length() - 4).equals(".avi") || splitRow[1].substring(splitRow[1].length() - 4).equals(".mp3")) {
                            files[makeCount] = new MediaContentFile(newSplit[1], splitRow[1], splitRow[2]);
                        } else {
                            files[makeCount] = new DocumentContentFile(newSplit[1], splitRow[1], splitRow[2]);
                        }
                    } else {
                        String[] requiredResources = new String[splitRow.length - 3];
                        for (int i = 3; i < splitRow.length; i++) {
                            requiredResources[i - 3] = splitRow[i];
                        }
                        files[makeCount] = new ExecutableFile(requiredResources, splitRow[1], splitRow[2], splitRow.length - 3);
                    }
                    makeCount++;
                    break;
                case "MOVE":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            files[i].Move(splitRow[2]);
                        }
                    }
                    break;
                case "MOD":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            ContentFile content = (ContentFile) files[i];
                            content.Modify(splitRow[2]);
                        }
                    }
                    break;
                case "COPY":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            if (files[i] instanceof MediaContentFile) {
                                MediaContentFile mediaContent = (MediaContentFile) files[i];
                                files[makeCount] = mediaContent.Copy(splitRow[2]);
                                makeCount++;
                                break;
                            } else if (files[i] instanceof DocumentContentFile) {
                                DocumentContentFile documentContent = (DocumentContentFile) files[i];
                                files[makeCount] = documentContent.Copy(splitRow[2]);
                                makeCount++;
                                break;
                            } else if (files[i] instanceof ExecutableFile) {
                                ExecutableFile executableContent = (ExecutableFile) files[i];
                                files[makeCount] = executableContent.Copy(splitRow[2]);
                                makeCount++;
                                break;
                            }
                        }
                    }
                    break;
                case "DEL":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            files[i].Delete();
                        }
                    }
                    break;
                case "EXEC":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            if (files[i] instanceof MediaContentFile) {
                                MediaContentFile mediaContent = (MediaContentFile) files[i];
                                mediaContent.Execute();
                            } else if (files[i] instanceof DocumentContentFile) {
                                DocumentContentFile documentContent = (DocumentContentFile) files[i];
                                documentContent.Execute();
                            } else if (files[i] instanceof ExecutableFile) {
                                String result = "";
                                ExecutableFile executableContent = (ExecutableFile) files[i];
                                files[i].Execute();
                                for (int j = 0; j < executableContent.count; j++) {
                                    for (int k = 0; k < makeCount; k++) {
                                        if (files[k].name.equals(executableContent.requiredResources[j])) {
                                            if (files[k] instanceof MediaContentFile) {
                                                MediaContentFile mediaContent = (MediaContentFile) files[k];
                                                mediaContent.Execute();
                                            } else if (files[i] instanceof DocumentContentFile) {
                                                DocumentContentFile documentContent = (DocumentContentFile) files[i];
                                                documentContent.Execute();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "INFO":
                    for (int i = 0; i < makeCount; i++) {
                        if (files[i].name.equals(splitRow[1])) {
                            if (files[i] instanceof ContentFile) {
                                ContentFile content = (ContentFile) files[i];
                                content.Info();
                                break;
                            } else if (files[i] instanceof ExecutableFile) {
                                ExecutableFile executableContent = (ExecutableFile) files[i];
                                executableContent.Info();
                                break;
                            }
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
        } while (!doWhile.equals("END"));
    }

}

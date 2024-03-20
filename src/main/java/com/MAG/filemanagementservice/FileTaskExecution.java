package com.MAG.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/com/MAG/filemanagementservice/file.txt");

        FileManager.informIfTheFileExists(fileObject);
        System.out.println(FileManager.createTheFileIfITDoesNotExist(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsADirectoryOrAFile(fileObject);

        OutputFileWriterManager.writeInformationIntoAFileUsingAFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingAFileWriter(fileObject.getPath(), "Altceva");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value free");

        InputFileReadManager.printDataOnTheConsole(fileObject);
        System.out.println();
        InputFileReadManager.printDataFromAFileUsingBufferedReader(fileObject);
        InputFileReadManager.printDataUsingTheEasiestWay(fileObject);

    }
}

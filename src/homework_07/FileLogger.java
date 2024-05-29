package homework_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Loggable{
    private String pathFile;

    public FileLogger(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    public String log(String message) {
        String path = "src/homework_07/CalcLog.txt";
        File logFile = new File(pathFile);
        if (!logFile.exists()){
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter logFileWrite = new FileWriter(pathFile,true);
            logFileWrite.write(message+'\n');
            logFileWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return path;
    }
}

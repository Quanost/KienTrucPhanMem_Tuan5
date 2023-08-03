package org.example.Singleton.DemoLoger_Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {
    private static Logger instance;
    private BufferedWriter bufferedWriter;
    private final String logFilePath = "C:\\Users\\acer\\Downloads\\DemoSpringCRUD\\DemoDesignPartern\\src\\main\\resources\\log.txt"; // Đường dẫn của file log.txt

    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter(logFilePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = sdf.format(new Date());
            bufferedWriter.write(timestamp + " - " + message + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đóng BufferedWriter khi không cần ghi thêm vào file nữa
    public void close() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

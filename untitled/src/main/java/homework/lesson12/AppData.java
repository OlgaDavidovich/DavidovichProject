package homework.lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {

    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save(AppData data) {

        try (FileWriter fileWriter = new FileWriter(new File("csv_file"), false)) {
            for (int i = 0; i < header.length; i++) {
                if (i == header.length - 1) {
                    fileWriter.append(header[i]);
                    fileWriter.append("\r\n");
                    fileWriter.flush();
                } else {
                    fileWriter.append(header[i]);
                    fileWriter.append(";");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter(new File("csv_file"), true)) {
            for (int i = 0; i < getData().length; i++) {
                for (int j = 0; j < getData()[i].length; j++) {
                    if (j == getData()[i].length - 1) {
                        fileWriter.write(String.valueOf(getData()[i][j]));
                        fileWriter.write("\r\n");
                    } else {
                        fileWriter.write(String.valueOf(getData()[i][j]));
                        fileWriter.write(";");
                    }
                }
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {

        AppData dataAp = new AppData();
        List lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("csv_file"));
            String line;
            if ((line = reader.readLine()) != null) {
                String[] header = line.split(";");
                dataAp.setHeader(header);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("csv_file"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                lines.add(values);
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] data = new int[lines.size()][];
        for (int i = 1; i < lines.size(); i++) {
            String[] values = (String[]) lines.get(i);
            int[] row = new int[values.length];
            for (int j = 0; j < values.length; j++) {
                row[j] = Integer.parseInt(values[j]);
            }
            data[i] = row;
        }
        dataAp.setData(data);
    }

    public static void main(String[] args) {

        AppData ob = new AppData();
        ob.header = new String[]{"Value1", "Value2", "Value3"};
        ob.data = new int[][]{{500, 300, 123}, {300, 400, 400}};
        ob.save(ob);
        ob.load();
    }
}

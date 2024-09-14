package com.rs.nhahang;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class NhaHangApplicationTests {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(new File("src/main/ds/breakfast/breakfast.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println(cell);
                    break;
                    case NUMERIC:
                        System.out.println(cell);
                        break;
                    case BOOLEAN:
                        System.out.println(cell);
                        break;
                    case FORMULA:
                        System.out.println(cell);
                        break;
                    default:
                        System.out.println("hello");
                        break;
                }
            }
            i++;
        }



    }

    @Test
    void contextLoads() {
    }

}

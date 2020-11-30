import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Workbook  workbook = new  HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Издатели");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello ");

        CellStyle cellStyle = workbook.createCellStyle();


        cellStyle.setAlignment(HorizontalAlignment.CENTER);

        Font font = workbook.createFont();
        font.setFontName("Courier new");
        font.setFontHeightInPoints((short) 12);



        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        FileOutputStream newFile = new FileOutputStream("D:\\tmp\\test.xsl");
        workbook.write(newFile);
        newFile.close();

    }

}


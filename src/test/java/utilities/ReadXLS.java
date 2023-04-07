package utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLS
{
    @DataProvider(name = "testdata")
    public Object[][] getData(Method method) throws IOException
    {
        String sheetName = method.getName();
        String path = System.getProperty("user.dir") + "/src/test/resources/testdata/testdata.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);

        int totalRows = sheet.getLastRowNum();
        Row row = sheet.getRow(0);
        int totalCols = row.getLastCellNum();
        Object[][] cell = new Object[totalRows][totalCols];
        DataFormatter dataFormatter = new DataFormatter();
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                cell[i - 1][j] = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
            }
        }
        return cell;
    }
}

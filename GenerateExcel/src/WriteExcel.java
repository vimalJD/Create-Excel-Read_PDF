import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteExcel {
	
		public static void main(String[] args) throws IOException {
			{
				try {
					String filname = "C:\\file.xls";
					WritableWorkbook workbook = Workbook.createWorkbook(new File(filname));
					WritableSheet sheet = workbook.createSheet("vimal", 0);
					
					Label label = new Label(0,0,"vimal");
					sheet.addCell(label);
					
					Number number = new Number(0,1,3.1499);
					sheet.addCell(number);
					
					workbook.write();
					workbook.close();
				} catch (WriteException e) {
					// TODO: handle exception
				}
			}
		}
}

package com.norbitltd.spoiwo.excel

class SpoiwoDocumentation {

  def usingNewLinesInCells() {

    val row = Row(
      heightInPoints = 20,
      cells = Vector(Cell.Empty, Cell("Use \n with word wrap on to create a new line"))
    )

    Sheet(
      Row.Empty, row
    ).save("ooxml-newlines.xlsx")
  }

  def dataFormats() {
    def createFormattedCellRow(value : Double, format: String) =
      Row(Cell(value, CellStyle(dataFormat = CellDataFormat(format))))

    Sheet(
      name = "format sheet",
      rows = createFormattedCellRow(11111.25, "0.0") ::
        createFormattedCellRow(11111.25, "#,##0.0000") :: Nil
    ).save("workbook.xls")
  }

  def fitSheetToOnePage() {

  }

}
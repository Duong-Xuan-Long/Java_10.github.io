package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DDatePattern {
  static String datePattern(LocalDate localDate ){
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedString = localDate.format(formatter);
      return formattedString;
  }
}

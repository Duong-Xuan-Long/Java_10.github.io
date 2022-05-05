package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datee {
    static String changeDate(LocalDate date){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formatter.format(date);
    }
}

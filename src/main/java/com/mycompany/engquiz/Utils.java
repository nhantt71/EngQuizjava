/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Win11
 */
public class Utils {
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final String DATABASE_URL = "jdbc:sqlite:src\\main\\resources\\Database\\Users.db";
    public static final Scanner sc = new Scanner(System.in);
}

package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/16.
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/#/description
 */
public class CheckRecord {
    public static boolean checkRecord(String s) {
        if(s.replace("A","").length() + 2 <= s.length() || s.indexOf("LLL") != -1)
            return false;
        return true;
    }
    public static boolean checkRecord2(String s) {
        if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL"))
            return false;
        return true;
    }
    public static boolean checkRecord3(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
    public static void main(String[] args){
        System.out.println(checkRecord("PPALLL"));
    }
}

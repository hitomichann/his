package model;

import java.util.ArrayList;

public class Hospital {
    static private ArrayList<Doctor> doctors = new ArrayList<>();
    static private ArrayList<Register> registers = new ArrayList<>();

    static {
        doctors.add(new Doctor("小白","123","xiaohuaneike","zhuanjia"));
        registers.add(new Register("小黑","123","buzhidao"));
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static void setDoctors(ArrayList<Doctor> doctors) {
        Hospital.doctors = doctors;
    }

    public static ArrayList<Register> getRegisters() {
        return registers;
    }

    public static void setRegisters(ArrayList<Register> registers) {
        Hospital.registers = registers;
    }
}

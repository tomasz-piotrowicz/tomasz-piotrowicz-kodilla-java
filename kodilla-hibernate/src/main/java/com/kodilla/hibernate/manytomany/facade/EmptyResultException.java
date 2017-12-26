package com.kodilla.hibernate.manytomany.facade;

public class EmptyResultException extends Exception {
    public static String ERR_NO_COMP = "No such company..";
    public static String ERR_NO_EMPL = "No such employee..";

    public EmptyResultException(String message){
        super(message);
    }
}

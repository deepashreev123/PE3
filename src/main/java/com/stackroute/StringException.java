package com.stackroute;

public class StringException {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("i will get printed");
        }

    }

    void FirstException(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }
}


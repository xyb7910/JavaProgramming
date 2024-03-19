package com.simon.utils;

import java.util.UUID;

public class IdUtils {
    public  static  String genId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}

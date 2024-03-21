package com.simon.pojo;

import javax.xml.crypto.Data;

@lombok.Data
public class Book {
    private Integer Id;
    private String Title;
    private String Author;
    private Data PublicationData;
    private String Publisher;
}

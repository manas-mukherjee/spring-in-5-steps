package com.springbasics.springin5steps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection(){
        System.out.println("JDBC connection");
    }


}

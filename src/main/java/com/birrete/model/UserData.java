package com.birrete.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@DynamoDBTable(tableName = "user-data")
public class UserData {

    @DynamoDBHashKey
    private String username;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String lastName;
}


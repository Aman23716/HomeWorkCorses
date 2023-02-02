package com.talentLMS.UI.dataProviders;

import com.github.javafaker.Faker;

public class MockDataGenerator {



    Faker faker = new Faker();


    public String generateMockFirstname(){
        return faker.name().firstName();
    }
    public String generateMockLasttname(){
        return faker.name().lastName();
    }
    public String generateMockEmail(){
        return faker.internet().emailAddress();
    }
    public String generateMockUsername(){
        return faker.name().username();
    }
    public String generateMockPassword(){
        return faker.internet().password(8,20,true,true,true);
    }



    
}

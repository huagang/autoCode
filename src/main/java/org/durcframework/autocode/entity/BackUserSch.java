package org.durcframework.autocode.entity;

import java.util.Date;

import org.durcframework.entity.SearchEntity;
import org.durcframework.expression.annotation.ValueField;

public class BackUserSch extends SearchEntity{

    private String usernameSch;
    private String passwordSch;
    private Date addTimeSch;

    public void setUsernameSch(String usernameSch){
        this.usernameSch = usernameSch;
    }
    
    @ValueField(column = "username")
    public String getUsernameSch(){
        return this.usernameSch;
    }

    public void setPasswordSch(String passwordSch){
        this.passwordSch = passwordSch;
    }
    
    @ValueField(column = "password")
    public String getPasswordSch(){
        return this.passwordSch;
    }

    public void setAddTimeSch(Date addTimeSch){
        this.addTimeSch = addTimeSch;
    }
    
    @ValueField(column = "add_time")
    public Date getAddTimeSch(){
        return this.addTimeSch;
    }


}
package com.abdobean.wdcalendar.model;
// Generated Jun 22, 2015 11:18:47 AM by Hibernate Tools 3.2.1.GA


import com.abdobean.wdcalendar.controller.utilities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Jqcalendar generated by hbm2java
 */
@Entity
@Table(name="jqcalendar"
    ,catalog="wdcalendar"
)
public class Jqcalendar  implements java.io.Serializable {
@Autowired
utilities utilities; 

     private Integer id;
     private String subject;
     private String location;
     private String description;
     private DateTime startTime;
     private DateTime endTime;
     private short isAllDayEvent;
     private String color;
     private String recurringRule;

    public Jqcalendar() {
    }

	
    public Jqcalendar(short isAllDayEvent) {
        this.isAllDayEvent = isAllDayEvent;
    }
    public Jqcalendar(String subject, String location, String description, DateTime startTime, DateTime endTime, short isAllDayEvent, String color, String recurringRule) {
       this.subject = subject;
       this.location = location;
       this.description = description;
       this.startTime = startTime;
       this.endTime = endTime;
       this.isAllDayEvent = isAllDayEvent;
       this.color = color;
       this.recurringRule = recurringRule;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="Subject", length=1000)
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Column(name="Location", length=200)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    @Column(name="Description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="StartTime", length=19)
    @DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }
    
    @Column(name="EndTime", length=19)
    @DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="IsAllDayEvent", nullable=false)
    public short getIsAllDayEvent() {
        return this.isAllDayEvent;
    }
    
    public void setIsAllDayEvent(short isAllDayEvent) {
        this.isAllDayEvent = isAllDayEvent;
    }
    
    @Column(name="Color", length=200)
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Column(name="RecurringRule", length=500)
    public String getRecurringRule() {
        return this.recurringRule;
    }
    
    public void setRecurringRule(String recurringRule) {
        this.recurringRule = recurringRule;
    }

    @Override
    public String toString() {
        return "["+id+","+subject+","+utilities.convertDateTimeToString(startTime)+","+utilities.convertDateTimeToString(endTime)+","+isAllDayEvent+",0,0,"+color+",1,"+location+",'']";
    }

    
  


}



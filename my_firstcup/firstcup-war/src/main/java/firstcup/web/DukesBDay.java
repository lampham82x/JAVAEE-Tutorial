/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/firstcup-examples/LICENSE.txt
 */
package firstcup.web;

import firstcup.ejb.DukesBirthdayBean;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Named
@SessionScoped
public class DukesBDay implements Serializable {

    @EJB
    private DukesBirthdayBean dukesBirthdayBean;
    protected int age;
    @NotNull
    protected Date yourBD;
    protected int ageDiff;
    protected int absAgeDiff;
    protected Double averageAgeDifference;
    private static final Logger logger = Logger.getLogger("firstcup.web.DukesBDay");


    /** Creates a new instance of DukesBDay */
    public DukesBDay() {
    }

    public String processBirthday() {
		// Insert code here
    }
    
    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
		// Insert code here
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the value of yourBD
     *
     * @return the value of yourBD
     */
    public Date getYourBD() {
        return yourBD;
    }

    /**
     * Set the value of yourBD
     *
     * @param yourBD new value of yourBD
     */
    public void setYourBD(Date yourBD) {
        this.yourBD = yourBD;
    }

    /**
     * Get the value of ageDiff
     *
     * @return the value of ageDiff
     */
    public int getAgeDiff() {
        return ageDiff;
    }

    /**
     * Set the value of ageDiff
     *
     * @param ageDiff new value of ageDiff
     */
    public void setAgeDiff(int ageDiff) {
        this.ageDiff = ageDiff;
    }

    /**
     * Get the value of absAgeDiff
     *
     * @return the value of absAgeDiff
     */
    public int getAbsAgeDiff() {
        return absAgeDiff;
    }

    /**
     * Set the value of absAgeDiff
     *
     * @param absAgeDiff new value of absAgeDiff
     */
    public void setAbsAgeDiff(int absAgeDiff) {
        this.absAgeDiff = absAgeDiff;
    }

    /**
     * Get the value of averageAgeDifference
     *
     * @return the value of averageAgeDifference
     */
    public Double getAverageAgeDifference() {
        return averageAgeDifference;
    }

    /**
     * Set the value of averageAgeDifference
     *
     * @param averageAgeDifference new value of averageAgeDifference
     */
    public void setAverageAgeDifference(Double averageAgeDifference) {
        this.averageAgeDifference = averageAgeDifference;
    }

}

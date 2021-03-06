package org.ucsc.sse.outputgenerators.report.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.ucsc.sse.datamodels.design.ThreatCategory;

import java.util.ArrayList;

@JacksonXmlRootElement(localName = "threat-category-report")
@JsonRootName("threatCategoryReport")
public class ThreatReport {

    @JacksonXmlProperty(localName = "report-name")
    @JsonProperty("report-name")
    private String name;

    @JacksonXmlProperty(localName = "time-generated")
    @JsonProperty("time-generated")
    private String date;

    @JacksonXmlElementWrapper(localName = "threat-categories")
    @JacksonXmlProperty(localName = "threat-category")
    @JsonProperty("threatCategories")
    private ArrayList<ThreatCategory> threatCategories;

    public ThreatReport(){}

    /* getters & setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<ThreatCategory> getThreatCategories() {
        return threatCategories;
    }

    public void setThreatCategories(ArrayList<ThreatCategory> threatCategories) {
        this.threatCategories = threatCategories;
    }

}

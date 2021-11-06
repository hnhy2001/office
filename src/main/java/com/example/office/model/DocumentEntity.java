package com.example.office.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "document", schema = "main", catalog = "")
public class DocumentEntity {
    private short id;
    private String num;
    private String quote;
    private String organOut;
    private Double dateOut;
    private Double dateReceive;
    private Double dateExpiration;
    private Double dateDone;
    private String fileName;
    private String filePath;
    private String location;
    private Integer status;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "num")
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Basic
    @Column(name = "quote")
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Basic
    @Column(name = "organ_out")
    public String getOrganOut() {
        return organOut;
    }

    public void setOrganOut(String organOut) {
        this.organOut = organOut;
    }

    @Basic
    @Column(name = "date_out")
    public Double getDateOut() {
        return dateOut;
    }

    public void setDateOut(Double dateOut) {
        this.dateOut = dateOut;
    }

    @Basic
    @Column(name = "date_receive")
    public Double getDateReceive() {
        return dateReceive;
    }

    public void setDateReceive(Double dateReceive) {
        this.dateReceive = dateReceive;
    }

    @Basic
    @Column(name = "date_expiration")
    public Double getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Double dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Basic
    @Column(name = "date_done")
    public Double getDateDone() {
        return dateDone;
    }

    public void setDateDone(Double dateDone) {
        this.dateDone = dateDone;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentEntity that = (DocumentEntity) o;
        return id == that.id && Objects.equals(num, that.num) && Objects.equals(quote, that.quote) && Objects.equals(organOut, that.organOut) && Objects.equals(dateOut, that.dateOut) && Objects.equals(dateReceive, that.dateReceive) && Objects.equals(dateExpiration, that.dateExpiration) && Objects.equals(dateDone, that.dateDone) && Objects.equals(fileName, that.fileName) && Objects.equals(filePath, that.filePath) && Objects.equals(location, that.location) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num, quote, organOut, dateOut, dateReceive, dateExpiration, dateDone, fileName, filePath, location, status);
    }
}

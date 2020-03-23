//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.03.23 um 12:31:09 PM CET 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zahl1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zahl2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zahl3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zahl1",
    "zahl2",
    "zahl3"
})
@XmlRootElement(name = "getSumRequest")
public class GetSumRequest {

    protected int zahl1;
    protected int zahl2;
    protected int zahl3;

    /**
     * Ruft den Wert der zahl1-Eigenschaft ab.
     * 
     */
    public int getZahl1() {
        return zahl1;
    }

    /**
     * Legt den Wert der zahl1-Eigenschaft fest.
     * 
     */
    public void setZahl1(int value) {
        this.zahl1 = value;
    }

    /**
     * Ruft den Wert der zahl2-Eigenschaft ab.
     * 
     */
    public int getZahl2() {
        return zahl2;
    }

    /**
     * Legt den Wert der zahl2-Eigenschaft fest.
     * 
     */
    public void setZahl2(int value) {
        this.zahl2 = value;
    }

    /**
     * Ruft den Wert der zahl3-Eigenschaft ab.
     * 
     */
    public int getZahl3() {
        return zahl3;
    }

    /**
     * Legt den Wert der zahl3-Eigenschaft fest.
     * 
     */
    public void setZahl3(int value) {
        this.zahl3 = value;
    }

}
